#include<iostream>
using namespace std;
int main()
{
	string str,ans;
	getline(cin,str);
	for(int i=0;i<str.length();i++)
	{
		if(str[i]!=' ')
		{
			ans+=str[i];
		}
		
	}
	cout<<ans;
	return 0;
}
