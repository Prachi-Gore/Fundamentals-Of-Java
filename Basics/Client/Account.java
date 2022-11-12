package com.prachi;
import java.util.ArrayList;
import java.util.Date;

public class Account {
    int id;
    double balance;
    double annualInterestRate;
    Date dateCreated;
    Client client ;
    ArrayList<Transaction> transactions;

    public Account(int id, double balance, double annualInterestRate,Client client) {
        this.id = id;
        this.balance = balance;
        this.annualInterestRate = annualInterestRate;
        this.dateCreated = new Date();
        this.client=client;

        this.transactions=new ArrayList<>();
    }
    public boolean withdraw(double amount) {
        if (this.balance - 1000.0D >= amount) {
            this.balance -= amount;
            this.transactions.add(new Transaction('W',amount,balance,"withdrawn "+amount));
            return true;
        }
       return false;
    }

    public void deposite(double amount) {
        this.balance += amount;
        this.transactions.add(new Transaction('D',amount,balance,"Deposited "+amount));
    }

    public int countTransactions(char type) {
        int count = 0;
        for (Transaction transaction : transactions)
            if (transaction.type==type)
                count ++;
        return count;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getBalance() {
        return this.balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double getAnnualInterestRate() {
        return this.annualInterestRate;
    }

    public void setAnnualInterestRate(double annualInterestRate) {
        this.annualInterestRate = annualInterestRate;
    }

    public String toString() {
        return this.id + " " + this.balance + " " + this.annualInterestRate + " " + this.dateCreated;
    }
}

