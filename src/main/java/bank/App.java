package bank;
import java.util.*;
class Welcome {
    public String Holdername;
    public int accountNum;
    private double balance = 0;
    Scanner a = new Scanner(System.in);

    Welcome() {
        System.out.println("ENTER ACCOUNT HOLDERNAME");
        String name = a.nextLine();
        this.Holdername = name;
        System.out.println("ENTER YOUR ACCOUNTNUMBER");
        int number = a.nextInt();
        this.accountNum = number;
    }

    void deposite() {
        System.out.println("enter your deposite amount");
        double deposite = a.nextDouble();
        balance = balance + deposite;
    }

    void withdraw() {
        System.out.println("enter withdraw amount");
        double withdraw = a.nextDouble();
        if (withdraw < balance) {
            balance = balance - withdraw;
        } else {
            System.out.println("your balance is low");
        }
    }

    void balance() {
        System.out.println("your balance is" + balance);
    }
}
public class App {
	public static void main(String[] args) {
		int option;
        Welcome hi = new Welcome();
        Scanner b = new Scanner(System.in);
        do {
            System.out.println("1.Deposite");
            System.out.println("2.withdraw");
            System.out.println("3.balance");
            System.out.println("4.Exit");
            option = b.nextInt();
            switch (option) {
                case 1:
                    hi.deposite();
                    break;
                case 2:
                    hi.withdraw();
                    break;
                case 3:
                    hi.balance();
                    break;
                case 4:
                    System.out.println("Enter valid option");
            }
        } while (option < 4);

	}

}
