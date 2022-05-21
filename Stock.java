package com.company;

import java.util.ArrayList;

public class Stock {

    protected ArrayList<String> Product_name = new ArrayList<String>();
    protected ArrayList<String> Product_code = new ArrayList<String>();
    protected ArrayList<Integer> Product_price = new ArrayList<Integer>();
    protected ArrayList<Integer> discount = new ArrayList<Integer>();


    public void Product_name(){
        Product_name.add("Lays");
        Product_name.add("Samosa");
        Product_name.add("Coffee");
        Product_name.add("Salanty");
        Product_name.add("Kurkure");
        Product_name.add("Burger");
        Product_name.add("Chaat");
        Product_name.add("Coke");
        Product_name.add("Marinda");
        Product_name.add("7-UP");
    }

    public void AddProduct(String ProductName, String ProductCode, int ProductPrice){
        Product_price.add(ProductPrice);
        Product_name.add(ProductName);
        Product_code.add(ProductCode);
    }

    public void Product_code(){
        Product_code.add("01");
        Product_code.add("02");
        Product_code.add("03");
        Product_code.add("04");
        Product_code.add("05");
        Product_code.add("06");
        Product_code.add("07");
        Product_code.add("08");
        Product_code.add("09");
        Product_code.add("10");
    }

    public void Product_price(){
        Product_price.add(50);
        Product_price.add(15);
        Product_price.add(70);
        Product_price.add(10);
        Product_price.add(20);
        Product_price.add(200);
        Product_price.add(80);
        Product_price.add(40);
        Product_price.add(40);
        Product_price.add(40);
    }
}
