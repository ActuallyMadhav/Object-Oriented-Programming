import java.util.Scanner;
public class bankingProgram {
    /* 
     functions:
     1. show balance
     2. deposit money
     3. withdraw money
     4. exit
    */
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int choice;
        double balance = 0;
        boolean isRunning = true;

        do{
        System.out.println("Welcome to the bank. How can we help you today?");
        System.out.println("1. Display Balance");
        System.out.println("2. Deposit Cash");
        System.out.println("3. Withdraw Cash");
        System.out.println("4. Exit");
        System.out.print("Enter option 1-4: ");

        choice = scanner.nextInt();

            switch(choice){
                case 1 -> displayBalance(balance);
                case 2 -> balance += deposit();
                case 3 -> balance -= withdraw();
                case 4 -> isRunning = false;
            }

        } while(isRunning);

        System.out.println("Your final balance is: $" + balance);
        System.out.println("Have a nice day!");

        scanner.close();
    }

    public static void displayBalance(double cash){
        System.out.println("Your bank balance is: $" + cash);
    }

    public static double deposit(){
        Scanner scanner = new Scanner(System.in);
        double amount = 0;

        System.out.print("Enter amount to be deposited: $");
        amount = scanner.nextDouble();

        scanner.close();

        if(amount > 0) return amount;
        else {
            System.out.println("Invalid amount. Please try again!");
            return 0;
        }
    }

    public static double withdraw(){
        Scanner scanner = new Scanner(System.in);
        double amount = 0;
        System.out.print("Enter amount to be withdrawn: $");
        amount = scanner.nextDouble();

        scanner.close();

        if(amount > 0) return amount;
        else{
            System.out.println("Invalid amount. Please try again!");
            return 0;
        }
    }
}
