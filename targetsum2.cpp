#include<bits/stdc++.h>
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
	int t;
	cin>>t;
	int count=0;
	sort(arr,arr+n);
	int i=0,j=n-1;
	while(i<j)
	{
		int sum=arr[i]+arr[j];
		if(sum<t)
		{
			count=count+(j-i);
			i++;
		}
		else{
			j--;
		}
	}
	cout<<count<<endl;
	
}
