class A
{
int z;
void add(int x,int y)
{
z=x+y;
System.out.println("super class method 1"+" "+z);
}
void sub(int x,int y)
{
z=x-y;
System.out.println("parent class method 2"+" "+z);
}
}
class B extends A
{
void mul(int x,int y)
{
z=x*y;
System.out.println("this is sub class"+" "+z);
}
}
class exp5a
{
public static void main(String args[])
{
B obj=new B();
obj.add(6,7);
obj.sub(18,7);
obj.mul(8,9);
}
}
