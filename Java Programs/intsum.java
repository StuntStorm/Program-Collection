import java.util.*;
public class intsum
{
	public static void main(String a[])
	{
		Scanner sc=new Scanner(System.in);  
		System.out.print("Enter the First Number : ");  
		int f= sc.nextInt();   
		System.out.print("Enter the Second Number : ");  
		int g= sc.nextInt();  
		System.out.print("Sum of integer : "+sum(f,g)+"\n");  
		 
	
	}
	public static int sum(int a,int b)
	{
		int c = a + b;
		return c;
	}

}
