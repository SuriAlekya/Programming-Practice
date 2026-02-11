class Ticketbooking
{
boolean booked=false;
public synchronized void bookticket(String name)
{
if(booked==false)
{
System.out.println(name+"select seat number");
try
{
Thread.sleep(10000);
}
catch(Exception e)
{
}
System.out.println(name+"do the payment");
System.out.println(name+"get Ticket");
booked=true;
}
else
{
System.out.println(name+"sorry already Ticket booked");
}
}
}
class cse extends Thread
{
Ticketbooking tkt;
String name;
cse(Ticketbooking obj,String s)
{
tkt=obj;
name=s;
}
public void run()
{
tkt.bookticket(name);
}
}
class synex
{
public static void main(String args[])
{
Ticketbooking s7=new Ticketbooking();
cse siri=new cse(s7,"siri");
Thread sr=new Thread(siri);
cse vani=new cse(s7,"vani");
Thread vn=new Thread(vani);
sr.start();
vn.start();
}
}




 