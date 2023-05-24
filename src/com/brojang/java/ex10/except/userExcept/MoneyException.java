package com.brojang.java.ex10.except.userExcept;

public class MoneyException extends  Exception {
    public MoneyException(){}

    public MoneyException(String message){
        super(message);
    }
}
