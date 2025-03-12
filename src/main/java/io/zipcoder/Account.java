package io.zipcoder;
import java.util.ArrayList;

public abstract class Account {
    public String acctHolder;
    private double balance;
    final public Integer acctNum;
    private ArrayList<String> transactionHistory; //make separate class to store info
    private double checkingAcct; //don't worry abt interest rate for now
    private double savingsAcct; //don't worry abt interest rate for now
    private double investmentAcct; //don't worry abt interest rate for now
    private Boolean overdraftToggle;

    public Account(String acctHolder, Integer acctNum) {
        this.acctHolder = acctHolder;
        this.acctNum = acctNum;
        this.balance = 0.0;
        this.checkingAcct = 0.0;
        this.savingsAcct = 0.0;
        this.investmentAcct = 0.0;
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


}
