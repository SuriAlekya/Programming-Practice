#include<iostream>
#include<bits/stdc++.h>
using namespace std;
int main()
{
	string str;
	cin>>str;
	unordered_map<char,int> mp;
	for(auto x:str)
	{
		mp[x]++;
	}
	for(auto x:str)
	{
		if(mp[x]==1)
		{
			cout<<x;
			break;
		}
	}
}


