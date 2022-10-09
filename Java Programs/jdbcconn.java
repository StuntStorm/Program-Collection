import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class jdbcconn {
    public void Create(Connection c) throws SQLException {
        Statement statement = c.createStatement();
        String sql = "CREATE TABLE book " +
                "(id INT PRIMARY KEY     NOT NULL," +
                " title CHAR(50)    NOT NULL, " +
                " author CHAR(50)     NOT NULL, " +
                " price    REAL, " +
                " qty      INT)";
        statement.executeUpdate(sql);
        sql = "INSERT INTO book (id,title,author,price,qty) "
                + "VALUES (1001, 'Java for dummies', 'Tan Ah Heck', 11.11, 11);";
        statement.executeUpdate(sql);

        sql = "INSERT INTO book (id,title,author,price,qty) "
                + "VALUES (1002, 'More Java for dummies', 'Tan Ah Heck', 22.22, 22);";
        statement.executeUpdate(sql);

        sql = "INSERT INTO book (id,title,author,price,qty) "
                + "VALUES (1003, 'More Java for more dummies', 'Muhammad Ali', 33.33, 33);";
        statement.executeUpdate(sql);

        sql = "INSERT INTO book (id,title,author,price,qty) "
                + "VALUES (1004, 'A cup of Java', 'Kumar', 44.44, 44);";
        statement.executeUpdate(sql);

        sql = "INSERT INTO book (id,title,author,price,qty) "
                + "VALUES (1005, 'A Teaspoon of Java', 'Kevin Jones', 55.55, 55);";
        statement.executeUpdate(sql);
    }
    public void Display(Connection c) throws SQLException {
        Statement stmt = c.createStatement();
        ResultSet rs = stmt.executeQuery("select * from book");
        while (rs.next()) {
            int id = rs.getInt("id");
            String name = rs.getString("title");
            String author = rs.getString("author");
            float price = rs.getFloat("price");
            int qty = rs.getInt("qty");
            System.out.println("id = " + id);
            System.out.println("title = " + name);
            System.out.println("author = " + author);
            System.out.println("price = " + price);
            System.out.println("quantity = " + qty);
            System.out.println();
        }
    }

    public void Update(Connection c) throws SQLException {
        Statement stmt = c.createStatement();
        System.out.print("Enter the id of the book you want to update: ");
        Scanner sc = new Scanner(System.in);
        int i = sc.nextInt();
        System.out.print("Enter new price: ");
        float p = sc.nextFloat();
        String sql = "UPDATE book set price = " + p + " where ID=" + i + ";";
        stmt.executeUpdate(sql);
    }

    public void Search(Connection c) throws SQLException {
        Statement stmt = c.createStatement();
        System.out.print("Enter lower bounds for price: ");
        Scanner sc = new Scanner(System.in);
        float l = sc.nextFloat();
        System.out.print("Enter upper bounds for price: ");
        float u = sc.nextFloat();
        String sql = "Select * from book where price > " + l + " and price < " + u + ";";
    }

    public void Delete(Connection c) throws SQLException {
        Statement stmt = c.createStatement();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter id of the element you want to delete: ");
        int i = sc.nextInt();
        String sql = "delete from book where id=" + i + ";";
        stmt.executeUpdate(sql);
    }

    public void Insert(Connection c) throws SQLException{
        Statement stmt = c.createStatement();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Details of the book");
        System.out.print("id: ");
        int i = sc.nextInt();
        System.out.print("title: ");
        String t = sc.nextLine();
        System.out.print("author: ");
        String a = sc.nextLine();
        System.out.print("price: ");
        float p = sc.nextFloat();
        System.out.print("quantity: ");
        int q = sc.nextInt();
        System.out.println("insert into book values (" + i + "," + t+"," + a +","+p+","+q+");");
    }
}
