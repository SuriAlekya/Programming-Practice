
import java.util.Scanner;

public class switchday {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Taking user input for the day of the week
        System.out.print("Enter the day of the week ");
        String day = scanner.nextLine().toLowerCase(); // Convert to lowercase for easy comparison

        // Switch case to handle the day
        switch (day) {
            case "monday":
            case "tuesday":
            case "wednesday":
            case "thursday":
            case "friday":
                System.out.println("Uff, it's a weekday!");
                break;
            case "saturday":
            case "sunday":
                System.out.println("Yayy, it's a weekend!");
                break;
            default:
                System.out.println("Invalid day input!");
        }

        scanner.close();
    }
}

