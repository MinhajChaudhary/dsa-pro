package com.company;


public abstract class BillingSystem extends Stock{

    //String P_code[] = new String[10];

    protected int select,pay_method,i,discounted_price,original_price;
    protected String selected_product;


    public void menu(){
        System.out.println("=====================================");
        System.out.println("| CODE  |        NAME       | PRICE |");
        System.out.println("=====================================");
        for (i=0;i<Product_name.size();i++) {
                System.out.print("|\t");
                System.out.print(Product_code.get(i)); // code
                System.out.print("\t|");
                System.out.print("\t\t");
                System.out.print(Product_name.get(i)); //name
                System.out.print("\t\t");
                System.out.print("|\t");
                System.out.print(Product_price.get(i)); // price
                System.out.println("\t|");
            System.out.println("-------------------------------------");
            }
        //System.out.println("=====================================");
        }

    public abstract void PaymentMethod();

    public abstract void deduct();

}
