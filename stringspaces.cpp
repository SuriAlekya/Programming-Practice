#include<iostream>
#include<string.h>
using namespace std;
int main()
{
	char str[100];
	int i=0,len,j;
	cout<<"enter a string:";
	gets(str);
	len=strlen(str);
	for(int i=0;i<len;i++)
	{
		if(str[i]==' ')
		{
			for(j=i;j<len;j++)
			{
				str[j]=str[j+1];
				
			}
			len--;
		}
	}
	cout<<" resultant string:"<<str;
	return 0;
}
