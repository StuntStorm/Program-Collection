#include<iostream>
#include<cmath>
using namespace std;
int main()
{
    int a, b, result = 0, i = 0, j = 0, n = 1;
    cin>>a>>b;
    for(;abs(a-b)!=0;)
    {
        if(n%2)
        {
            result += ++j;
            n++;
            if(a>b)
                a--;
            else
                a++;
        }
        else
        {
            result += ++i;
            n++;
            if(a<b)
                b--;
            else
                b++;
        }
    }
    cout<<result;
    return 0;
}
