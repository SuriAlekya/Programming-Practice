#include<iostream>
using namespace std;
int main()
{
	int n,k;
	cin>>n>>k;
	int count=0;
	while(n!=0)
	{
		if((n%10)==k)
		{
			count++;
		}
		n=n/10;
	}
	cout<<count;
	
}
