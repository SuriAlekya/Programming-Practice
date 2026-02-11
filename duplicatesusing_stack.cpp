#include<iostream>
#include<bits/stdc++.h>
using namespace std;
int main()
{
	string str;
	getline(cin,str);
	sort(str.begin(),str.end());
	stack<char> s;
	s.push(str[0]);
	for(int i=1;i<str.length();i++)
	{
		if(s.top()!=str[i])
		s.push(str[i]);
		
	}
	while(!s.empty())
	{
		cout<<s.top();
		s.pop();
	}
}
