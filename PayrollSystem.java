package com.company;

import java.util.ArrayList;

public class PayrollSystem{
     protected ArrayList<Integer> basicPay = new ArrayList<Integer>();
     protected ArrayList<Integer> Income_Tax = new ArrayList<Integer>();
     protected ArrayList<Integer> OtherDeduction = new ArrayList<Integer>();
     protected ArrayList<Integer> Netpay = new ArrayList<Integer>();
    protected int i=0;

    public void basicPay(){
        basicPay.add(10000);
        basicPay.add(12000);
        basicPay.add(15000);
        basicPay.add(17000);
        basicPay.add(8000);
        basicPay.add(11000);
        basicPay.add(16000);
        basicPay.add(18000);
        basicPay.add(20000);
        basicPay.add(7000);
    }

    public void Income_Tax() {

        for (i = 0; i <basicPay.size(); i++) {
            Income_Tax.add((int) (basicPay.get(i) * 0.1));
        }

    }

    public void OtherDeduction(){

        for(i=0;i<basicPay.size();i++){
            OtherDeduction.add((int) (basicPay.get(i) * 0.08)) ;
        }
    }

    public void Netpay() {

        for(i=0;i<basicPay.size();i++){
            Netpay.add(basicPay.get(i) - Income_Tax.get(i) - OtherDeduction.get(i)) ;
        }
    }

}
