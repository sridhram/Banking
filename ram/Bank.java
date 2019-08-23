package com.ram;

import java.util.ArrayList;

public class Bank {
    private ArrayList<Branches>branches=new ArrayList<>();
    Branches branch =new Branches();

    public Branches getBranches(int ch) {
       Branches b= branches.get(ch);
        System.out.println("The branch name is "+b.getName());
        return b;
    }

    public void setBranches(Branches b) {
        branches.add(b);
    }


    private double money=1000.00;
    public void printall(){
        for(int i=0;i<branches.size();i++){
            System.out.println((i+1)+". "+branches.get(i).getName());
        }
    }
    public void branch(int ch,String Customer,double money){
           Branches branches1=branches.get(ch);
//        System.out.println(branches.get(ch).getName());
           branches1.addcustomer(Customer,money);
    }

}
