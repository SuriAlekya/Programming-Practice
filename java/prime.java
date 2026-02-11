import java.util.*;
class prime
{
public static void main(String args[])
{
Scanner s=new Scanner(System.in);
System.out.println("enter a n value");
int n=s.nextInt();
for(int i=1;i<=n;i++)
{
int count=0;
	for(int j=1;j<=i;j++)
	{ 
		if(i%j==0)
		count++;
	}
if(count==2)
System.out.println("prime number is"+i);
}
}
}