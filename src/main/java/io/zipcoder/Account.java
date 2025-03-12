package io.zipcoder;
import java.util.ArrayList;

public abstract class Account {
    public  String acctHolder;
    private double balance;
    public Integer acctNum;
    private ArrayList<String> transactionHistory;
    private double checkingAcct;
    private double savingsAcct;
    private double investmentAcct;

    public Account(String acctHolder, Integer accountNum) {
        this.acctHolder = acctHolder;
        this.acctNum = acctNum;
        this.balance = 0.0;
        this.checkingAcct = checkingAcct;
        this.savingsAcct = savingsAcct;
        this.investmentAcct = investmentAcct;
    }


}
