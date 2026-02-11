#include<iostream>
using namespace std;
int main()
{
	int n;
	cin>>n;
	int a[n];
	for(int i=1;i<=n-1;i++)
	cin>>a[i];
    bool b[n+1];
	for(int i=1;i<=n-1;i++)
	{
		b[a[i]]=true;
	}
	for(int i=1;i<=n;i++)
	{
		if(b[i]!=true)
		{
			cout<<i;
			break;
		}
	}
	
}
