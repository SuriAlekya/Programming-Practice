#include<iostream>
using namespace std;
int main()
{
	int n,t,flag=0;
	cin>>n;
	int arr[n];
	for(int i=0;i<n;i++)
	{
		cin>>arr[i];
	}
	cin>>t;
	for(int i=0;i<n;i++)
	{
		for(int j=i+1;j<n;j++)
		{
			if(arr[i]+arr[j]==t)
			{
				flag=1;
				break;
			}
		}
	}
	if(flag==1)
	{
		cout<<"true";
	}
	else
	{
		cout<<"false";
	}
}
