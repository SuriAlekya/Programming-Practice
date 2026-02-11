import java.util.*;
class rect
{
double l,b,area,peri;
void readdata()
{
Scanner s=new Scanner(System.in);
System.out.println("enter length of rectangle");
l=s.nextDouble();
System.out.println("enter breadth of rectangle");
b=s.nextDouble();
}
void area()
{
area=l*b;
System.out.println("area of rectangle"+area);
}
void peri()
{
peri=2*(l+b);
System.out.println("peri of rectangle"+peri);
}
}
class rectangle
{
public static void main(String args[])
{
rect t=new rect();
t.readdata();
t.area();
t.peri();
}
}
