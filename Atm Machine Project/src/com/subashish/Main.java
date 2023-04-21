package com.subashish;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        AtmInterface op = new AtmOperationImpl();
        int accountNumber = 12345;
        int pin = 123;

        Scanner in = new Scanner(System.in);
        System.out.println("Welcome to my ATM");
        System.out.print("Enter Account Number : ");
        int atmNumber = in.nextInt();

        System.out.print("Enter Pin : ");
        int atmPin = in.nextInt();

        if((accountNumber == atmNumber) && (pin == atmPin)){
            System.out.println("Login Successful");
            while (true){
                System.out.println("1.View Available Balance\n2.Withdraw Amount\n3.Deposit Amount\n4.View Mini Statements\n5.Exit");
                System.out.println("Enter Choices : ");
                int choice = in.nextInt();
                switch (choice) {
                    case 1 -> {
                        op.viewBalanace();
                        continue;
                    }
                    case 2 -> {
                        System.out.println("Enter Amount to Withdraw");
                        double withdrawAmount = in.nextDouble();
                        op.withdrawAmount(withdrawAmount);
                        System.exit(0);
                        continue;
                    }
                    case 3 -> {
                        System.out.println("Enter Amount to deposit : ");
                        double depositAmount = in.nextDouble();
                        op.depositAmount(depositAmount);
                        continue;
                    }
                    case 4 -> {
                        op.viewMiniStatement();
                        continue;
                    }
                    case 5 -> {
                        System.out.println("Collect your ATM Card\nThanks for Visiting Us");
                        System.exit(0);
                    }
                    default -> System.out.println("Please Enter Correct Choice");
                }
            }
        }else{
            System.out.println("Incorrect Atm Number or Pin");
            System.exit(0);
        }
    }
}
