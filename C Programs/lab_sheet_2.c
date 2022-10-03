1.Write a program to read an array of integers of size 5 and print it. 

#include<stdio.h>
int main()
{
 float a[5];
 int i;
 for(i=0;i<=4;i++)
  {
     printf("enter number %d :",i+1);
     scanf("%f",&a[i]);
    }

   for(i=4;i>=0;i--)
   printf("%f",a[i]);



  }


2.Write a program to read an integer array and to display only the even numbers of 

#include<stdio.h>
int main()
{
    int b[10],i,n;
    printf("enter no. of elements to input");
    scanf("%d",&n);
    for(i=0;i<n;i++)
     {
         printf("enter  number %d ",i+1);
         scanf("%d",&b[i]);
     }
    for(i=0;i<n;i++)
    {

        if(b[i]%2==0)
        {


            printf("\t%d",b[i]);
        }

    }


}

3.Write a program to read a floating point array and to display it in the reverse order.  

#include<stdio.h>
int main()
{
 float a[5];
 int i;
 for(i=0;i<=4;i++)
  {
     printf("enter number %d :",i+1);
     scanf("%f",&a[i]);
    }

   for(i=4;i>=0;i--)
   printf("%f",a[i]);



  }

4.Write a program to implement linear search. 
#include <stdio.h>
int main()
{
 int arr[10],n,i,x;
 printf("Enter the size of the array (Max 10): ");
 scanf("%d",&n);
 printf("Enter %d elements: ",n);
 for (i=0;i<n;i++)
 scanf("%d",&arr[i]);
 printf("The array is: ");
 printf("[");for (i=0;i<n;i++) printf("%d, ",arr[i]);printf("\b\b]\n");
 printf("Enter the element to search for: ");
 scanf("%d",&x);
 for (i=0;i<n;i++)
 if (arr[i]==x)
 {
 printf("Element found at position: %d\n",i);
 break;
 }
}


 5.Write a program to accept 10 numbers from the user and to find out the largest and smallest of those. 

#include<stdio.h>
int main()
{
 int a[10],i,l,s;

 for(i=0;i<=9;i++)
  {
     printf("enter number %d :",i+1);
     scanf("%d",&a[i]);
    }
l=a[0];

  for(i=0;i<=9;i++)
  {
    if(a[i]>l)
      l=a[i];
  }
  printf("largest=%d",l);
 s=a[0];
  for(i=0;i<=9;i++)
  {
    if(a[i]<s)
      s=a[i];
  }
  printf("smallest=%d",s);

  }

6.Write a program to accept a set of numbers and to display the deviation of each number from the average. 
#include<stdio.h>
int main()
{
    int a[10],i,n,sum=0;
    float avg;
    printf("enter no. of elements to input");
    scanf("%d",&n);
    for(i=0;i<n;i++)
     {
         printf("enter  number %d ",i+1);
         scanf("%d",&a[i]);
         sum=sum+a[i];
    }
    avg=sum/n;
    for(i=0;i<n;i++)
     {
     printf("%f",a[i]-avg);

     }


}
7. Write a program to   accept two vectors of R5 and find out the sum of those two. (Vectors of R5 contains 5 numbers) 

#include<stdio.h>
int main()
{
    int a[5],b[5],sum[5],i;

    for(i=0;i<=4;i++)
     {
         printf("enter  number %d ",i+1);
         scanf("%d/n",&a[i]);

      }

        for(i=0;i<=4;i++)
     {
         printf("enter  number %d ",i+1);
         scanf("%d/n",&b[i]);

      }
      for(i=0;i<=4;i++)
         {
           sum[i]=a[i]+b[i];
            printf("%d",sum[i]);
           }

  }

8.Write a program to delete a number from an integer array. 


#include <stdio.h>
int main()
{
 int arr[10],n,d,i;
 printf("Enter the size of the array (Max 10): ");
 scanf("%d",&n);
 printf("Enter %d elements: ",n);
 for (i=0;i<n;i++) scanf("%d",&arr[i]);
 printf("The array is: ["); for (i=0;i<n;i++) printf("%d, ",arr[i]); printf("\b\b]\n");
 printf("Enter the element to be deleted: ");
 scanf("%d",&d);
 for (i=0;i<=n;i++) if (arr[i]==d) break;
 if (i==n)
 {
 printf("Element not found\n");
 return 0;
 }
 for (i=i;i<n-1;i++)
 arr[i]=arr[i+1];
 n=n-1;
 printf("After deletion: ["); for (i=0;i<n;i++) printf("%d, ",arr[i]); printf("\b\b]\n");
}


9. Write a program to insert an element in the correct position of a sorted integer array.

#include <stdio.h>
int main()
{
 int arr[11],i,n;
 printf("Enter the size of the array (Max 10): ");
 scanf("%d",&n);
 printf("Enter the array: ");
 for (i=0;i<n;i++)
 scanf("%d",&arr[i]);
 printf("The array is: ["); for (i=0;i<n;i++) printf("%d, ",arr[i]); printf("\b\b]\n");
 printf("Enter the element to insert: ");
 scanf("%d",&arr[n]);
 n++;
 sorting(arr,n);
 printf("The new sorted array is: ["); for (i=0;i<n;i++) printf("%d, ",arr[i]);
printf("\b\b]\n");
}
void sorting(int arr[],int s)
{
 int i,j,min,temp;
 for (i=0;i<s;i++)
 {
 min=arr[i];
 for (j=i;j<s;j++)
 if (arr[j]<arr[i])
 {
 temp=arr[j];
 arr[j]=arr[i];
 arr[i]=temp;
 }
 }
}

10. Write a program to merge two integer arrays of size 5 into a third array.
#include <stdio.h>
int main()
{
 int arr1[5],arr2[5],arr3[10],i;
 printf("Enter the first array (size 5): ");
 for (i=0;i<5;i++)
 scanf("%d",&arr1[i]);
 printf("Enter the second array (size 5): ");
 for (i=0;i<5;i++)
 scanf("%d",&arr2[i]);
 for (i=0;i<5;i++)
 {
 arr3[i]=arr1[i];
 arr3[i+5]=arr2[i];
 }
 printf("The merged array is [");for (i=0;i<10;i++) printf("%d, ",arr3[i]);printf("\b\b]\n");


11. Write a program to merge two sorted arrays into a single sorted array.
#include <stdio.h>
int main()
{
 int arr1[5],arr2[5],arr[10],i;
 printf("Enter the first array (size 5): ");
 for (i=0;i<5;i++)
 scanf("%d",&arr1[i]);
 printf("Enter the second array (size 5): ");
 for (i=0;i<5;i++)
 scanf("%d",&arr2[i]);
 sorting (arr1,5);
 sorting (arr2,5);
 printf("Array 1 sorted: ");
printarray(arr1,5);
 printf("Array 2 sorted: ");
printarray(arr2,5);
 for (i=0;i<5;i++)
 {
 arr[i]=arr1[i];
 arr[i+5]=arr2[i];
 }
 sorting (arr,10);
 printf("The sorted merged array is: ");
 arraysprint (arr,10);
}
void sorting(int arr[],int s)
{
 int i,j,min,temp;
 for (i=0;i<s;i++)
 {
 min=arr[i];
 for (j=i;j<s;j++)
 if (arr[j]<arr[i])
 {
 temp=arr[j];
 arr[j]=arr[i];
 arr[i]=temp;
 }
 }
}
void arraysprint(int arr[],int n)
{
 int i;
 printf("[");
 for (i=0;i<n;i++)
 printf("%d, ",arr[i]);
 printf("\b\b]\n");
}



