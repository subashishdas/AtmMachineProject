package com.subashish;

import java.util.HashMap;
import java.util.Map;

public class AtmOperationImpl implements AtmInterface {
    ATM atm = new ATM();
    Map<Double,String> ministmt = new HashMap<>();
    @Override
    public void viewBalanace() {
        System.out.println("Available Balance is : " + atm.getBalance());
    }

    @Override
    public void withdrawAmount(double withdrawAmount) {
    if(withdrawAmount < atm.getBalance()){
        ministmt.put(withdrawAmount, "Amount withdrawn");
        System.out.println(withdrawAmount + " Withdrawn Successfully !");
        System.out.println("Please Collect the cash before leaving");
        viewBalanace();
    }else{
        System.out.println("Insufficient Balance");
        System.out.println("Please add some funds to your Account");
    }
    }

    @Override
    public void depositAmount(double depositAmount) {
        ministmt.put(depositAmount, "Amount deposited");
        System.out.println(depositAmount + "  Deposited Successfully !");
        atm.setBalance(atm.getBalance() + depositAmount);
        viewBalanace();
    }

    @Override
    public void viewMiniStatement() {
    for(Map.Entry<Double,String> m: ministmt.entrySet()){
        System.out.println(m.getKey()+ " "+ m.getValue());
    }
    }
}
