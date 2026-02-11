#include<iostream>
#include<bits/stdc++.h>
using namespace std;
int main()
{
	int n;
	cin>>n;
	int a[n];
	for(int i=0;i<n;i++)
	{
		cin>>a[i];
	}
	for(int i=0;i<n;i++)
	{
		for(int j=i;j<n;j++)
		{
			cout<<"[";
		for(int k=i;k<=j;k++)
		{
			cout<<a[k];
		if(k<j)
		{
			cout<<",";
		}
		
	}
			cout<<"]";

	
	}
	}
	return 0;
	
}
