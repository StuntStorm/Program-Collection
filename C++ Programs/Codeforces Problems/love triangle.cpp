#include<iostream>
using namespace std;
int main()
{
	int n,i;
	bool flag = false;
	cin >> n;
	int *a = (int *)malloc((sizeof(int)*(n+1)));
	int j, t1, t2;
	for (i = 1; i <= n; i++)
	{
		cin >> a[i];
	}
	for (i = 1; i <= n; i++)
	{
		j = a[i];
		t1 = a[j];
		t2 = a[t1];
		if ((a[j] == t1) && (a[t1] == t2) && (a[t2] == j))
			flag = true;
	}
	if (flag == true)
		cout << "YES";
	else
		cout << "NO";
	//system("pause");
	return 0;
}
