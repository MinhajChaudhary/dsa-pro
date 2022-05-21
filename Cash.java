package com.company;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Cash extends BillingSystem{

    protected int cash,returnamount;

    public void PaymentMethod() {

        Scanner sc = new Scanner(System.in);

        System.out.println("Select any code of product, that you wanna eat today :)");
        select = sc.nextInt();

    }

    public void SetCash(int cash){
        this.cash=cash;
    }

    public void deduct(){



        switch (select){
            case 1:
                discounted_price = Product_price.get(0);
                selected_product = Product_name.get(0);
                original_price = Product_price.get(0);
                break;
            case 2:
                discounted_price = Product_price.get(1);
                selected_product = Product_name.get(1);
                original_price = Product_price.get(1);
                break;
            case 3:
                discounted_price = Product_price.get(2);
                selected_product = Product_name.get(2);
                original_price = Product_price.get(2);
                break;
            case 4:
                discounted_price = Product_price.get(3);
                selected_product = Product_name.get(3);
                original_price = Product_price.get(3);
                break;
            case 5:
                discounted_price = Product_price.get(4);
                selected_product = Product_name.get(4);
                original_price = Product_price.get(4);
                break;
            case 6:
                discounted_price = Product_price.get(5);
                selected_product = Product_name.get(5);
                original_price = Product_price.get(5);
                break;
            case 7:
                discounted_price = Product_price.get(6);
                selected_product = Product_name.get(6);
                original_price = Product_price.get(6);
                break;
            case 8:
                discounted_price = Product_price.get(7);
                selected_product = Product_name.get(7);
                original_price = Product_price.get(7);
                break;
            case 9:
                discounted_price = Product_price.get(8);
                selected_product = Product_name.get(8);
                original_price = Product_price.get(8);
                break;
            case 10:
                discounted_price = Product_price.get(9);
                selected_product = Product_name.get(9);
                original_price = Product_price.get(9);
                break;
            default:
                System.out.println("wrong selection");
                break;
        }

        returnamount = cash - original_price;

    }

    public String billPrint(){
        return "\n======================================" +
                "\n         M.A.J.U CAFETERIA BILL      |" +
                "\n======================================" +
                "\nSELECTED PRODUCT       |\t"+selected_product+"\t |" +
                "\nORIGINAL PRICE         |\t"+original_price+"\t\t |" +
                "\nDISCOUNT FOR GUEST     |\t0%\t\t |" +
                "\nTOTAL                  |\t"+discounted_price+"\t\t |" +
                "\nCASH RECEIVE           |\t"+cash+"\t\t |" +
                "\nRETURN AMOUNT          |\t"+returnamount+"\t\t |" +
                "\n--------------------------------------" +
                "\nTRANSACTION RECORDED BY              |" +
                "\nCASH                                 |" +
                "\n======================================";
    }

    public void save(){
        try {
            FileWriter myWriter = new FileWriter("GuestBillCopy.txt");
            myWriter.write(billPrint());
            myWriter.close();
            System.out.println("Successfully wrote to the file.");
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
}
