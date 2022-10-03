6)#include<stdio.h>
int sum(int);
int main()
{
    int a,r;
    printf("enter a number");
    scanf("%d",&a);
    r=sum(a);
    printf("%d=%d",a,r);
}
int sum(int n)
    {
        if(n==1)
            return 1;
        else
        {
          return(n+sum(n-1));
        }

    }

6)
#include<stdio.h>
int fact(int);
int main()
{
    int a,r;
    printf("enter a number");
    scanf("%d",&a);
    r=fact(a);
    printf("%d=%d",a,r);
}
int fact(int n)
    {
        if(n==1)
            return 1;
        else
        {
          return(n*fact(n-1));
        }

    }


7)
#include<stdio.h>
#include <math.h>
int main()
{
int r,x,y;
printf("enter a number");
scanf("%d",&x);
printf("enter a power");
scanf("%d",&y);
r=power(x,y);
printf("power of %d^%d=%d",x,y,r);
}

int power(int x,int y)
{
if(y==0)
return 1;
else
{
return x*power(x,y-1);
} }

8)
#include<stdio.h>
void print(int);
int main()
{
int n;
printf("enter a number");
scanf("%d",&n);
printf("%d",n);
}



void print(int n)
{
if(n==0)
return ;
else
{
print(n-1);
printf("%d",n)
} }

9)
#include<stdio.h>
int gcd(int);
int main()
{
int n,a;
printf("enter a number");
scanf("%d",&a);

printf("%d%d",);
}



void print(int n)
{
if(n==0)
return ;


10)
#include<stdio.h>
int fib(int);
int main()
{
    int r,n;
    printf("enter a number");
    scanf("%d",&n);
    r=fib(n);
    printf("%d=%d",n,r);
}
int fib(int a)
    {
        if(a==1)
            return 0;
        else if (a==2)
             return 1;
        else
          return(fib(a-1)+fib(a-2));


    }

11) #include<studio.h>
Void natural(int n); 
int main()
 { 
int n; 
printf("Enter a number: "); 
scanf("%d", &n); 
printf("Printing %d natural numbers: ",n); 
natural(n);
 }
 void natural(int n)
 {
 if (n==1) 
printf("%d ",n); 
else { natural(n-1); 
printf("%d ",n); 
} }

12)
#include<stdio.h>
Void reve(int n);
 int main() 
{
 int n;
 printf("Enter a number: "); 
scanf("%d",&n); 
printf("%d Natural numbers in reverse: \n",n);
 reve(n); 
} 
void reve(int n) 
{
 if (n==1)
 printf("%d\n",n); 
else { printf("%d ",n); 
reve(n-1);
 } }

13)
#include<stdio.h>
 int main()
 {
 int n,i;
 printf("Enter your array size : ");
 scanf("%d",&n);
 int arr[n];
 printf("Enter the Elements : ");
 for(i=0;i=n) return;
 printf("%d ",arr[i]);
 elearray(arr,i+1,n);
 }

14)
#include<stdio.h>
 int main() 
{ 
int arr[]={1,2,3,4,5,6};
 int size = sizeof(arr)/sizeof(arr[0]);
 reverse(arr,size);
 }
 void reverse(int a[],int n)
 { 
if(n==0) 
 else { printf("%d\n",a[n-1]);
 reverse(a,n-1); 
} }
15)
#include<stdio.h>
 int main()
 {
 char r[] = "shradha";
 reverse(r);
 }
 int reverse(char *s)
 {
 if (*s) { reverse(s+1);
 printf("%c", *s);
 } }
16)
#include<stdio.h>
 int main() 
{
 int n; 
printf("Enter a Number : ");
 scanf("%d",&n);
 printf("The reverse of %d is %d\n",n,reverse(n,0));
 }
 int sum=0; 
int reverse(int n, int sum) 
{
 if (n>0) return reverse(n/10,sum*10+n%10); 
return sum; 
}
