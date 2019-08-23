package com.ram;

import java.util.ArrayList;

public class Branches {
    private String name;
    ArrayList<Customers> customers=new ArrayList<>();
    Customers cus=new Customers();
    public Branches() {
    }

    public Branches(String name){
        this.name=name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
    public void gettransactions(){
        for(int i=0;i<customers.size();i++){
            Customers customers1=customers.get(i);
            System.out.println((i+1)+". "+customers1.getName());
            for (int j=0;j<customers1.getTransactions().size();j++){
                System.out.println("   "+(j+1)+". "+customers1.getTransactions().get(j)+"\n");
            }
        }
    }
    public void printcustomers(){
        if(customers.size()==0)
            System.out.println("zero customers");
        for (int i=0;i<customers.size();i++){
            Customers customers1=customers.get(i);
            System.out.println((i+1)+". "+customers1.getName());
        }
    }
    public Customers findcustomer(String name){
        int a=-1;
        for (int i=0;i<customers.size();i++){
            Customers customers1=customers.get(i);
            if(customers1.getName().equals(name)){
                a=customers.indexOf(customers1);break;}}
            Customers c=customers.get(a);
            return c;
    }
    public void rcustomer(String name){
        int a=-1;
        for (int i=0;i<customers.size();i++){
            Customers customers1=customers.get(i);
            if(customers1.getName().equals(name)){
                a=customers.indexOf(customers1);break;}}
        if(a>=0){
            Customers c=customers.get(a);
            System.out.println("Customer name: "+c.getName());
            for (int j=0;j<c.getTransactions().size();j++){
                System.out.println(c.getTransactions().get(j)+"\n");
            }

        }
        else
            System.out.println("Customer doesn't exist");
    }
    public void getcustomer(String name){
        int a=-1;
        for (int i=0;i<customers.size();i++){
            Customers customers1=customers.get(i);
            if(customers1.getName().equals(name)){
                a=customers.indexOf(customers1);break;}}
        if(a>=0){
            Customers c=customers.get(a);
            System.out.println("Customer is present\n"+c.getName());
        }
        else
            System.out.println("Customer doesn't exist");
    }
    public void addcustomer(String name,double money){

        if(customers.indexOf(name)>=0)
            System.out.println("Customer name already exist");
        else
        {Customers newcustomers=new Customers(name, money);
        customers.add(newcustomers);
        System.out.println("New customer has been added");
        }
    }
}
