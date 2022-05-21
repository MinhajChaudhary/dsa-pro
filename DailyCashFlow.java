package com.company;

import java.io.FileWriter;
import java.io.IOException;

public class DailyCashFlow {

    private int sales,expense;


    DailyCashFlow(int sales, int expense){

        this.expense=expense;
        this.sales=sales;

    }

    public String cashFlow(){
        int total= sales - expense;

        return "==================================================\n" +
                "                 Daily Cash Flow                 |\n" +
                "==================================================\n" +
                "Sales                          |\t\t"+sales+"\t |\n" +
                "Expense                        |\t\t"+expense+"\t |\n" +
                "==================================================\n" +
                "Total Cash-In                  |\t\t"+total+"\t |\n" +
                "==================================================";
    }

    public void save(){
        try {
            FileWriter myWriter = new FileWriter("CashFlow.txt");
            myWriter.write(cashFlow());
            myWriter.close();
            System.out.println("Successfully wrote to the file.");
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
}
