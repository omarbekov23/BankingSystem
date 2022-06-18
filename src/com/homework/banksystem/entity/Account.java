package com.homework.banksystem.entity;

public class Account {

    private Bill bill;

    private Person accountHolder;

    public Bill getBill() {
        return bill;
    }

    public void setBill(Bill bill) {
        this.bill = bill;
    }

    public Person getAccountHolder() {
        return accountHolder;
    }

    public void setAccountHolder(Person accountHolder) {
        this.accountHolder = accountHolder;
    }

    public Account(Bill bill, Person accountHolder) {
        this.bill = bill;
        this.accountHolder = accountHolder;
    }
}
