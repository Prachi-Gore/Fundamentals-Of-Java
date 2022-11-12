package com.prachi;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        Client client=new Client(100,"PRACHI","1245536987");
        Account [] accounts=new Account[2];
//     accounts[0]=new SavingAccount(1,1000,client,4.5);
//     accounts[0].withdraw(500);
//     accounts[0].deposite(200);

     accounts[1]=new CurrentAccount(2,2000,client,-200);
        accounts[1].withdraw(2000);
        accounts[1].withdraw(200);
        accounts[1].withdraw(100);
        accounts[1].deposite(300);

        System.out.println(Arrays.toString(accounts));

    }
}
