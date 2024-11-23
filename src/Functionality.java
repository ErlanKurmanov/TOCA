import java.util.Scanner;

public class Functionality {
//    deposit, withdrawn, history, calculating money for deposit, exit
    double balance;
    double deposit;

//    function for deposit
    void depositFunction (double amaunt){
        deposit += amaunt;
    }

    //    function for withdrawn
    void withdrawnFunction (double amount){
         balance -= amount;
    }

    // Constructor
    public Functionality(){
        String opt ="A";
            switch (opt) {
        case "A":
            Scanner depMon = new Scanner(System.in);
            System.out.println("Enter the amount of money you would like to add deposit: ");
            double infoFromScanner = depMon.nextDouble();
            depositFunction(infoFromScanner);
            break;

        case "B":
            break;
    }
    }


}
