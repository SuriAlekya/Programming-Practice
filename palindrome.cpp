#include<iostream>
using namespace std;
int main()
{
	int n;
	cin>>n;
	int num=n,rev=0;
	while(n!=0)
	{
		int r=n%10;
		rev=rev*10+r;
		n=n/10;
	}
	if(num==rev)
	{
		cout<<"it is a palindrome";
	}
	else
	{
		cout<<"not a palindrome";
	}
	
}
