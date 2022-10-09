package JavaString;

public class removeSpace {
    public static void main(String[] args) {
        String str = "      Hemant     Kumar   Sharma        ";

        str = str.replaceAll("\\s", "");

        System.out.println(str);
    }
}
