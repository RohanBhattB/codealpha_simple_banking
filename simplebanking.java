import java.util.Scanner;

public class simplebanking {

    private static double balance =0;
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        boolean exit = true;

        while (exit) {
            System.out.println("Welcome to the Banking Application");
            System.out.println("Choose any of the below options");
            System.out.println("1. Check Your Balance");
            System.out.println("2. Deposit Money");
            System.out.println("3. Withdraw Money");
            System.out.println("4. Exit");
            System.out.print("Please choose a option: ");

            // scan the user option enterd
            int option = s.nextInt();

            switch (option) {
                case 1:
                    checkBalance();
                    break;

                case 2:
                    depositMoney(s);
                    break;

                case 3:
                    withdrawMoney(s);
                    break;

                case 4:
                    exit = false;
                    System.out.println("Thank You For Your Trust in this bank");
                    break;

                default:
                    System.out.println("Invavlid option. Please try again");

            }

        }
        s.close();
    }
    
    //to check balane
    private static void checkBalance()
    {
        System.out.println("Your current balance is : Rs "+balance);
    }
    //to deposit the amount
    private static void depositMoney(Scanner s)
    {
        System.out.print("Enter the amout You want to withdraw: Rs ");
        double amount = s.nextDouble();
        if(amount>0 ){
            balance = balance+amount;
            System.out.println("Amount Deposited Sucessfully");
        }
        else{
            System.out.println("Invalid please try again");
        }
    }
    //to withdraw the amount
    private static void withdrawMoney(Scanner s)
    {
        System.out.print("Enter the amout you want to withdraw :Rs ");
        Double amount = s.nextDouble();
        if(amount<0)
        {
            System.out.println("Amount is Invalid");
        }
        else if(amount <= balance){
            balance -= amount;
            System.out.println("Withdraw Sucessfull");
        }
        else
        {
            System.out.println("Insufficient balance");
        }
    }
}