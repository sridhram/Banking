package com.ram;

import java.util.Scanner;

public class Main {
private static Scanner scanner=new Scanner(System.in);
    public static void main(String[] args) {
	    Bank bank=new Bank();
	    int ch;
	    double money=500.0;
	    Branches branches=new Branches("Chennai");
	    bank.setBranches(branches);
        Branches branches1=new Branches("Bangalore");
        bank.setBranches(branches1);
        Branches branches2=new Branches("Hyderabad");
        bank.setBranches(branches2);
        Branches branches3=new Branches("Delhi");
        bank.setBranches(branches3);
        System.out.println("Welcome to the BANK");
        do{
            System.out.println("Branches...\n1. Chennai\n2. Bangalore\n" +
                    "3.Hyderabad\n4.Delhi");
            System.out.println("Enter the choice of branch");
             ch=scanner.nextInt();

            int ch1=0;
            while(ch1!=7){
                System.out.println("Enter the choice of action\n" +
                        "1. Print all the customers of that branch\n" +
                        "2. Add customer\n3. Query a customer\n4. Transaction\n" +
                        "5. Print all transaction of the customer" +
                        "\n6. All transactions of all the customers of a branch" +
                        "\n7. Quit");
             ch1=scanner.nextInt();
             scanner.nextLine();
            if(ch1==7)
                break;
            switch (ch1) {
                case 1: {
                    Branches b=bank.getBranches(ch-1);
                    b.printcustomers();
                    break;
                }
                case 2: {
                    System.out.println("Enter the name of the customer");
                    String name = scanner.nextLine();
                    System.out.println("You can enter the amount to be initial deposit or rs 500 is initially");
                    System.out.println("Press 1 to enter amount deposit else press 2");
                    int ch3=scanner.nextInt();
                    if(ch3==1)
                    {System.out.println("Branches...\n1. Chennai\n2. Bangalore\n" +
                            "3.Hyderabad\n4.Delhi");
                        System.out.println("Enter the choice of branch");
                        ch=scanner.nextInt();
                        System.out.println("Enter the initial amount");
                        money=scanner.nextDouble();
                        bank.branch(ch-1,name,money);}
                    else if (ch3==2)
                        bank.branch(ch-1,name,money);
                    else
                        System.out.println("Enter the correct choice");
                    break;
                }
                case 3:
                {System.out.println("Branches...\n1. Chennai\n2. Bangalore\n" +
                        "3.Hyderabad\n4.Delhi");
                    System.out.println("Enter the choice of branch");
                    ch=scanner.nextInt();
                    System.out.println("Enter the name of the customer");
                    String name=scanner.nextLine();
                    Branches branches4=bank.getBranches(ch-1);
                    //System.out.println(branches4.getName());
                    branches4.getcustomer(name);
                    break;
                }
                case 4:{
                    System.out.println("Enter the name of the customer");
                    String name=scanner.nextLine();
                    Customers customers=branches.findcustomer(name);
                    System.out.println("1. Deposit\n2. Withdrawl\nEnter your choice");
                    int chz=scanner.nextInt();
                    System.out.println("Enter the amount");
                    double mo=scanner.nextDouble();
                    customers.transaction(chz,mo);
                }
                case 5:
                { System.out.println("Branches...\n1. Chennai\n2. Bangalore\n" +
                        "3.Hyderabad\n4.Delhi");
                    System.out.println("Enter the choice of branch");
                    ch=scanner.nextInt();
                    System.out.println("Enter the name of the customer");
                    String name=scanner.nextLine();
                    Branches branches4=bank.getBranches(ch-1);
                    branches4.rcustomer(name);
                    break;
                }
                case 6:
                {
                    Branches branches5=bank.getBranches(ch-1);
                    branches5.gettransactions();
                }
            }
            }
        }while(ch<1&&ch>4);
    }
}
