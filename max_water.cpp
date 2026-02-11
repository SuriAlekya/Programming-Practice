#include<iostream>
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
	int area,max=INT_MIN;
    /*for(int i=0;i<n;i++)
	{
		for(int j=i+1;j<n;j++)
		{
			area=(j-i)*min(arr[i],arr[j]);
			if(max<area)
			{
				max=area;
			}
		}
	}*/
	int i=0,j=n-1;
	while(i<j)
	{
		area=(j-i)*min(arr[i],arr[j]);
		if(max<area)
		{
			max=area;
		}
		else if(arr[i]<arr[j])
		{
			i++;
		}
		else
		{
			j--;
		}
	}
	cout<<max<<endl;
	
}
