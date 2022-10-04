//declare char array and read a string from user and count number of characters in string
#include<stdio.h>
int main()
{

    char a[20];
    int i=0;
    printf("enter name: ");
    scanf("%s",a);
    while(a[i]!='\0')
        {i++;
        }
   printf("%d",i);
}
