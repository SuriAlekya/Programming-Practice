#include<iostream>
using namespace std;
int main()
{
	int i,n;
	cout<<" enter the number"<<endl;
	cin>>n;
	for(int i=2;i<=n-1;i++)
	{
		if(num%i==0)
		{
			break;
		}
	}
	if(n==i)
	{
		cout<<"the number is prime"<<endl;
	}
	else
	{
		cout<<"the number is not prime"<<endl;
	}
	return 0;
	
}
