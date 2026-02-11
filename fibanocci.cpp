#include<iostream>
using namespace std;
int main()
{
	int n;
	cin>>n;
	int a=0,b=1;
	if(n==1)
	{
		cout<<a;
	}
	else
	{
		cout<<a<<" "<<b;
		for(int i=3;i<=n;i++)
		{
			int n=a+b;
			cout<<" "<<n;
			a=b;
			b=n;
		}
		
	}
	

}
