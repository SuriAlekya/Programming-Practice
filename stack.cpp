#include<iostream>
#include<bits/stdc++.h>
#include<stack>
using namespace std;
int main()
{
	int n;
	cin>>n;
	stack<int> s;
	for(int i=0;i<n;i++)
	{
	int m;
	cin>>m;
	s.push(m);
	}
	s.pop();
	cout<<"top element is"<<s.top()<<endl;
	cout<<"total elements are"<<s.size()<<endl;
	while(!s.empty())
	{
		cout<<s.top()<<" ";
		s.pop();
	}

}
