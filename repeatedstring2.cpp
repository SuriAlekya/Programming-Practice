#include<bits/stdc++.h>
using namespace std;
int main()
{
	string str;
	cin>>str;
	map<char,int> mp;
	for(int i=0;i<str.length();i++)
	mp[str[i]]++;
	int max=INT_MAX;
	for(auto i:mp)
	{
		if(i.second>max)
		max=i.second;
	}
	cout<<max;
}
