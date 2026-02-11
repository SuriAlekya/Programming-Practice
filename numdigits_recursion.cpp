#include<iostream>
#include<bits/stdc++.h>
using namespace std;
int count(int n,int c)
{
	if(n==0)
	{
		return c;
	}
	c++;
	count(n/10,c);
	
	
	
}
int main()
{
	int n;
	cin>>n;
	cout<<count(n,0);
	
}
