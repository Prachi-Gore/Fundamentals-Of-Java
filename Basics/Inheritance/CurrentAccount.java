package com.prachi;

import com.sun.security.ntlm.Client;

public class CurrentAccount extends Account{
    private double limitBelowZero;
    public CurrentAccount(int id, double balance, Client client,double limitBelowZero) {
        super(id, balance, client);
        this.limitBelowZero=limitBelowZero;
    }

    @Override
    public boolean withdraw(double amount) {
        if (super.getBalance()-amount<limitBelowZero)
            return false;
        setBalance(super.getBalance()-amount);
        super.transactions.add(new Transaction('w',amount,super.getBalance(),"withdrawn "+amount));

        return true;
    }

    @Override
    public String toString() {
        return super.toString()+" CurrentAccount{" +
                "limitBelowZero=" + limitBelowZero +
                '}';
    }
}
