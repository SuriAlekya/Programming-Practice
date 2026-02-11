#include<iostream>
#include<bits/stdc++.h>
using namespace std;
int main()
{
	int n;
	cin>>n;
	map<char,int> mp;
    char k[n];
    int v[n];
    for(int i=0;i<n;i++)
    {
        cin>>k[i];
    }
    for(int i=0;i<n;i++)
    {
        cin>>v[i];
    }
    for(int i=0;i<n;i++)
    {
        mp[k[i]]=v[i];
    }
    for(auto i:mp)
    {
        cout<<i.first<<"-"<<i.second<<endl;
    }
    int maxi=INT_MIN;
    for(auto i:mp)
    {
        maxi=max(maxi,i.second);
    }
    cout<<maxi;
    return 0;

}
