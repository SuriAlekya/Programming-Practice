#include<bits/stdc++.h>
using namespace std;
void solve(int n)
{
	if(n<1){
		return;
	}
	cout<<"Hello"<<" "<<endl;
	solve(n-1);


	
}
int main()
{
	int n=5;
	solve(n);
	return 0;
}
