import java.util.Scanner;

public class bankingProgram{
    public static void main(String[] args){
        // declare variables
        Scanner sc = new Scanner(System.in);
        double balance = 0;
        boolean isRunning = true;
        int choice;

            while(isRunning) {
                System.out.println("************************");
                System.out.println("BANKING PROGRAM");
                System.out.println("************************");
                System.out.println("1. Show Balance");
                System.out.println("2. Deposit");
                System.out.println("3, Withdraw");
                System.out.println("4. Exit");
                System.out.println("************************");

                System.out.print("Enter your choice (1-4): ");
                choice = sc.nextInt();

                switch (choice) {
                    case 1 -> showBalance(balance);
                    case 2 -> {
                        balance += deposit();
                        System.out.printf("Your new balance is $%.2f\n", balance);
                    }
                    case 3 -> {
                        balance -= withdraw(balance);
                        System.out.printf("Your new balance is $%.2f\n", balance);
                    }
                    case 4 -> isRunning = false;
                    default -> System.out.println("Invalid choice!");
                }
            }
        // display menu - done
        // get and process user's choice - done
        // show balance - done
        // deposit - done
        // withdraw - done
        //exit
        System.out.printf("Your current balance is: $%.2f\n", balance);
        System.out.println("Thank you for banking with us!\nHave a nice day!");
        sc.close();
    }

    static void showBalance(double balance){
        System.out.printf("Your current balance is: $%.2f\n", balance);
    }

    static double deposit(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter amount you wish to deposit: $");
        double amount = scanner.nextDouble();

        if(amount < 0){
            System.out.println("Invalid deposit. Please try again!");
        }
        else{
            System.out.println("Deposit Successful.");
        }
        return amount;
    }

    static double withdraw(double balance){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter amount you wish to withdraw: $");
        double amount = scanner.nextDouble();

        if(amount > balance){
            System.out.println("Insufficient funds. Try again!");
            return 0;
        }
        else if(amount < 0){
            System.out.println("Invalid entry. Try again!");
            return 0;
        }
        else{
            System.out.println("Withdrawal successful.");
        }
        return amount;
    }
}