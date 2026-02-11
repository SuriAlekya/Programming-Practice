#include<iostream>
#include<bits/stdc++.h>
using namespace std;
int main()
{
	string s;
	cin>>s;
	int fre[26]={0};
	for(char ch: s){
		fre[ch-'a']++;
	}
	for(char ch:s)
	{
		if(fre[ch- 'a']==1)
		{
			cout<<ch;
			return 0;
		}
	}
	return 0;
}
