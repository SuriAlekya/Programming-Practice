#include<iostream>
#include<bits/stdc++.h>
using namespace std;
int main()
{
	string str;
	getline(cin,str);
	set<char> s;
	for(auto x:str)
	s.insert(x);
	for(auto x:s)
	cout<<x;
}
