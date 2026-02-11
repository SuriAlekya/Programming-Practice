#include<iostream>
#include<bits/stdc++.h>
using namespace std;
int main()
{
	string str1,str2;
	int flag=0;
	cin>>str1>>str2;
	map<char,int> mp;
	for(auto x:str1)
	mp[x]++;
	for(auto x:str2)
	mp[x]--;
	for(auto x:mp)
	{
		if(x.second!=0)
		flag=1;
	}
	if(flag==1)
	cout<<"not anagram";
	else
	cout<<"anagram";


}
