class Test extends Thread
{
String name;
Test(String s)
{
name=s;
}
public void run()
{
System.out.println("priority of running Thread"+Thread.currentThread().getPriority());
for(int i=0;i<5;i++)
{
System.out.println(name+" "+i);
}
}
}
class exp10
{
public static void main(String args[])
{
Thread t=Thread.currentThread();
Test thrd1=new Test("alli");
Thread t1=new Thread(thrd1);
Test thrd2=new Test("abhi");
Thread t2=new Thread(thrd2);
Test thrd3=new Test("latha");
Thread t3=new Thread(thrd3);
t1.setPriority(8);
t2.setPriority(5);
t3.setPriority(1);
t1.start();
t2.start();
t3.start();
try
{
t.sleep(10000);
}
catch(Exception e)
{
}
System.out.println("main Thread ends");
}
}
