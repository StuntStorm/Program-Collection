#include<iostream>
using namespace std;
int main()
{
    long long int n,m,a,b, cost = 0, x;
    cin>>n>>m>>a>>b;
    if(n % m)
    {
        x = n%m;
        cost = x*b;
        x = m - x;
        if(x*a < cost)
            cost = x*a;
    }
    cout<<cost;
    return 0;
}
