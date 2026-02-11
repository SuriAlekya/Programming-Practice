class excep
{
public static void main(String args[])
{
try
{
System.out.println(2+5);
System.out.println(2*4);
System.out.println(5/0);
System.out.println("hello");
}
catch(Exception e)
{
System.out.println("can't divide by zero");
}
}
}