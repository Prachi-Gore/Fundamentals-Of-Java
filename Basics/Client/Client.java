package com.prachi;

import java.util.ArrayList;

public class Client {
    int id;
    String name;
    String phone;
    ArrayList<Account> accounts=new ArrayList<Account>();
    public Client(int id,String name,String phone){
        this.id=id;
        this.name=name;
        this.phone=phone;
    }
    public boolean addAccount(Account account){
        accounts.add(account);
        return true;
    }
    public boolean removeAccount(int accountId){
        for (Account account:accounts)// accounts is arraylist name and account is an elt of list
            if (account.getId()==accountId) {
                accounts.remove(accountId);
                return true;
            }
        return false;
    }
    public String toString(){
        String s=this.id+" "+this.name+" "+this.phone+"\n";

        for (Account account:accounts) {
            s += account.toString() + "\n";
        }
        return s;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
}
