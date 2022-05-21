package com.company;

import java.io.FileWriter;
import java.io.IOException;

public class SuppilerAccounts {

    private int purchase,purchaseReturn,paidCash,discountReceive,balanceBD;


       SuppilerAccounts(int purchase, int purchaseReturn, int paidCash, int discountReceive, int balanceBD){
           this.purchase=purchase;
           this.balanceBD=balanceBD;
           this.purchaseReturn=purchaseReturn;
           this.discountReceive=discountReceive;
           this.paidCash=paidCash;
       }

       public String CreditorAccount(){
           int big,debit,credit;

           debit=purchaseReturn+paidCash+discountReceive;

           credit=balanceBD+purchase;

           int be;
           //be= Ending balance

           if(credit>=debit)
           {
               big=credit;
               be=big-debit;
           }
           else
           {
               big=debit;
               be=big-credit;
           }

           return "\n-----------------------------------Account Payable Control Account-------------------------------" +
                   "\n\n\n___________________________DEBIT____________________________________________CREDIT______________" +
                   "\n|     DESCRIPTION            |       $$$        ||     DESCRIPTION            |       $$$       |" +
                   "\n|____________________________|__________________||____________________________|_________________|" +
                   "\n|			                 |		            || Balance b/d		          |\t\t"+balanceBD+" \t\t|" +
                   "\n|			                 |		            || Purchases		          |\t\t"+purchase+"\t\t|" +
                   "\n| Return Outward	         |\t\t"+purchaseReturn+"\t\t||			                  |	      	        |" +
                   "\n| Cash           	         |\t\t"+paidCash+"\t\t||			                  |		            |" +
                   "\n| Discount Recived	         |\t\t"+discountReceive+"\t\t||			                  |		            |" +
                   "\n|			                 |	                ||			                  |		            |" +
                   "\n| Balance c/d		         |\t\t"+be+"\t\t||		             	      |		            |" +
                   "\n|			                 |\t\t"+big+"\t\t||                            |\t\t"+big+"\t\t|" +
                   "\n|			                 |                  || Balance b/d                |\t\t"+be+"\t\t|" +
                   "\n|____________________________|__________________||____________________________|_________________|";
       }

    public void save(){
        try {
            FileWriter myWriter = new FileWriter("SupplierAccounts.txt");
            myWriter.write(CreditorAccount());
            myWriter.close();
            System.out.println("Successfully wrote to the file.");
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }

}
