package JavaString;

public class replaceSpace {
    public static void main(String[] args) {
        String str = "      Hemant     Kumar   Sharma        ";

        str = str.replaceAll("", "@");

        System.out.println(str);
    }
}
