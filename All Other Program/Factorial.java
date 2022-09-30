package Recursion;

public class Factorial {
    public static void main(String[] args) {
        System.out.println(fact(5));
    }

    static int fact(int x){
        if (x == 0) return 1;
        if (x == 1) return 1;
        return x * fact(x - 1);
    }
}
