#include<iostream>
using namespace std;
int main()
{
	int marks;
	cout<<"enter the marks";
	cin>>marks;
	if(marks>80)
	{
		cout<<"grade A:";
	}
	else if(marks>70)
	{
		cout<<"grade B:";
	}
	else if(marks>60)
	{
		cout<<"grade C:";
	}
	else if(marks>50)
	{
		cout<<"grade D:";
	}
	else
	{
		cout<<"grade F";
	}
	return 0;
}

