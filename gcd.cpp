#include<iostream>
using namespace std;
int main()
{
	int num,num1,gcd;
	cout<<"enter the first number";
	cin>>num;
	cout<<"enter the second number";
	cin>>num1;
	for(int i=1;i<=num && i<=num1;i++)
	{
		if(num%i==0 && num1%i==0)
		{
			
			gcd=i;
			
		}
	}
	cout<<"GCD ="<<gcd;
	

	
}
