#include<bits/stdc++.h>
using namespace std;
int main()
{
	int n;
	cin>>n;
	int a[n];
	for(int i=0;i<n;i++)
	{
		cin>>a[i];
	}
	int target,flag=0;
	cin>>target;
	/*for(int i=0;i<n;i++)
	{
		for(int j=i+1;j<n;j++)
		{
			for(int k=j+1;k<n;k++)
			{
				if(a[i]+a[j]+a[k]==target)
				{
					flag=1;
				}
				
				
			}
		}
	}*/
	sort(a,a+n);
	int i=0,j=i+1,k=n-1,sum=0;
	while(j<k)
	{
		sum=a[i]+a[j]+a[k];
		if(sum<target){
		j++;
	}
	else if(sum>target)
	{
		k--;
	}
	else
	{
		flag=1;
		break;
	}
	i++;
	}
	if(flag==1)
	{
		cout<<"true";
	}
	else
	{
		cout<<"false";
	}
}
