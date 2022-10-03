public class small_large
{
	public static void main(String args[]) 
		{
			int a[]= {4,23,6,20,94,22,100};
			int i,small=a[0],large=a[0];
			for (i=0;i<a.length;i++)
			{
				if (large<a[i]) 
				{
					large=a[i];
				}
				else if(small>a[i]) 
				{
					small=a[i];
				}
			}
			System.out.println("Smallest : "+small);
			System.out.println("Largest : "+large);	
	}
}


