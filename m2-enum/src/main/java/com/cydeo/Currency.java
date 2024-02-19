package com.cydeo;

public enum Currency {
    PENNY(1),NICKLE(5),DIME(10),QUARTER(25);


    private int value;

    public int getValue() {
        return value;
    }

    Currency(int value) {
        this.value = value;
    }





}
