package io.zipcoder;
import java.util.ArrayList;

public abstract class Account {
    public String acctHolder;
    private double totalBalance = 0.0;
    final public Integer acctNum;
    private ArrayList<String> transactionHistory; //make separate class to store info?
    private double checkingAcct = 0.0;
    private double savingsAcct = 0.0; //don't worry abt interest rate for now
    private double investmentAcct = 0.0; //don't worry abt interest rate for now
    private Boolean overdraftToggle;

    public Account(String acctHolder, Integer acctNum) {
        this.acctHolder = acctHolder;
        this.acctNum = acctNum;
        this.totalBalance = totalBalance;
        this.checkingAcct = checkingAcct;
        this.savingsAcct = savingsAcct;
        this.investmentAcct = investmentAcct;
        this.overdraftToggle = true;
    }
    //getters and setters for identifying info
    public String getAcctHolder() {
        return this.acctHolder;
    }
    public void setAcctHolder(String acctHolder) {
        this.acctHolder = acctHolder;
    }
    public Integer getAcctNum() {
        return this.acctNum;
    }
    //getter and setter for overdraft
    public void setOverdraftPermission(Boolean overdraftToggle) {
        this.overdraftToggle = !overdraftToggle;
    }
    public String isOverdraftAllowed() {
        if (this.overdraftToggle == true) {
            return "Your account allows overdraft";
        } else {
            return "Your account does not allow overdraft";
        }
    }
    //getter for balance
    public String getBalance() {
        this.totalBalance = this.checkingAcct + this.savingsAcct + this.investmentAcct;
        return String.format("Total balance: %.2s", this.totalBalance);
    }

    public void depositChecking(double amount) {

    }

    public void withdrawalChecking(double amount) {

    }

    public String getCheckingBalance() {
        return String.format("Checking account balance: %.2s", this.checkingAcct);
    }

    public void depositSavings(double amount) {

    }

    public void withdrawalSavings(double amount) {

    }

    public String getSavingsBalance() {
        return String.format("Savings account balance: %.2s", this.savingsAcct);
    }

    public void depositInvestment(double amount) {

    }

    public void withdrawalInvestment(double amount) {

    }

    public String getInvestmentBalance() {
        return String.format("Investment account balance: %s.2", this.investmentAcct);
    }
}
