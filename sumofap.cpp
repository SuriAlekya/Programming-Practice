#include<iostream>
#include<math.h>
using namespace std;
int main()
{
	int n,a,d,sum;
	cin>>n>>a>>d;
	sum=n/2*(2*a+(n-1)*d);
	cout<<sum;
	return 0;
}
