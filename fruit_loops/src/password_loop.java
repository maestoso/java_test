import java.util.Scanner;

public class password_loop {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int passwordAttempts = 0;

        String password;

        do {
            passwordAttempts++;

            System.out.println("Please enter your password: ");
            password = input.nextLine();

        } while (!password.equals("abc123") && passwordAttempts <= 3);{

        }

        if (password.equals("abc123")) {

            System.out.println("Login Successful!");
        }

        else {
            System.out.println("Invalid login attempts! Please try again later.");
        }

    }

}