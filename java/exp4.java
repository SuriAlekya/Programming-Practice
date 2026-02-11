import java.util.*;
class over
{
void add(int a,int b)
{
System.out.println("the sum of a and b is:"+(a+b));
}
void add(int a,int b,int c)
{
System.out.println("the sum of a,b,c is:"+(a+b+c));
}
}
class overr extends over
{
void add(int a,int b)
{
System.out.println("the sum of a and b is:"+(a+b));
}
void add(int a,int b,int c)
{
System.out.println("the sum of a,b,c  is:"+(a+b+c));
}
}
public class exp4
{
public static void main(String args[])
{
overr s=new overr();
s.add(10,20);
s.add(10,20,30);
s.add(20,30);
s.add(10,30,40);
}
}