package com.homework.banksystem;

import com.homework.banksystem.entity.Account;
import com.homework.banksystem.entity.Bill;
import com.homework.banksystem.entity.Person;
import com.homework.banksystem.entity.service.DepositService;
import com.homework.banksystem.entity.service.PaymentService;
import com.homework.banksystem.entity.service.TransferService;

public class Main {
    public static void main(String[] args) {
        Person person = new Person("Lori","+23032303","Bil");
        Bill bill = new Bill(10000);
        Account account = new Account(bill,person);

        Person person1 = new Person("Azamat","5050505","Muratov");
        Bill bill1 = new Bill(20000);
        Account account1 = new Account(bill1,person1);

        PaymentService paymentService = new PaymentService();
        paymentService.pay(account,100);
        paymentService.pay(account1,2000);
        System.out.println("\n");


        DepositService depositService = new DepositService();
        depositService.deposit(account,10000);
        depositService.deposit(account1,20000);
        System.out.println("\n");

        TransferService transferService = new TransferService();
        transferService.transfer(account,account1,10000);
    }
}
