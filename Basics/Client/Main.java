package com.prachi;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        ArrayList<Account> accounts=new ArrayList<>();

        Client client=new Client(100,"Rushank","123457896");

        accounts.add(new Account(1,2000,1.5,client));
        accounts.add(new Account(2,4000,2.5,client));

        accounts.get(0).withdraw(200);// due to this withdraw and deposite our transaction array is getting updated
        accounts.get(0).withdraw(500);
        accounts.get(0).deposite(000);

        accounts.get(1).withdraw(200);
        accounts.get(1).deposite(500);
        accounts.get(1).deposite(000);



        for (Account account:accounts){
            System.out.println("Account "+account.getId()+":");
            System.out.println("W: "+account.countTransactions('W'));//when we call this method it takes help of transaction
            System.out.println("D: "+account.countTransactions('D'));// array to get the type of the transaction
            System.out.println("Remains: "+ account.getBalance());
        }


    }
}
