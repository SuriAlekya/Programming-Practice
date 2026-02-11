#include<bits/stdc++.h>
using namespace std;
int main()
{
	int n;
	cin>>n;
    int count=0;
	while(n!=1){
		long long  p=0,i=1;
		while(p<n){
			p=pow(2,i);
			i++;
			}
			if(p==n){
				n=n/2;
			}
			else{
				n=n-pow(2,i-2);
			}
			count++;
		}
		if(count%2==0){
			cout<<"Richard"<<endl;
		}
		else{
			cout<<"Louise"<<endl;
		}

	
}
	
	
