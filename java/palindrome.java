import java.util.*;
public class palindrome
{
public static void main(String args[])
{
String str1=new String();
Scanner s=new Scanner(System.in);
System.out.println("enter a string");
str1=s.nextLine();
System.out.println("entered String is"+str1);
int L=str1.length();
String str2=new String();
for(int i=L-1;i>=0;i--)
str2=str2.concat(str1.substring(i,i+1));
System.out.println("reverse string is"+str2);
if(str2.equals(str1))
System.out.println(str1+"palindrome");
else
System.out.println(str1+"not a palindrome");
}
}