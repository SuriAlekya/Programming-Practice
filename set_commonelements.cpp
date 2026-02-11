#include<bits/stdc++.h>
#include<iostream>
using namespace std;
int main()
{
	int m,n;
	set<int> s;
	cin>>m>>n;
	int a[m],b[n];
	for(int i=0;i<m;i++)
	{
		cin>>a[i];
	}
	for(int i=0;i<n;i++)
	{
		cin>>b[i];
		s.insert(b[i]);
	}
	
	for(int i=0;i<m;i++)
	{
		if(s.find(a[i])!=s.end())
		{
			cout<<a[i]<<" ";
		}
	}
	return 0;
}
