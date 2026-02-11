import java.util.Scanner;
public class evenorodd {
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        System.out.print("Enter a number:");
        int i=scanner.nextInt();
        if(i%2==0)
        {
            System.out.println("this is the even number");
        }
        else{
            System.out.println("this is odd number");
        }
    scanner.close();
    }
    
}
