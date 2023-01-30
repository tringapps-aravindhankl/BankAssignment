package bank;
import java.util.*;
import java.util.logging.*;
class Welcome {
    public String holdername;
    public int accountnum;
    private double balance = 0;
    Scanner a = new Scanner(System.in);
    Logger log=Logger.getLogger("hi");

    Welcome() {
        log.info("ENTER ACCOUNT HOLDERNAME");
        String name = a.nextLine();
        holdername = name;
        log.info("ENTER YOUR ACCOUNTNUMBER");
        int number = a.nextInt();
        accountnum = number;
    }

    void deposite() {
        log.info("enter your deposite amount");
        double deposite = a.nextDouble();
        balance = balance + deposite;
    }

    void withdraw() {
        log.info("enter withdraw amount");
        double withdraw = a.nextDouble();
        if (withdraw < balance) {
            balance = balance - withdraw;
        } else {
            log.info("your balance is low");
        }
    }

    void balance() {
        log.info("your balance is" + balance);
    }
}
public class Bank {
	public static void main(String[] args) {
		int option;
        Welcome hi = new Welcome();
	Logger log=Logger.getLogger("hi");
        Scanner b = new Scanner(System.in);
        do {
            log.info("1.Deposite");
            log.info("2.withdraw");
            log.info("3.balance");
            log.info("4.Exit");
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
                    log.info("Enter valid option");
	            break;
            }
        } while (option < 4);

	}

}