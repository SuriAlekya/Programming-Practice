#include<iostream>
#include<bits/stdc++.h>
using namespace std;
int main()
{
	int n;
	cin>>n;
	int a[n],b[n];
	for(int i=0;i<n;i++)
	{
		cin>>a[i];
	}
	for(int i=0;i<5;i++)
	{
		cin>>b[i];
	}
	map<int,int> mp;
	for(int i=0;i<n;i++)
	{
		mp[a[i]]++;
	}
	for(int i=0;i<n;i++)
	{
		mp[b[i]]--;
	}
	for(auto x:mp)
	{
		if(x.second==0)
		cout<<x.first<<" ";
	}
}
		
