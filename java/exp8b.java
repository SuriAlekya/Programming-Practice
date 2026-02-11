class main implements Runnable
{
public void run()
{
System.out.println("hello");
}
}
class exp8b
{
public static void main(String args[])
{
main obj=new main();
Thread t=new Thread(obj);
t.setName("first");
t.start();
System.out.println(t);
}
}