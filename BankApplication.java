import java.util.Scanner;
public class BankApplication {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please Enter Your UserName:");
        String username = sc.nextLine();
        System.out.println("Enter Your Password Please:");
        String password = sc.nextLine();
        int balance = 0;

        if (username.equalsIgnoreCase("Karanchauhan") && password.equalsIgnoreCase("12345")) {
            System.out.println("Your logged in Sucessfully! ");
            while (true) {
                System.out.println("Enter 1 to deposit money");
                System.out.println("Enter 2 to withdraw money");
                System.out.println("Enter 3 to check balance");
                System.out.println("Enter 4 to exit");
                System.out.println("What do you want to press!");
                int choice = sc.nextInt();
                if (choice == 1) {
                    System.out.println("Enter Your Amount To Deposit? ");
                    int n = sc.nextInt();
                    balance = n += balance;
                    System.out.println("----------------------------------");
                    System.out.println(n + "$ " + "Amount Has Been Deposited");
                    System.out.println("------------------------------------");
                } else if (choice == 2) {
                    System.out.println("What Amount Do You Want To Widthraw?");
                    int w = sc.nextInt();
                    balance = balance - w;
                    System.out.println("----------------------------------------------");
                    System.out.println(w + " $" + " Amount Has Been Withdrawn Successfully");
                    System.out.println("-------------------------------------------------");
                } else if (choice == 3) {
                    System.out.println("-------------------------");
                    System.out.println("Your Current Balance is " + balance + " $");
                    System.out.println("--------------------------");
                } else {
                    System.out.println("Thank for using over Services!");
                    break;
                }
            }
        } else {
            System.out.println("Invalid Credentials Entered");
        }
    }
}


