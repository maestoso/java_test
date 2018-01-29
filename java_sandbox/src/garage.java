import java.util.Scanner;

public class garage {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String userResponse;



        System.out.println ("Welcome to John's garage \n");
        cars model = new cars();
        ford info = new ford();
        System.out.println ("Current cars parked are " + model.getCarName());

        System.out.println("Would you like to see more details on the vehicle? ");
        userResponse = input.nextLine();


        if (userResponse.equals("yes")) {

            System.out.println("Ford details: \n" + info.getCarDetails());
        }
        else {
            System.out.println("Thank you for checking the garage! Goodbye!");
            System.exit(0);

        }

    }
}
