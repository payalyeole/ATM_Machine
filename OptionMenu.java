package ATM_Machine;

// Main Class
import java.io.IOException;
import java.text.DecimalFormat;
import java.util.*;

public class OptionMenu extends Account {
    Scanner menuInput = new Scanner(System.in);
    DecimalFormat moneyFormat = new DecimalFormat("'$'###,##0.00");
    HashMap<Integer, Integer> data = new HashMap<Integer, Integer>();

    // validate login information customer and pin number
    public void getLogin() throws IOException {
        int x = 1;
        do {
            try {
                data.put(9876543, 9876);
                data.put(89899898, 1890);
                data.put(89878898, 1891);

                System.out.println("Welcome to the ATM Project !");
                System.out.print("Enter Your Coustomer Number: ");
                setCustomerNumber(menuInput.nextInt());
                System.out.print("Enter Your Pin Number: ");
                setCustomerNumber(menuInput.nextInt());
            } catch (Exception e) {
                System.out.println("\n" + "Invalid character(s).Only numbers." + "\n");
                x = 2;
            }
            // for (entry<Integer, Integer> entry : data.entrySet())
            for (Map.Entry<Integer, Integer> entry : data.entrySet()) {
                if (entry.getKey() == getCustomerNumber() && entry.getValue() == getPinNumber()) {
                    getAccountType();
                }
            }
            System.out.println("\n" + "Wrong Customer Number or Pin Number." + "\n");
        } while (x == 1);
    }

    // Display Account Type Menu with Selection
    public void getAccountType() {
        System.out.println("Select the Account you wangt to access: ");
        System.out.println("Type 1 - Checking Account ");
        System.out.println("Type 2 - Saving Account ");
        System.out.println("Type 3 - Exit ");
        System.out.println("Type 3 - Exit ");
        System.out.println("Choice: ");

        selection = menuInput.nextInt();

        switch (selection) {
            case 1:
                getChecking();
                break;
            case 2:
                getSaving();
                break;
            case 3:
                System.out.println("Thank You for using this ATM, bye.");
                break;

            default:
                System.out.println("\n" + "Invalid Choice." + "\n");
                getAccountType();
        }
    }

    // Display Checking Account Menu selection
    public double getChecking() {
        System.out.println("Checking Account: ");
        System.out.println("Type 1 - View Balence");
        System.out.println("Type 2 - Withdrow Funds");
        System.out.println("Type 3 - Deposit Funds");
        System.out.println("Type 4 - Exit");
        System.out.println("Choice: ");

        selection = menuInput.nextInt();
        switch (selection) {
            case 1:
                System.out.println("Checking Account balence: " + moneyFormat.format(getChecking()));
                getAccountType();
                break;
            case 2:
                getCheckingWithdrawInput();
                getAccountType();
                break;

            case 3:
                getCheckingDepositeInput();
                getAccountType();
                break;
            case 4:
                System.out.println("Thank You For using this ATM ,bye");
                getAccountType();
                break;

            default:
                System.out.println("\n" + "invalid choice." + "\n");
                getChecking();
        }
        return getChecking();

    }

    // Display Saving Account Menu selection
    public void getSaving() {
        System.out.println("Saving Account: ");
        System.out.println("Type 1 - View Balence");
        System.out.println("Type 2 - Withdrow Funds");
        System.out.println("Type 3 - Deposit Funds");
        System.out.println("Type 4 - Exit");
        System.out.println("Choice: ");

        selection = menuInput.nextInt();
        switch (selection) {
            case 1:
                System.out.println("Saving Account balence: " + moneyFormat.format(getChecking()));
                getAccountType();
                break;
            case 2:
                getSavingWithdrawInput();
                getAccountType();
                break;

            case 3:
                getSavingDepositeInput();
                getAccountType();
                break;
            case 4:
                System.out.println("Thank You For using this ATM ,bye");
                getAccountType();
                break;

            default:
                System.out.println("\n" + "invalid choice." + "\n");
                getChecking();
        }
    }

    int selection;
}
