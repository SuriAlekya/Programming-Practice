#include<iostream>
#include<bits/stdc++.h>
using namespace std;
int main()
{
	int n;
	cin>>n;
	vector<int> v(n);
	for(int i=0;i<n;i++)
	{
		cin>>v[i];
	}
	while(v.empty()!=true)
	{
		int j=0;
		while(j!=v.size())
		{
			int k=j;
			while(k!=v.size())
			{
				cout<<v[k]<<" ";
				k++;
			}
			j++;
			cout<<endl;
		}
		v.pop_back();
	}
}
