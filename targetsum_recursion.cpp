//number of ways to get target without repetation


#include<iostream>
#include<algorithm>
using namespace std;
int target(int a[],int i,int n,int t)
{
	if(t<0 || i==n)
	{
		return 0;
	}
	if(t==0)
	{
		return 1;
	}
	return target(a,i+1,n,t-a[i])+target(a,i+1,n,t);
	
}
int main()
{
	int n;
	cin>>n;
	int a[n];
	for(int i=0;i<n;i++)
	{
		cin>>a[n];
	}
	int t;
	cin>>t;
	cout<<target(a,0,n,t);
	sort(a,a+n);

	
}
