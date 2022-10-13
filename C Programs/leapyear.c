#include <iostream>

using namespace std;

int main()
{
    int year;
    cin>>year;
    if(year%4==0)
    {
        if(year%100==0)
    {
    if(year%400==0)
    cout<<year<<"leapyear";
    else
    cout<<year<<"not leapyear";
}
else
cout<<year<<"leap year";
}
else
cout<<year<<"not a leap year";
    return 0;
}
