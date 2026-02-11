#include<iostream>
using namespace std;
int main()
{
	int n,sum=0,rem;
	cout<<"enter a positive number"<<endl;
	cin>>n;
	while(n>0)
	{
		rem=n%10;
		sum=sum+(n%10);
		n=n/10;
	}
	cout<<sum;
	return 0;
}
	

