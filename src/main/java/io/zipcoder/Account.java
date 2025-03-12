package io.zipcoder;
import java.util.ArrayList;

public abstract class Account {
    public String acctHolder;
    private double totalBalance = 0.0;
    final public Integer acctNum;
    private ArrayList<String> transactionHistory; //make separate class to store info?
    private double checkingAcct = 0.0;
    private double savingsAcct = 0.0;
    private double investmentAcct = 0.0;
    private double investmentRate = 0.01; //subject to change
    private double savingsRate = 0.01; //subject to change
    private Boolean overdraftToggle;

    public Account(String acctHolder, Integer acctNum) {
        this.acctHolder = acctHolder;
        this.acctNum = acctNum;
        this.totalBalance = totalBalance;
        this.checkingAcct = checkingAcct;
        this.savingsAcct = savingsAcct;
        this.investmentAcct = investmentAcct;
        this.investmentRate = investmentRate;
        this.savingsRate = savingsRate;
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
    public String isOverdraftAllowed() { //I suggest that we make a serperate class for Overdraft.
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

    public void setSavingsRate(double savingsRate) {
        this.savingsRate = savingsRate;
    }

    public double getSavingsRate() {
        return this.savingsRate;
    }

    public void depositSavings(double amount) {

    }

    public void withdrawalSavings(double amount) {

    }

    public String getSavingsBalance() {
        return String.format("Savings account balance: %.2s", this.savingsAcct);
    }

    public void setInvestmentRate(double investmentRate) {
        this.investmentRate = investmentRate;
    }

    public double getInvestmentRate() {
        return this.investmentRate;
    }

    public void depositInvestment(double amount) {

    }

    public void withdrawalInvestment(double amount) {

    }

    public String getInvestmentBalance() {
        return String.format("Investment account balance: %s.2", this.investmentAcct);
    }
}
