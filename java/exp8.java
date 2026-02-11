class mythread extends Thread
{
public void run()
{
for(int i=0;i<=10;i++)
{
	System.out.println(i);
}
}
}
class exp8
{
public static void main(String args[])
{
mythread obj=new mythread();
Thread t=new Thread(obj);
t.start();
System.out.println(t);
}
}
