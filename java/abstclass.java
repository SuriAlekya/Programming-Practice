abstract class shape
{
abstract public void area();
}
class sqr extends shape
{
double sd;
sqr()
{
sd=0;
}
sqr(double s)
{
sd=s;
}
public void area()
{
System.out.println("area of square with side"+sd+" "+(sd*sd));
}
}
class rect extends shape
{
double ln,br;
rect()
{
ln=0;
br=0;
}
rect(double l,double b)
{
ln=l;
br=b;
}
public void area()
{
System.out.println("area of rectangle of len"+ln+"Brd"+br+"is"+(ln*br));
}
}
class crcl extends shape
{
double rad;
crcl()
{
rad=0;
}
crcl(double r)
{
rad=r;
}
public void area()
{
System.out.println("area of circle rad"+rad+"is"+(rad*rad*Math.PI));
}
}
class abstclass
{
public static void main(String args[])
{
shape o;
sqr s1=new sqr(14);
o=s1;
o.area();
rect r1=new rect(50,30);
o=r1;
o.area();
crcl c1=new crcl(21);
o=c1;
o.area();
}
}