#include<iostream>
using namespace std;
int main(){
	int a,b;
	cin>>a>>b;
	int sum=0;
	while(a!=0)
	{
		sum=sum+b;
		a--;
	}
	cout<<sum;
}
