package JavaString;

import java.util.Scanner;

public class subsetOfString {
    static void subString(char str[], int n)
    {
         for (int t = 1; t <= n; t++) 
         {
             for (int i = 0; i <= n - t; i++) 
             {
                  
                 int j = i + t - 1;
                 for (int k = i; k <= j; k++) 
                 {
                     System.out.print(str[k]);
                 }
  
                 System.out.println();
             }
         }
     } 
     public static void main(String[] args) 
     {
         Scanner sc=new Scanner(System.in);
         String str1 =sc.nextLine();
         System.out.println("Enter the string is "+str1);
         sc.close();
         char str[] = str1.toCharArray();
         System.out.println("All the substrings of the above string are: ");
         subString(str, str.length);
     }
 }
 
