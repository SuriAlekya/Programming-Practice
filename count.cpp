#include<iostream>
#include<bits/stdc++.h>
using namespace std;
void solve(int n,int count){
	if(count>n){
	return;
	}
	cout<<count<<" ";
	count++;
	solve(n,count);
}
int main()
{
	int n=5;
	int count=1;
	solve(n,count);
	return 0;
}
