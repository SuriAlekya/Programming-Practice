#include<iostream>
#include<algorithm>
using namespace std;
int coins(int arr[],int t,int i,int n,int cnt)
{
	if(t<0 || i==n)
	{
		return INT_MAX;
	}
	if(t==0)
	{
		return  cnt;
	}
	return min(coins(arr,t,i+1,n,cnt),coins(arr,t-arr[i],i,n,cnt+1));
}
int main()
{
	int n;
	cin>>n;
	int arr[n];
	for(int i=0;i<n;i++)
	{
		cin>>arr[i];
	}
	int t;
	cin>>t;
	cout<<coins(arr,t,0,n,0);
}
