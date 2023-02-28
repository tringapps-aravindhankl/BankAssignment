package bank;
import java.util.*;
import java.util.logging.*;

public class Bank {
    public static void main(String[] args) {
        int option = 0;
        Logger log = Logger.getLogger("hi");
        Scanner scan = new Scanner(System.in);
        log.info("ENTER ACCOUNT HOLDERNAME");
        String name = scan.nextLine();
        log.info("ENTER YOUR ACCOUNTNUMBER");
        int number = scan.nextInt();
        Details obj = new Details(name,number);
        do {
            log.info("1.Deposite");
            log.info("2.withdraw");
            log.info("3.balance");
            log.info("4.Exit");
            try {
            option=scan.nextInt();
            }
            catch(InputMismatchException e) {
            	log.info(String.valueOf(e));
            }
            switch (option) {
                case 1:
                    obj.deposite();
                    break;
                case 2:
                    obj.withdraw();
                    break;
                case 3:
                    obj.balance();
                    break;
                case 4:
                    log.info("Thank You:)");
                    break;
                default:
            }
        } while (option < 4);

    }

}
