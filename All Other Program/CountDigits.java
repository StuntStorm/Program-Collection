package Recursion;

public class CountDigits {
    public static void main(String[] args) {
        System.out.println(count(123));
    }

    static int count(int n){
        if (n==0) return 0;
        return 1 + count(n/10);
    }
}
