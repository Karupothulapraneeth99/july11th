import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        String correctUsername = "rrtechnosoft";
        String correctPassword = "welcome123";

        Scanner scanner = new Scanner(System.in);

        System.out.println("=== RR Technosoft Login Page ===");
        System.out.print("Enter Username: ");
        String username = scanner.nextLine();

        System.out.print("Enter Password: ");
        String password = scanner.nextLine();

        if (username.equals(correctUsername) && password.equals(correctPassword)) {
            System.out.println("Login successful! Welcome to RR Technosoft.");
        } else {
            System.out.println("Invalid username or password. Please try again.");
        }

        scanner.close();
    }
}