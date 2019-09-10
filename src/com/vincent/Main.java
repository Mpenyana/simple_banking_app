package com.vincent;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Bank bank = new Bank("First National Bank");

        bank.addBranch("South Gate Mall");
        bank.addCustomer("South Gate Mall", "Jake", 200.00);
        bank.addCustomerTransaction("South Gate Mall", "Jake",
                3000.20);


        bank.addBranch("East Gate Mall");
        bank.addCustomer("East Gate Mall", "Jenny", 2500 );
        bank.addCustomerTransaction("East Gate Mall", "Jenny", 1700.5);



        bank.listCustomers("South Gate Mall", true);
        bank.listCustomers("East Gate Mall", false);


    }
}
