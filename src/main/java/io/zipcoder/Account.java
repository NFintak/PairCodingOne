package io.zipcoder;
import java.util.ArrayList;

public abstract class Account {
    private String acctHolder;
    private double balance;
    private Integer accountNum;
    private ArrayList<String> transactionHistory;
    private double checkingAcct;
    private double savingsAcct;
    private double investmentAcct;

    public Account(String acctHolder, Integer accountNum) {
        this.acctHolder = acctHolder;
        this.accountNum = accountNum;
        this.balance = 0.0;
    }
}
