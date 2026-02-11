#include<bits/stdc++.h>
#include<vector>
using namespace std;
int  main()
{
	int n;
	cin>>n;
	int arr[n];
	for(int i=0;i<n;i++)
	{
		cin>>arr[i];
	}
	int k;
	cin>>k;
	vector<int>vec(arr,arr+k);
	sort(vec.begin(),vec.end());
	cout<<" after sorted order"<<endl;
	for(int i=0;i<vec.size();i++)
	{
		cout<<vec[i]<<" ";
	}
	for(int j=k;j<n;j++)
	{
		cout<<arr[j]<<" ";
	}
	
}
