package Recursion;

public class SumOfNaturalNumbers {
    public static void main(String[] args) {
        System.out.println(sum(4));
    }

    static int sum(int x){
        if (x < 1) return 0;
        if (x == 1) return 1;
        return x + sum(x - 1);
    }
}