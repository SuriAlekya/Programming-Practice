#include<iostream>
#include<bits/stdc++.h>
#include<stack>
using namespace std;
int main()
{
	string str;
	getline(cin,str);
	stack<char> st;
	int i=0;
	while(i<str.length())
	{
		while(str[i]!=' ' && i<str.length())
		{
			st.push(str[i]);
			i++;
	}
	while(!st.empty())
	{
		cout<<st.top();
		st.pop();
	}
	if(str[i]==' ')
		cout<<' ';
		i++;
	}
	return 0;
	
	
	
}
