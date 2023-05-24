package com.brojang.java.ex10.except.userExcept;

public class AccountEx1 {
    public static void main(String[] args) {
        Account account = new Account();

        // plus
        account.plusMoney(1000);
        System.out.println("잔액 : " + account.getAccount());

        // minus
        try {
            account.minusMoney(50000);
        } catch (MoneyException e) {
            String msg = e.getMessage();
            System.out.println(msg);
            e.printStackTrace();
        }
    }
}
