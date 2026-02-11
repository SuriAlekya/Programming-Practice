#include<iostream>
#include<bits/stdc++.h>
#include<numeric>
#include<vector>
using namespace std;
int main()
{
	int n;
	cin>>n;
	int arr[n];
	for(int i=0;i<n;i++)
	{
		cin>>arr[i];
	}
	vector<int>v;
	for(int i=0;i<n;i++)
	{
		v.push_back(arr[i]);
	}
	int sum=0;
	int total_sum=accumulate(v.begin(),v.end(),sum);
	int left_sum=0;
	for(int i=0;i<n;i++)
	{
		total_sum-=arr[i];
		if(left_sum==total_sum)
		{
			cout<<i<<" ";
		}
		else
		{
			left_sum+=arr[i];
		}
	}
	return 0;
}

