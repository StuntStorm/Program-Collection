package Recursion;

public class PowerCalculate {
    public static void main(String[] args) {
        System.out.println(pow(3, 3));
    }

    // x raise to power y/
    static int pow(int x, int y){
        if(y == 0) return 1;
        return x * pow(x, y-1);
    }
//    (2, 3)
//    2 * (2, 2)
//    ``````--> 2 * (2, 1)
//    ````````````````--> 2 * 1
}
