import java.util.*;
class myException extends Exception
{
public myException(String str)
{
super(str);
}
}
class Expc
{
public static void main(String args[])
{
Scanner s=new Scanner(System.in);
System.out.println("enter voter age");
int a=s.nextInt();
try
{
if(a<18)
	throw new myException("age not valid for vote");
else
	System.out.println("welcome vote");
}
catch(Exception e)
{
System.out.println("caught Exception:"+"enter age above 18");
}
finally
{
System.out.println("this is voter enrollment");
}
}
}
