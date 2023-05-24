package com.brojang.java.ex10.except.userExcept;

public class Account {
    private int deposit;

    public Account() {
    }

    public int getAccount() {
        return deposit;
    }

    public void plusMoney(int money) {
        deposit += money;
    }

    public void minusMoney(int money) throws MoneyException {
        if(deposit < money){
            throw new MoneyException("잔액 부족");
        }
        deposit -= money;
    }
}
