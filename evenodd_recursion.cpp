//if n is odd 3n+1;
//if n is even n/2


#include<iostream>
#include<bits/stdc++.h>
using namespace std;
void print(int n)
{
	if(n==1)
	{
		return;
	}
	else if(n%2==0)
	{
		cout<<"-->"<<n/2;
		print(n/2);
	}
	else
	{
		cout<<"-->"<<(n*3+1);
		print((n*3)+1);
	}

		
}
int main()
{
	int n;
	cin>>n;
	cout<<n;
	print(n);
}
