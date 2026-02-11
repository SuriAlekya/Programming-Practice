import java.util.*;
class fib
{
public static void main(String args[])
{
int first=0,second=1,next,n,i;
Scanner s=new Scanner(System.in);
System.out.println("enter n value");
n=s.nextInt();
System.out.println("first,second terms are"+first+"  "+second);
for(i=0;i<n;i++)
{
System.out.println(second+"  ");
next=first+second;
first=second;
second=next;
}
}
}