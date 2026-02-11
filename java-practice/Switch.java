import java.util.Scanner;
public class Switch {
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        System.out.print("enter a number:");
        long num=scanner.nextLong();
        switch((int) (num%2))
        {
            case 0:
                 System.out.println("this is the even number");
                 break;
            case 1:
            case -1:
                  System.out.println("this is the odd number");
                  break;
            default:
                  System.out.println("unexpected case!");
        }
        scanner.close();
    }  
}

