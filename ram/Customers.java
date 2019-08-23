package com.ram;

import java.util.ArrayList;

public class Customers {
    private String name;
    private double balance;
    private ArrayList<String>transactions=new ArrayList<>();
    public Customers(){}
    public ArrayList<String> getTransactions() {
        return transactions;
    }

    public String getName() {
        return name;
    }

    public Customers(String name, double money){
        this.name=name;
        this.balance=money;
        String m="+ "+money;
        transactions.add(m);
    }
    public void transaction(int ch,double deduct){
        if(ch==1){
            balance+=deduct;
            System.out.println("The new balance is "+balance);
            String m="+ "+deduct;
            transactions.add(m);
        }
        else
        {
            balance-=deduct;
            System.out.println("The new balance is "+balance);
            String m="- "+deduct;
            transactions.add(m);
        }
    }
}
