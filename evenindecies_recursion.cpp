#include<iostream>
#include<bits/stdc++.h>
using namespace std;
int evensum(int arr[],int n,int index=0)
{
	if(index>=n)
		return 0;
      if(index%2==0)
      	return arr[index]+evensum(arr,n,index+1);
	else
	    return evensum(arr,n,index+1);	
}
int main()
{
	int n;
	cin>>n;
	int arr[n];
	for(int i=0;i<n;i++)
	{
		cin>>arr[i];
	}
    n=sizeof(arr)/sizeof(arr[0]);
	int sum=evensum(arr,n,0);
	cout<<sum;
	return 0;
}

