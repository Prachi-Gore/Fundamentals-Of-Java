package com.prachi;

import java.util.Date;

public class Transaction {
    char type;      //W:withdraw D:Deposite
    double amount;
    double balance;
    Date date=new Date();
    String description;

    public Transaction(char type, double amount, double balance, String description) {
        this.type = type;
        this.amount = amount;
        this.balance = balance;
        this.description = description;

        this.date=new Date(); // here date is not given by user
    }
}
