package com.homework.banksystem.entity.service;

import com.homework.banksystem.entity.Account;
import com.homework.banksystem.entity.Bill;

public class DepositService {

    public void deposit(Account account, int amount){
        Bill bill = account.getBill();
        int currentBillAmount = bill.getAmount();
        System.out.println("Операция пополнение счета, текущее значение счета: " + currentBillAmount);
        bill.setAmount(currentBillAmount + amount);
        System.out.println("Пополнение счета прошло успешно, новое значение счета: " + bill.getAmount());
    }
}
