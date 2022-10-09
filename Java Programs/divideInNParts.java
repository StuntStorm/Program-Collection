package JavaString;

public class divideInNParts {
    static void divide(String str, int n) {

        int sub_size;
        if (str.length() % n != 0) {
            System.out.println("Invalid Input");
            System.out.println("String size is not divisible by n");
            System.out.println("Try Again");
            return;
        }

        sub_size = str.length() / n;

        for (int i = 0; i < str.length(); i++) {
            if (i % sub_size == 0)
                System.out.println();
            System.out.print(str.charAt(i));
        }
    }

    public static void main(String[] args) {

        String str = "abcdefghijklmnopqr";
        System.out.println("The entered string is: " + str);
        int n = 6;
        System.out.println("On dividing the entered string into " + n + " equal parts, we have ");
        divide(str, n);
    }
}
