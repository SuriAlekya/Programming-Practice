#include<iostream>
#include<climits>
using namespace std;
int main()
{
	int n;
	cin>>n;
	int arr[n];
	int min=INT_MAX,max=INT_MIN;
	for(int i=0;i<n;i++)
	{
		cin>>arr[i];
	}
	
	for(int i=0;i<n;i++)
	{
		if(arr[i]>max)
		{
		max=arr[i];	
		}
		if(arr[i]<min)
		{
			min=arr[i];
		}
		
	}
	cout<<"maximum number in array"<<max<<endl;
	cout<<"minimum number in array"<<min<<endl;
	return 0;
}
