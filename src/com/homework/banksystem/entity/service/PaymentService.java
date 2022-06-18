package com.homework.banksystem.entity.service;

import com.homework.banksystem.entity.Account;
import com.homework.banksystem.entity.Bill;

public class PaymentService {

    public void pay(Account account,int amount){
        Bill bill = account.getBill();
        if (bill.getAmount() < amount){
            System.out.println("Платеж не возможен, недостаточно средств \n");
        }else {
            int currentBillAmount = bill.getAmount();
            System.out.println("Происходит опереация платежа, текущее значение счета: " + currentBillAmount);
            bill.setAmount(currentBillAmount - amount);
            System.out.println("Платеж завершен, новое значение счета: " + bill.getAmount() + "\n");
        }
    }
}
