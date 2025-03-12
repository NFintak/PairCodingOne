package io.zipcoder;

public class PersonAcct extends Account {
    private String lastName;
    private String email;
    private Integer phoneNumber;

    public PersonAcct(String acctHolder, Integer acctNum, String lastName, String email, Integer phoneNumber) {
        super(acctHolder, acctNum);
        this.lastName = lastName;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }

    public PersonAcct(String acctHolder, Integer acctNum, String lastName) {
        super(acctHolder, acctNum);
        this.lastName = lastName;
        this.email = "";
        this.phoneNumber = null;
    }

    public PersonAcct(String acctHolder, Integer acctNum, String lastName, String email) {
        super(acctHolder, acctNum);
        this.lastName = lastName;
        this.email = email;
        this.phoneNumber = null;
    }

    public PersonAcct(String acctHolder, Integer acctNum, String lastName, Integer phoneNumber) {
        super(acctHolder, acctNum);
        this.lastName = lastName;
        this.email = "";
        this.phoneNumber = phoneNumber;
    }

    public String getLastName() {
        return this.lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return this.email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Integer getPhoneNumber() {
        return this.phoneNumber;
    }

    public void setPhoneNumber(Integer phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
}
