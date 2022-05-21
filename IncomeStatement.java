package com.company;

import java.io.FileWriter;
import java.io.IOException;

public class IncomeStatement {

        private int sales, purchases, inventory;
        private int salaries, motor, rent, insurance, general, business;
        private int gp,np,cogs;

        IncomeStatement(int sales, int purchases, int inventory, int salaries, int motor, int rent, int insurance, int general, int business) {
                this.salaries=salaries;
                this.purchases=purchases;
                this.insurance=insurance;
                this.inventory=inventory;
                this.rent=rent;
                this.motor=motor;
                this.sales=sales;
                this.general=general;
                this.business=business;
        }


        public String IS(){

                cogs= purchases - inventory;
                gp= sales - cogs;

                int operating = salaries + general + motor + insurance + business + rent;

                np= gp-operating;

                return "\n\n-------------------INCOME STATEMENT----------------------" +
                        "\n\n_________________________________________________________" +
                        "\n		                	 |     $$$$	 |      $$$$    |" +
                        "\n			                 |		     |	         	|" +
                        "\nsales                        |      	 |\t\t"+sales+"\t|" +
                        "\n		                     | 	 	     |		        |" +
                        "\nLess: Cost Of Good Sold      |		     |	         	|" +
                        "\nPurchases                    |\t "+purchases+" \t |	        	|" +
                        "\nInventory at end	         |\t("+inventory+")\t |	         	|" +
                        "\nC.O.G.S		                 |	         |\t\t("+cogs+")\t|" +
                        "\n		                     |	         |	        	|" +
                        "\nGross profit		         |	         |\t\t"+gp+"\t|" +
                        "\n  		                     |	      	 |	        	|" +
                        "\nLess: Operating Expenses     |		     |	        	|" +
                        "\nSalaries Expense	         |\t "+salaries+"\t |		        |" +
                        "\nGeneral Expense              |\t "+general+"\t |	        	|" +
                        "\nMotor Expense		         |\t "+motor+"\t |		        |" +
                        "\nInsurance Expense	         |\t "+insurance+"\t |		        |" +
                        "\nBusiness rates		         |\t "+business+"\t |		        |" +
                        "\nRent Expense	       	     |\t "+rent+"\t |              |" +
                        "\nTotal Operating Expenses:    |	 	     |\t\t("+operating+")\t|" +
                        "\n			                 |	    	 |		        |" +
                        "\nNet Profit:		             |		     |\t\t"+np+"\t|" +
                        "\n________________________________________________________|";

        }

        public void save(){
                try {
                        FileWriter myWriter = new FileWriter("IncomeStatement.txt");
                        myWriter.write(IS());
                        myWriter.close();
                        System.out.println("Successfully wrote to the file.");
                } catch (IOException e) {
                        System.out.println("An error occurred.");
                        e.printStackTrace();
                }
        }


}
