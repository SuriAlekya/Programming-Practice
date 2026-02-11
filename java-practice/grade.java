import java.util.Scanner;
public class grade {
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        System.out.print("Enter the marks:");
        int marks=scanner.nextInt();
        if(marks<35)
        {
            System.out.println("Fail");
        }
        else if(marks==35){
            System.out.println("pass");
        }
        else if(marks>=35 && marks<70)
        {
            System.out.println("third class");
        }
        else if(marks>=70 && marks<85)
        {
            System.out.println("second class");
        }
        else
        {
            System.out.println("first class");
        }
    
    scanner.close();
    }
    
}
