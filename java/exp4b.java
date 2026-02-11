class parent 
{
public void show1()
{
System.out.println("show1 method in base class:");
}
{
System.out.println("show2 method in base class:");
}
}
class child extends parent
{
public void show2()
{
System.out.println("show2 method in child class:");
}
}
class exp4b
{
public static void main(String args[])
{
parent s1=new parent();
child s2=new child();
System.out.println("call by parent object");
s1.show1();
System.out.println("call by child object");
s2.show1();
System.out.println("call by child object");
s2.show2();
}
}
