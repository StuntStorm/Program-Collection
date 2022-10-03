#include<stdio.h>
int main()
{
 int sum,n,a;
 printf("enter no.");
 scanf("%d",&n);
 a=sum(n);
 printf("sum=%d",sum));



}
int sum(n);
{


 int sum(int n)
 {
   if(n==1)
    return 1;
   else
   {
     return(n+sum(n-1));
   }
 }
}
