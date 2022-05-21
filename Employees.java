package com.company;

import java.util.ArrayList;

public class Employees extends PayrollSystem{

    protected ArrayList<String> Employee_Name = new ArrayList<String>();
    protected ArrayList<String> Employee_Id = new ArrayList<String>();
    protected ArrayList<String> Employee_Contact = new ArrayList<String>();
    protected int i=0;

    public void Employee_Name(){
        Employee_Name.add("M. Zain Shahzad");
        Employee_Name.add("Huzaifa Shezad");
        Employee_Name.add("Minhaj-uddin");
        Employee_Name.add("Ayush  Kumar");
        Employee_Name.add("Hassan Mehmood");
        Employee_Name.add("M. Mutahir Ali");
        Employee_Name.add("M. Bilal Sheikh");
        Employee_Name.add("Hawa  Suriya");
        Employee_Name.add("Arham  Hasan");
        Employee_Name.add("Saad   Aleem");
    }

    public void Employee_Id(){
        Employee_Id.add("SP21-BSCS-0078");
        Employee_Id.add("SP21-BSCS-0001");
        Employee_Id.add("SP21-BSCS-0056");
        Employee_Id.add("SP21-BSCS-0086");
        Employee_Id.add("SP21-BSCS-0045");
        Employee_Id.add("SP21-BSCS-0023");
        Employee_Id.add("SP21-BSCS-0029");
        Employee_Id.add("SP21-BSCS-00076");
        Employee_Id.add("SP21-BSCS-0046");
        Employee_Id.add("SP21-BSCS-0019");
    }

    public void Employee_Contact(){
        Employee_Contact.add("03120255506");
        Employee_Contact.add("03125254508");
        Employee_Contact.add("03000255899");
        Employee_Contact.add("03220444566");
        Employee_Contact.add("03118855664");
        Employee_Contact.add("03154578766");
        Employee_Contact.add("03334862586");
        Employee_Contact.add("03127844762");
        Employee_Contact.add("03004753176");
        Employee_Contact.add("03185534873");
    }

    public void AddEmployee(String EmployeeName,String EmployeeId,String EmployeeContact, int BasicPay){
        Employee_Contact.add(EmployeeContact);
        Employee_Id.add(EmployeeId);
        Employee_Name.add(EmployeeName);
        basicPay.add(BasicPay);
    }

    public void DisplayEmployeePortfolio(){
        System.out.println("=============================================================================================================");
        System.out.println("|                                     M.A.J.U CAFETERIA EMPLOYEE PORTFOLIO                                  |");
        System.out.println("=============================================================================================================");
        System.out.println("|          NAME             |           ID           |         CONTACT          |         NET PAY           |");
        System.out.println("-------------------------------------------------------------------------------------------------------------");

        for (i=0;i<Employee_Name.size();i++){

            System.out.println("|\t\t"+Employee_Name.get(i)+"\t\t|\t\t"+Employee_Id.get(i)+"\t |\t\t"+Employee_Contact.get(i)+"\t\t\t|\t\t\t"+Netpay.get(i)+"\t\t\t|");
            System.out.println("-------------------------------------------------------------------------------------------------------------");
        }

    }
}
