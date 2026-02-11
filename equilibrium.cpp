#include<iostream>
#include<bits/stdc++.h>
using namespace std;
int  main()
{
	int n;
	cin>>n;
	int a[n];
	for(int i=0;i<n;i++)
	{
		cin>>a[i];
	}
	for(int mid=0;mid<n;mid++)
	{
	int sum1=0,sum2=0;
	for(int i=0;i<mid;i++)
	{
		sum1=sum1+a[i];
		 
	}
	for(int i=mid+1;i<n;i++)
	{
		sum2=sum2+a[i];
	}
	if(sum1==sum2)
	{
		cout<<mid<<" ";
	}
}
	return 0;


}
