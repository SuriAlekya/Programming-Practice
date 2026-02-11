
import java.util.Scanner;

public class dayname {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the day: ");
        String day = scanner.next().toLowerCase(); // Convert input to lowercase

        if (day.equals("saturday") || day.equals("sunday")) {
            System.out.println("Yayy, it's a weekend!");
        } else {
            System.out.println("Uff, it's a weekday!");
        }

        scanner.close();
    }
}
