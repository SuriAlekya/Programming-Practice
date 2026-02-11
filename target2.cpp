#include<bits/stdc++.h>
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
	sort(arr,arr+n);
	int i=0,j=n-1;
	while(i<j)
	{
		int sum=arr[i]+arr[j];
		if(sum>t)
		{
			j--;
		}
		else if(sum<t)
		{
			i++;
		}
		else
		{
			flag=1;
			break;
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
