import java.util.*;
public class factorial
{
public static void main(String args[])
{
Scanner s=new Scanner(System.in);
System.out.println("enter n value");
int n=s.nextInt();
System.out.println("recursive call");
int f=rfact(n);
System.out.println(f);
System.out.println("non recursive call");
f=ifact(n);
System.out.println(f);
}
static int rfact(int n)
{
	if(n==0||n==1)
	return 1;
	else
	return n*rfact(n-1);
}
static int ifact(int n)
{
int i,f=1;
for(i=1;i<=n;i++)
{
	f=f*i;
}
return f;
}
}
