#include<iostream>
#include<bits/stdc++.h>
using namespace std;
int main(){
	string str;
	getline(cin,str);
	char ch1='A',ch2='C',ch3='G',ch4='T';
	int c1=0,c2=0,c3=0,c4=0;
	int max_count=INT_MIN;
	int n=str.length();
	for(int i=0;i<n;i++){
		if(str[i]==ch1){
			c1++;
		}
		else if(str[i]==ch2){
			c2++;
		}
		else if(str[i]==ch3){
			c3++;
		}
		else{
			c4++;
		}
	}
	if(c1>c2&&c1>c3&&c1>c4){
		max_count=c1;
	}
	else if(c2>c1&&c2>c3&&c2>c4){
		max_count=c2;
	}
	else if(c3>c1&&c3>c2&&c3>c4){
		max_count=c3;
	}
	else{
		max_count=c4;
	}
	cout<<max_count;
	return 0;
}
