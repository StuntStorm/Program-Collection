1)
#include<stdio.h>
int main()
{
    int rule;
    for (rule=1;rule<=10;rule++)
        printf("\nshradha");
}

2)
#include<stdio.h>
int main()
{
    int rule;
    for (rule=1;rule<=10;rule++)
        printf("%d \n",rule);

}
Or
#include<stdio.h>
int main()
{
    int rule;
    rule=1;
    while(rule<=10)
    {
       printf("%d\n",rule);
       rule++;
    }

}
3)
#include<stdio.h>
int main()
{
    int rule,n;
    rule=1;
    printf("enter a value = ");
    scanf("%d",&n);
    while(rule<=n)
    {
       printf("%d\n",rule);
       rule++;
    }
}

4)
#include<stdio.h>
int main()
{
    int rule,n;
    printf("enter a value = ");
    scanf("%d",&n);
    rule=n;
    while(rule>=1)
    {
       printf("%d\n",rule);
       rule--;
    }

}
5)
#include<stdio.h>
int main()
{
    int rule,n;
    printf("enter a value = ");
    scanf("%d",&n);
    for(rule=0;rule<=n;rule+=2)
    {
       printf("%d\n",rule);

    }

}
6)
#include<stdio.h>
int main()
{
    int rule,sum=0,n;
    printf("enter a value = ");
    scanf("%d",&n);
    for(rule=1;rule<=n;rule++)
    {
       sum=sum+rule;
    }
    printf("sum=%d\n",sum);
}
7)
#include<stdio.h>
int main()
{
    int rule,n;
    printf("enter a value = ");
    scanf("%d",&n);
    for(rule=1;rule<=n;rule++)
    {
       printf("*",rule);
    }

}
8) #include<stdio.h>
int main()
{
    int rule,n;
    printf("enter a value = ");
    scanf("%d",&n);
    for(rule=1;rule<=n;rule++)
    {
       printf("*",rule);
    }

}

9) 
#include<stdio.h>
int main()
{
    int rule,n;
    printf("enter a value = ");
    scanf("%d",&n);
    for(rule=1;rule<=n;rule++)
    {
       printf("*\n",rule);
    }

}

10) 
#include<stdio.h>
int main()
{
    int rule,n,m,sum=0;
    printf("enter a value = ");
    scanf("%d",&n);
    printf("enter a value = ");
    scanf("%d",&m);
    for(rule=n;rule<=m;rule++)
    {
       sum=sum+rule;
    }
    printf("sum=%d\n",sum);
}
11)
#include<stdio.h>
int main()
{
    int rule,n,large;
    printf("enter 10 value = ");
    scanf("%d",&n);
    large=n;
    for(rule=2;rule<=10;rule++)
    {
       scanf("%d",&n);
       if(n>large);
       large=n;
    }
    printf("largest num = %d",large);
}
12)
#include<stdio.h>
int main()
{
    int opt,n1,n2;
    do
    {
        printf("1.sum\n,2.diff\n,3.multi,4.quotient\n,5.exit");
        printf("\n enter your option");
        scanf("%d",&opt);
        if(opt==1)
        {
            printf("enter 2 num");
            scanf("%d%d",&n1,&n2);
            printf("sum=%d\n", n1+n2);

        }
        else if(opt==2)
        {
            printf("enter 2 num");
            scanf("%d%d",&n1,&n2);
            printf("diff=%d\n", n1-n2);

        }
        else if(opt==3)
        {
            printf("enter 2 num");
            scanf("%d%d",&n1,&n2);
            printf("multi=%d\n", n1*n2);

        }
        else if(opt==4)
        {
            printf("enter 2 num");
            scanf("%d%d",&n1,&n2);
            printf("reminder=%d\n", n1%n2);

        }
    }while(opt!=5);
}
12)
#include<stdio.h>
int main()
{
int n, rev=0, rem;
printf(”enter a number”);
scanf “%d”,&n);
while(n!=0)
{
rem=n%10;
rev=rev*10+rem;
n/=10;
}
printf(&quot;reversed number: %d&quot;, rev);
}
13) #include<studio.h>
#include<stdio.h>

void squareAndCube();

int main()
{
squareAndCube();
}

void squareAndCube()
{
int i,n,r,s;
printf(“Enter a number:” );
scanf(“%d”,&n);
r = pow(i,2);
s = pow(i,3);
for (i=1;i<=10;=n;i++)
{
Printf(“The Square and Cube of %d is %d and %d\n”,i,r,s);
}
}
14) #include<stdio.h>

void count();

int main()
{
count();
}

void count()
{
char x;
int u=0,l=0,n=0;
printf(“Keep entering characters ( “*”to stop ): \n”);
scanf(”%c”,&x);
do
{
if (x>=65  && x<=90)
u++;
else if (x>=48 && x<=57)
n++;
else if (x>=97 & & x<=122)
l++;
scanf(“%c”,&x);
}
while (x!=’*’);

Printf(“-----------------------------\nUppercase count = %d\nLowercase count = %d\nNumber count =
%d\n-----------------------------\n”,u,l,n);

15)
#include<stdio.h>
int main()
{
int n,sum=0,a;
printf(“enter a number”);
scanf(“%d”,&n);
while(n!=0)
{
a=n%10;
sum=sum+a;
n=n/10;
}
Printf(“Sum : %d”,sum);
}
16)
16)
// Read a number from the user and find the sum that number and its reverse.

#include <studio.h>

int sumOfReverse(int n);

int main()
{
int n,x;
printf(“Enter a number: “);
scanf”%d”&n);
x=sumOfReverse(n);
printf”Sum of %d and %d is %d\n”;,n,x,n+x);
}

int sumOfReverse(int n)
{
int value=0;
do
{
value = value*10 + n%10;
n/=10;
}while(n>0);

return value;
}

17)
/* Read integers from the user until 999 is entered.
Count the number of positive, negative and zeroes entered by the user.
*/

#include <studio.h>

void count();

int main()
{
count();
}

void count()
{
int x,p=0,n=0,z=0;
printf(“Enter numbers: “);
scanf(“%d”,&x);
do
{
if (x>0)

p++;
else if (x<0)
n++;
else
z++;
scanf(“%d”,&x);
}
while (x!=999);
printf(”You entered %d positive numbers, %d negative numbers and %d zeroes.\n”,p,n,z);
}

18)
//Write a program to print the list of all leap years from 1900 to 2100.

#include <studio.h>

void leapYear();

int main()
{
leapYear();
}

void leapYear()
{

int year;
for (year=1900;year<=2100;year++)
{
if ((year%4==0 & & year%100!=0)||(year%400==0))
printf(“%d\n”,year);
}
}

19)
//Enter a number and print its multiplication table.

#include <studio.h>

void multTable(int n);

int main()
{
int n;
printf(“Enter a number: “);
scanf(“%d”,&n);
multTable(n);
}

void multTable(int n)
{

for (int i=0;i<=10;i++)
{
Printf(“%d x %d = %d\n”,n,i,n*i);
}
}

20)
//Implement the power function to calculate xn

#include <studio.h>

int power(int a,int b);

int main()
{
int x,n,g;
printf(“Enter the base:”);
scanf(“%d”&& x);
printf(“Enter the power:”);
scanf(“%d”&&n);
g=power(x,n);
printf(“;%d^%d = %d”,x,n,g);
}

int power(int a,int b)

{
int i,result=1;
for (i=0;i<b;i++)
{
result*=a;
}
return result;
}
