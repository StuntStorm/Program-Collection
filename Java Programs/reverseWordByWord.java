package JavaString;

import java.util.Scanner;

public class reverseWordByWord {
    public static void main(String[] args) {
        String str;
        System.out.println("Enter a string: ");
        Scanner scanner = new Scanner(System.in);
        str = scanner.nextLine();
        scanner.close(); 
        String reversed = reverseString(str);
        System.out.println("The reversed string is: " + reversed);
    }

    public static String reverseString(String s) {
        if (s.isEmpty()) 
            return s;
        return reverseString(s.substring(1)) + s.charAt(0); 
    }
}
