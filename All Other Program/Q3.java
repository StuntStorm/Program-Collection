import java.util.Scanner;


class Q3
{
	public static void main(String args[])
	{
		int a,b,c;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the First Number : ");
		a = sc.nextInt();
		System.out.println("Enter the Second Number : ");
		b = sc.nextInt();
		System.out.println("Enter the Third Number : ");
		c = sc.nextInt();
		if(a>b && a>c)
		{	
			System.out.println(a+" is the Biggest Number");
		}
		else if(b>a && b>c)
		{
			System.out.println(b+" is the Biggest Number");
		}
		else
		{
			System.out.println(c+" is the Biggest Number");
		}
		
	} 

}
