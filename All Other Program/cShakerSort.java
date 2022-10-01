import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class cShakerSort {

    // Actual Sorting Algorithm
    static void CocktailSorter (int[] arr){

        boolean swp = true;
        while (swp == true) {

            swp = false;
            int i = 0;

            // Forward Traversal Starts Here
            try {
                printSpaces(20);
                System.out.print("Press Enter to Continue...");
                System.in.read();
            } catch (IOException e) {
                e.printStackTrace();
            }

            System.out.println();
            printSpaces(55);
            System.out.println("Traversing Forward ...");


            for(; i < arr.length - 1; i++){
                if(arr[i] > arr[i + 1]){
                    int temp = arr[i+1];
                    arr[i+1] = arr[i];
                    arr[i] = temp;
                
                    swp = true;

                    System.out.println();
                    printSpaces(50);
                    System.out.println("Swapping index " + Integer.toString(i) + " and index " + Integer.toString(i + 1));
                    printSwap(arr, i, 2);

                }
            }

            // If no more Changes are needed, stop the algorithm
            if (swp == false){
                System.out.println();
                printSpaces(50);
                System.out.println("No Further Changes Required");
                break;
            }

            printSpaces(20);
            System.out.println("=======================================================================================");

            try {
                printSpaces(20);
                System.out.print("Press Enter to Continue...");
                System.in.read();
            } catch (IOException e) {
                e.printStackTrace();
            }

            // Backward Traversal Starts Here
            System.out.println();
            printSpaces(55);
            System.out.println("Traversing Backward ...");

            for(;i > 0; i--){
                if(arr[i] < arr[i - 1]){
                    int temp = arr[i-1];
                    arr[i-1] = arr[i];
                    arr[i] = temp;

                    swp = true;

                    System.out.println();
                    printSpaces(50);
                    System.out.println("Swapping index " + Integer.toString(i) + " and index " + Integer.toString(i - 1));
                    printSwap(arr, i, 1);

                }
            }

            printSpaces(20);
            System.out.println("=======================================================================================");

            // If no more Changes are needed, stop the algorithm
            if (swp == false){
                System.out.println();
                printSpaces(50);
                System.out.println("No Further Changes Required");
                break;
            }
        }
    }

    // Printing the Array along with where the swap is taking place (Denoted by a '-')
    private static void printSwap(int[] arr, int x, int op) {

        printSpaces(45);
        System.out.print("Current Array is : ");
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i]);

            if(i == x - 1 && op == 1){
                System.out.print(" - ");
            }
            else if (i == x && op == 2){
                System.out.print(" - ");
            }
            else{
                System.out.print(" ");
            }

            
        }
        System.out.println('\n');

    }

    // Used as a Formatting Trick to align the output lines
    private static void printSpaces(int n){
        for(int i = 0; i < n; i++){
            System.out.print(" ");
        }
    }

    // Code to input the Array
    private static int[] inputArr() {

        BufferedReader bi = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("\n\nEnter the array you want to sort in one line separated by spaces : ");
        
        String[] strNums;

        try {
            strNums = bi.readLine().split(" ");

            int[] arr = new int[strNums.length];
            for (int i = 0; i < strNums.length; i++) {
                arr[i] = Integer.parseInt(strNums[i]);
            }

            return arr;

        } catch (IOException e) {
            e.printStackTrace();
        }
        
        return new int[0];
    }

    public static void main(String[] args) {
        
        int [] arr = inputArr();
        
        System.out.println();
        printSpaces(20);
        
        for(int i = 0; i < 86; i++){
            System.out.print("=");
        }

        System.out.println('\n');
        printSpaces(30);
        System.out.print("Cocktail Shaker Sorting Algorithm Visualizer  -  By Akshit Sudheer Kumar");

        System.out.println('\n');
        printSwap(arr, -1, 0);

        printSpaces(20);
        for(int i = 0; i < 86; i++){
            System.out.print("=");
        }
        System.out.println();
        
        CocktailSorter(arr);

        System.out.println();
        printSpaces(35);
        System.out.print("Sorting Complete. Final Sorted Array is : ");
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i]);
            System.out.print(" ");
        }
        System.out.println("\n\n");
        printSpaces(20);
        System.out.println("=======================================================================================");

    }
}