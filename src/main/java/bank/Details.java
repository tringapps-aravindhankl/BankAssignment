package bank;
import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

class Details {
    String holdername;
    int accountnum;
    private double balance = 0;
    Logger log = Logger.getLogger("hi");
    Scanner scan=new Scanner(System.in);
    Details(String name,int number) {
        try {
            this.holdername = name;
            this.accountnum = number;
        } catch (InputMismatchException e) {
            log.info(String.valueOf(e));
            System.exit(0);
        }
    }

    void deposite() {
    	try {
        log.info("enter your deposite amount");
        double deposite = scan.nextDouble();
        balance = balance + deposite;
    	}
    	catch(InputMismatchException e) {
    		log.info(String.valueOf(e));
    		System.exit(0);
    	}
    }

    void withdraw() {
    	try {
        log.info("enter withdraw amount");
        double withdraw = scan.nextDouble();
        if (withdraw < balance) {
            balance = balance - withdraw;
        } else {
            log.info("your balance is low");
        }
    	}
    	catch(InputMismatchException e) {
    		log.info(String.valueOf(e));
    		System.exit(0);
    	}
    }
    void balance() {
       log.log(Level.INFO,()-> "balance:"+balance);
    }
}