package com.homework.banksystem.entity.service;

import com.homework.banksystem.entity.Account;

public class TransferService {

    public void transfer(Account accountFrom,Account accountTo,int amount){
        int billFromAmount = accountFrom.getBill().getAmount();
        int billToAmount = accountTo.getBill().getAmount();
        if (billFromAmount < amount){
            System.out.println("Перевод невозможен, не хватает средств");
        }else {
            System.out.println("Происходит перевод средств с счета - " + accountFrom.getAccountHolder().getName() +
                    " на счет - " + accountTo.getAccountHolder().getName());

            accountFrom.getBill().setAmount(billFromAmount - amount);
            accountTo.getBill().setAmount(billToAmount + amount);

            System.out.println("Перевод успешно завершен, текущий счет: " + accountTo.getAccountHolder().getName() + "да " + accountTo.getBill().getAmount());
        }
    }
}
