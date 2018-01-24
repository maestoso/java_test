import java.util.Scanner;

public class greeting {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.print("What is your name? ");
        String name = reader.nextLine();

        System.out.print("What is your age? ");
        int age = Integer.parseInt(reader.nextLine());

        System.out.println("Your name is: " + name + " Your age is: " + age);


    }
}
