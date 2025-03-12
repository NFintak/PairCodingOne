package io.zipcoder;

public class PersonAcct extends Account {
    private String lastName;
    private String email;
    private String phoneNumber;

    public PersonAcct(String acctHolder, Integer acctNum, String lastName, String email, String phoneNumber) {
        super(acctHolder, acctNum);
        this.lastName = lastName;
        this.email = email;
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

    public String getPhoneNumber() {
        return this.phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
}
