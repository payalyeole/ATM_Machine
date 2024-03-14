package ATM_Machine;

import java.util.*;

import java.text.DecimalFormat;

public class Account {
    Scanner input = new Scanner(System.in);
    DecimalFormat moneyFormat = new DecimalFormat("'$'###,##0.00");

    // Set the custemer number

    public int setCustomerNumber(int customerNumber) {
        this.customerNumber = customerNumber;
        return customerNumber;
    }

    // get the customer Number
    public int getCustomerNumber() {
        return customerNumber;
    }

    // get the PIN number
    public int getPinNumber() {
        return pinNumber;
    }

    // Get checking Account Bakence
    public double getCheckingBalance() {
        return checkingBalance;
    }

    // Get Saving Account Bakence
    public double getSavingBalance() {
        return savingBalance;
    }

    // calculate checking Account Withdrawal

    public double calcCheckingWithdraw(double amount) {
        checkingBalance = (checkingBalance - amount);
        return checkingBalance;
    }

    // calculate saving account withdrawal

    public double calcSavingWithdraw(double amount) {
        savingBalance = (savingBalance - amount);
        return savingBalance;
    }

    // calculate Checking account deposite
    public double calcCheckingDeposite(double amount) {
        checkingBalance = (checkingBalance + amount);
        return checkingBalance;
    }

    // calculate Saving account deposite
    public double calcSavingDeposite(double amount) {
        savingBalance = (savingBalance + amount);
        return savingBalance;
    }

    // Customer Checking Account Withdraw input
    public void getCheckingWithdrawInput() {
        System.out.println("Checking Account Balence: " + moneyFormat.format(checkingBalance));
        System.out.println("Amount you want to withdraw from Checking Account: ");
        double amount = input.nextDouble();

        if ((checkingBalance - amount) >= 0) {
            calcCheckingWithdraw(amount);
            System.out.println("New Checking Account balence: " + moneyFormat.format(checkingBalance));
        } else {
            System.out.println("balence cannot be negative." + "\n");
        }
    }
    // customer saving Account Withdraw input

    public void getSavingWithdrawInput() {
        System.out.println("Saving Account Balence: " + moneyFormat.format(savingBalance));
        System.out.println("Amount you want to withdraw from Checking Account: ");
        double amount = input.nextDouble();

        if ((savingBalance - amount) >= 0) {
            calcSavingWithdraw(amount);
            System.out.println("New Saving Account balence: " + moneyFormat.format(savingBalance));
        } else {
            System.out.println("balence cannot be negative." + "\n");
        }
    }

    // customer checking Account Deposite input
    public void getCheckingDepositeInput() {
        System.out.println("Checking Account Balence: " + moneyFormat.format(checkingBalance));
        System.out.println("Amount you want to deposite from Checking Account: ");
        double amount = input.nextDouble();

        if ((checkingBalance - amount) >= 0) {
            calcCheckingDeposite(amount);
            System.out.println("New Checking Account balence: " + moneyFormat.format(checkingBalance));
        } else {
            System.out.println("Balence cannot be negative." + "\n");
        }
    }

    // customer Saving Account Deposite input
    public void getSavingDepositeInput() {
        System.out.println("Saving Account Balence: " + moneyFormat.format(savingBalance));
        System.out.println("Amount you want to deposite from Checking Account: ");
        double amount = input.nextDouble();

        if ((savingBalance - amount) >= 0) {
            calcSavingDeposite(amount);
            System.out.println("New saving Account balence: " + moneyFormat.format(savingBalance));
        } else {
            System.out.println("Balence cannot be negative." + "\n");
        }
    }

    private int customerNumber;
    private int pinNumber;
    private double checkingBalance = 0;
    private double savingBalance = 0;

}
