#include<iostream>
#include<bits/stdc++.h>
using namespace std;
int main()
{
	int n;
	cin>>n;
	int t;
	cin>>t;
	int arr[n];
	unordered_map<int,int> mp;
	for(int i=0;i<n;i++)
	{
		cin>>arr[i];
		mp[arr[i]]=i;
	}
	for(int i=0;i<n;i++)
	{ 
		int d=t-arr[i];
		if(mp.find(d)!=mp.end()&&i!=mp[d])
		{
			cout<<i<<" "<<mp[d];
			break;
		}
	}
	
}
