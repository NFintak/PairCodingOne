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

    public Account(String acctHolder, Integer acctNum) {
        this.acctHolder = acctHolder;
        this.acctNum = acctNum;
        this.balance = 0.0;
        this.checkingAcct = 0.0;
        this.savingsAcct = 0.0;
        this.investmentAcct = 0.0;
    }


}
