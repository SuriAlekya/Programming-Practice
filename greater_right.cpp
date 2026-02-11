#include<iostream>
#include<bits/stdc++.h>
using namespace std;
int main()
{
	int n;
	cin>>n;
	int arr[n];
	for(int i=0;i<n;i++)
	{
		cin>>arr[i];
	}
	/*for(int i=0;i<n;i++)
	{
		int flag=0;
		for(int j=i+1;j<n;j++)
		{
			if(arr[j]>arr[i])
			{
				flag=1;
				cout<<arr[j]<<" ";
				break;
			}
		}
		if(flag==0)
		cout<<-1<<' ';
	}*/
   /*	int i=0,j=i+1;
	while(i<n)
	{
		if(arr[i]<arr[j])
		{
			cout<<arr[j]<<' ';
			i++;
			j=i;
		}
		if(j>=n-1)
		{
			cout<<-1;
			i++;
			j=i;
		}
		j++;
	}*/
	
	
	
	//using stack
	stack<int>st;
	
}
