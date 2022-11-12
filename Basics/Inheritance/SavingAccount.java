package com.prachi;

import com.sun.security.ntlm.Client;

public class SavingAccount extends Account{
    private double annualInterest;
    public SavingAccount(int id, double balance, Client client,double annualInterest) {
        super(id, balance, client);
        this.annualInterest=annualInterest;
    }

    public double getAnnualInterest() {
        return annualInterest;
    }

    public void setAnnualInterest(double annualInterest) {
        this.annualInterest = annualInterest;
    }

    @Override
    public String toString() {
        return  super.toString()+" SavingAccount{" +
                "annualInterest=" + annualInterest +
                '}';
    }
}
