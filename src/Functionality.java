import java.util.Scanner;

public class Functionality {
//    deposit, withdrawn, exit

    String customerName;
    int customerID;
    double balance = 100;

//    function for deposit
    void depositFunction (double amount){
        if(amount != 0) {
            balance += amount;
        }
    }

//    function for withdrawn
    void withdrawnFunction (double amount){

        if(amount != 0) { balance -= amount;}
    }

    // Constructor
    public Functionality(String name, int id) {
        customerName = name;
        customerID = id;
    }

    void showMenu() {
        char option;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome, " + customerName + "!");
        System.out.println("Your ID is: " + customerID);
        System.out.println();
        System.out.println("What would you like to do?");
        System.out.println();
        System.out.println("A. Check your balance");
        System.out.println("B. Make a deposit");
        System.out.println("C. Make a withdrawal");
        System.out.println("D. Exit");

        do {
            option = Character.toUpperCase(scanner.next().charAt(0));
            switch (option) {
                case 'A':
                    System.out.println("====================================");
                    System.out.println("Balance = $" + balance);
                    System.out.println("====================================");
                    System.out.println();
                    break;

                case 'B':
                    System.out.println("Enter the amount of money you would like to add deposit: ");
                    double infoFromScan = scanner.nextDouble();
                    depositFunction(infoFromScan);
                    System.out.println("deposited");
                    break;

                case 'C':
                    System.out.println("Enter the amount of money you would like to withdraw: ");
                    double infoFromScan2 = scanner.nextDouble();
                    withdrawnFunction(infoFromScan2);
                    System.out.println("withdrawn");
                    break;
                case 'F':
                    System.out.println("Exiting... Thank you for using our service!");
                    break;
                default:
                    System.out.println("Invalid option. Please try again.");
                    break;

            }
        }
        while (option != 'F');



    }
}
