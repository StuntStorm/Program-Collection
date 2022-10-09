import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Scanner;


public class jdbc {
    public static void main(String[] args) throws SQLException {
        Connection connection;
        try {
            Class.forName("org.postgresql.Driver");
            connection = DriverManager.getConnection("jdbc:postgresql://localhost/eBookshop", "postgres", "007sA!007");
            if (connection != null) {
                System.out.println("Database Opened");
            }
            assert connection != null;
            jdbcconn obj = new jdbcconn();
            obj.Create(connection);
            int ch;
            Scanner sc = new Scanner(System.in);
            do{
                System.out.println("Enter 1 to display");
                System.out.println("Enter 2 to update");
                System.out.println("Enter 3 to search");
                System.out.println("Enter 4 to delete");
                System.out.println("Enter 5 to insert");
                System.out.println("Enter 6 to exit");
                ch = sc.nextInt();
                if(ch==2)
                    obj.Update(connection);
                if(ch==3)
                    obj.Search(connection);
                if(ch==4)
                    obj.Delete(connection);
                if(ch==5)
                    obj.Insert(connection);
                obj.Display(connection);
            }while(ch!=6);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        System.out.println("Database Closed");
    }
}
