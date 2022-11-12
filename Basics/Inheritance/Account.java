package com.prachi;

import com.sun.security.ntlm.Client;

import java.util.ArrayList;
import java.util.Date;

public class Account<Transaction> {
    private int id;
    private double balance;
    private Date dateCreated;
    private Client client;
    protected ArrayList<Transaction> transactions;

    public Account(int id ,double balance,Client client) {
        this.id=id;
        this.balance=balance;
        dateCreated=new Date();
    }

    public Account() {

    }

    public boolean withdraw(double amount){
        if (balance-1000>=amount) {
            balance -=amount;
            return true;
        }
        return false;
    }
    public void deposite(double amount){
        balance+=amount;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }


    public String toString(){
        return this.id+" "+this.balance+" "+this.dateCreated+"\n"+transactions;
    }
}