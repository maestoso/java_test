import java.util.Scanner;

public class banking_calc {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.print("What is your current balance? ");
        int acctBal = Integer.parseInt(reader.nextLine());
        System.out.print("How many checks did you write? ");
        int checkQty = Integer.parseInt(reader.nextLine());
        //int overdraftFee = 35;
        double checkFees = 0.34;
        double feeTotal;
        double FinalBalance;

        if (acctBal <= 0.00) {
            System.out.print("Your account is overdrawn! ");
        } else {
            acctBal = acctBal;
        }

        if (checkQty < 0){
            System.out.print("Your account is overdrawn! ");
        } else if (checkQty < 20) {
            checkFees = .10;

        }  else if (checkQty <= 39)
        {
            checkFees = 0.08;
        }
        else if (checkQty <= 59)
        {
            checkFees = 0.06;
        }
        else if (checkQty > 60)
        {
            checkFees = 0.04;
        }
        else {
            checkFees = .10;
        }

        feeTotal = checkQty * checkFees;
        FinalBalance = acctBal + feeTotal;

        System.out.print("Balance total: " + FinalBalance);




    }

}
