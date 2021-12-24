package com.company;

public class Main {

    public static void main(String[] args) {
        int beginning_balance=100;
        int cash=1200;
        int bonus=0;
        int limit=1000;
        if (cash>limit){
            bonus=cash/100;
        }
        int closing_balance=cash+beginning_balance+bonus;
        System.out.println("итоговый баланс="+closing_balance);


    }
}
