#include<iostream>
using namespace std;
int maxSum(int mat[][100],int n,int i=0,int j=0)
{
	if(i==n||j==n)
	{
		return 0;
	}
	int current=mat[i][j];
	int maxr=max(maxSum(mat,n,i+1,j),maxSum(mat,n,i,j+1));
	return current+maxr;
}
int main()
{
	int n;
	cin>>n;
	int mat[100][100];
	for(int i=0;i<n;i++){
		for(int j=0;j<n;j++){
			cin>>mat[i][j];
		}
	}
	cout<<maxSum(mat,n)<<endl;
	return 0;
}
