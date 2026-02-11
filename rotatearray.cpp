#include<bits/stdc++.h>
using namespace std;
int main()
{
	int n,k;
	cin>>n;
	int a[n];
	for(int i=0;i<n;i++)
	{
		cin>>a[i];
	}
	cin>>k;
	sort(a,a+n);
	while(k!=0)
	{
		int temp=a[0];
		for(int i=1;i<n;i++)
		{
			a[i-1]=a[i];
		}
		a[n-1]=temp;
		k--;
	}
		for(int i=0;i<n;i++)
		{
			cout<<a[i]<<" ";
		}
}
