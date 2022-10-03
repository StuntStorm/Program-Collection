#include<stdio.h>
void test();
struct person
{
    int height;
    int weight;
}anu,binu={50,160};
int main()
{
    struct person sunu={10,50},manu;
    test();
}
void test ()
{
printf("\n details of anu\n");
printf("height=%d weight=%d,",anu.height,anu.weight);
printf("\n details of binu\n");
printf("height=%d weight=%d,",binu.height,binu.weight);
//printf("\n details of sunu\n");
}
Output=0

2)
Sunu and manu undeclared as it is not initialized
3)
#include<stdio.h>
void test();
struct person
{
    int height;
    int weight;
}anu,binu,sunu,manu;
int main()
{
    struct person sunu={10,50},manu;
    test();
}
void test ()
{
printf("\n details of anu\n");
printf("height=%d weight=%d,",anu.height,anu.weight);
printf("\n details of binu\n");
printf("height=%d weight=%d,",binu.height,binu.weight);
printf("\n details of sunu\n");
printf("height=%d weight=%d,",sunu.height,sunu.weight);
printf("\n details of manu\n");
printf("height=%d weight=%d,",manu.height,manu.weight);
printf("\n details of jinu\n");
printf("height=%d weight=%d,",jinu.height,jinu.weight);}
Output
we wont be able to initialize it as 
int height =10; /int weight =20;this will give us an error as we cannot initialize values in the template

d) 
#include<stdio.h>
void test();
struct person
{
    int height;
    int weight;
}anu={20,100},binu={30,90},sunu,jinu={100},manu;
int main()
{
    struct person sunu={10,50},manu;
    test();
}
void test ()
{
    anu=binu;
    printf("\n details of anu\n");
    printf("height=%d weight=%d,",anu.height,anu.weight);
    printf("\n details of binu\n");
    printf("height=%d weight=%d,",binu.height,binu.weight);
    printf("\n details of sunu\n");
    printf("height=%d weight=%d,",sunu.height,sunu.weight);
    printf("\n details of manu\n");
    printf("height=%d weight=%d,",manu.height,manu.weight);
    printf("\n details of jinu\n");
    printf("height=%d weight=%d,",jinu.height,jinu.weight);
}
4)
#include struct date 
{
 int day;
 int month;
 int year;
 };
 struct student {
 char name[20];
 int rollno; 
float cgpa;
 struct date dob;
 };
 void readdetails() 
{
 struct student stud[5];
 int i;
 for(i=0;i<=4;i++)
 {
 printf("Enter the Name : ");
 scanf("%s",stud[i].name); 
printf("Enter the Roll no : ");
 scanf("%d",&stud[i].rollno);
 printf("Enter the CGPA : ");
 scanf("%f",&stud[i].cgpa);
 printf("Enter the Day : ");
 scanf("%d",&stud[i].dob.day);
 printf("Enter the Month : ");
 scanf("%d",&stud[i].dob.month);
 printf("Enter the Year : ");
 scanf("%d",&stud[i].dob.year);
 }}
 void display()
 {
 int i; for(i=0;i<=4;i++) 
{ printf("Name : %s\n",stud[i].name);
 printf("Roll no : %d\n",stud[i].rollno);
 printf("CGPA : %f\n",stud[i].cgpa); 
printf("Date of Birth : %d/%d/%d\n",stud[i].dob.day,stud[i].dob.month,stud[i].dob.year); } }
void main()
 {
 void readdetails();
 void display(); 
readdetails();
 display(); 
}
5)
#include<stdio.h>
void readdata();
void displaydata();
struct Student
{
    int rollno;
    char name[25];
    float cgpa;
    struct date
    {
        int day;
        int month;
        int year;
    }dob;
};
struct Student s[5];
int main()
{
    readdata();
    displaydata();
}
void readdata()
{
    int i;
    for(i=0;i<5;i++)
    {
        printf("Enter values for person %d",i+1);
        scanf("%s %d %f");
    }
}
void displaydata()
{
    int i;
    for(i=0;i<5;i++)
    {
        printf("The values for person %d are %s, %d %f",i+1,s[i].name,s[i].rollno,s[i].cgpa);
    }
}

