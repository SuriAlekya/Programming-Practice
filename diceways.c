#include<iostream>
using namespace std;
int dice(int n)
{
	if(n==0)
	{
		return 1;
	}
	if(n<0)
	{
		return 0;
	}
	return dice(n-1)+dice(n-2)+dice(n-3)+dice(n-4)+dice(n-5)+dice(n-6)
	
	
}
int main()
{
	int n;
	cin>>n;
	cout<<dice(n);
	return 0;
	
}
