import java.util.*;
public class check
{
	public static void main(String a[])
	{    
        	int array[]= {10,15,20,30,50,70,90};    
       	Scanner sc=new Scanner(System.in);  
		System.out.print("Enter First Number : ");  
		int key1= sc.nextInt(); 
		System.out.print("Enter Second Number : ");  
		int key2= sc.nextInt();
		int key=key1*key2;  
		int r=check(array, key);
		if(key%2==0)
		{
			if (r>=0)
			{
      	  			System.out.println(key+" is Present!");   
      	  		} 
      	 		else
      	 		{
      	 			System.out.println(key+" is NOT Present!");  
      	 		}
      	 	}
		else
		{
			System.out.println(key+" is NOT a EVEN Product");  
		}
    	}  
	public static int check(int a[], int key)
	{    
        	for(int i=0;i<a.length;i++)
       	 {    
          	  if(a[i] == key)
          	  {    
         	       return i;    
          	  }    
        	}    
        return -1;    
    }       
}   
