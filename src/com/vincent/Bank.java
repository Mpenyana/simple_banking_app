package com.vincent;

import java.util.ArrayList;

public class Bank {
    private String name;
    private ArrayList<Branch> branches;

    public Bank(String name) {
        this.name = name;
        this.branches = new ArrayList<>();
    }

    public boolean addBranch(String branchName){
        if(findBranch(branchName) == null){
            this.branches.add(new Branch(branchName));
            return true;
        }

        return false;
    }

    public boolean addCustomer(String branchName, String customerName, double initialAmount){
        Branch selectedBranch = findBranch(branchName);
        if(selectedBranch != null){
            return  selectedBranch.newCustomer(customerName, initialAmount);
        }
        return false;
    }

    public boolean addCustomerTransaction(String branchName, String customerName, double amount){
        Branch foundBranch = findBranch(branchName);
        if(foundBranch != null){
            return foundBranch.addCustomerTransaction(customerName, amount);
        }

        return false;
    }

    private Branch findBranch(String name){
        for(int i=0; i<branches.size(); i++){
            Branch existingBranch = this.branches.get(i);
            if(existingBranch.getName().equals(name)){
                return existingBranch;
            }
        }
        return null;
    }


    public boolean listCustomers(String branchName, boolean showTransactions){
        Branch branch = findBranch(branchName);
        if(branch != null){
            System.out.println("\t CUSTOMERS FOR BRANCH: " + branch.getName());

            ArrayList<Customer> branchCustomers = branch.getCustomers();
            for(int i=0; i<branchCustomers.size(); i++){
                System.out.println("[" +  (i+1 )+ "] " + branchCustomers.get(i).getName());
                if(showTransactions){
                    System.out.println("\t TRANSACTIONS: ");
                    ArrayList<Double> transactions = branchCustomers.get(i).getTransactions();
                    for(int k = 0; k< transactions.size(); k++){
                        System.out.println("[" +  (k+1 )+ "] " + transactions.get(k));
                    }
                }
                else{
                    return false;
                }
            }
            return true;

        }

        return false;
    }

}