package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        System.out.print("\n\n\t\t\t\t\t*        *  *******  *        *******   *******  **     **  *******");
        System.out.print("\n\t\t\t\t\t*        *  *	     *	      *	        *     *  * *   * *  *");
        System.out.print("\n\t\t\t\t\t*        *  ****     *	      *	        *     *  *  * *  *  ****");
        System.out.print("\n\t\t\t\t\t*  ****  *  *	     *	      *	        *     *  *   *   *  *");
        System.out.print("\n\t\t\t\t\t*  *  *  *  *	     *	      *	        *     *  *       *  *");
        System.out.print("\n\t\t\t\t\t****  ****  *******  *******  *******   *******  *       *  *******\n\n\n");

        System.out.print("\t\t\t\t\t*********  ********       ********  ********  ********  ********");
        System.out.print("\n\t\t\t\t\t    *      *      *       *         *      *  *         *       ");
        System.out.print("\n\t\t\t\t\t    *      *      *       *         *      *  *         *       ");
        System.out.print("\n\t\t\t\t\t    *      *      *       *         ********  ****      ****    ");
        System.out.print("\n\t\t\t\t\t    *      *      *       *         *      *  *         *       ");
        System.out.print("\n\t\t\t\t\t    *      ********       ********  *      *  *         ********");


        Scanner sc = new Scanner(System.in);
        Scanner s = new Scanner(System.in);
        Scanner scc = new Scanner(System.in);
        boolean exit = false;


        do {

        System.out.println("\n\n\nPRESS 1: Customer\nPress 2: Management\nPress 3: To Exit");
        int menu1 = sc.nextInt();


        switch (menu1) {
                case 1:

                    do {

                        System.out.println("\n\nWould you like to pay by Membership Card / Credit Card or Cash?\nPress 1: Membership Card\nPress 2: Credit Card\nPress 3: Cash\nPress 4: To Exit");
                        int pay_method = sc.nextInt();

                        switch (pay_method) {
                            case 1:
                                MembershipCard membershipCard = new MembershipCard();
                                membershipCard.Product_name();
                                membershipCard.Product_code();
                                membershipCard.Product_price();
                                membershipCard.menu();
                                membershipCard.PaymentMethod();
                                membershipCard.deduct();
                                System.out.println(membershipCard.billPrint());
                                membershipCard.save();
                                System.out.println("Copy of Bill Save in file");
                                break;
                            case 2:
                                CreditCard creditCard = new CreditCard();
                                creditCard.Product_name();
                                creditCard.Product_code();
                                creditCard.Product_price();
                                creditCard.menu();
                                creditCard.PaymentMethod();
                                creditCard.deduct();
                                System.out.println(creditCard.billPrint());
                                creditCard.save();
                                System.out.println("Copy of Bill Save in file");
                                break;
                            case 3:
                                Cash cash = new Cash();
                                cash.Product_name();
                                cash.Product_code();
                                cash.Product_price();
                                cash.menu();
                                cash.PaymentMethod();
                                System.out.println("Select Cash From\n10\n20\n50\n100\n500\n1000\n5000");
                                int cashgive = sc.nextInt();
                                cash.SetCash(cashgive);
                                cash.deduct();
                                System.out.println(cash.billPrint());
                                cash.save();
                                System.out.println("Copy of Bill Save in file");
                                break;
                            case 4:
                                exit = true;
                                break;
                            default:
                                System.out.println("Sorry we have only 4 menu in this section. Put again Correctly");
                        }
                    }while (!exit);
                    break;
                case 2:
                    do {

                        System.out.println("\n\nPress 1: Stock Incharge");
                        System.out.println("Press 2: Admin");
                        System.out.println("Press 3: Accountant");
                        System.out.println("Press 4: To Exit");
                        int adminmenu = sc.nextInt();

                        switch (adminmenu) {
                            case 1:

                                System.out.println("*****************************Login-In*********************************");
                                System.out.println("  *     *  					                                  *     *");
                                System.out.println("   *   * 					                                   *   *");
                                System.out.println("    * *						                                	* *");
                                System.out.println("     *							                                 *");
                                System.out.print("\n                       INCHARGE ID: ");
                                String incharge_id = scc.next();
                                System.out.print("\n                       PASSWORD: ");
                                int incarge_pw = scc.nextInt();
                                System.out.println("\n\n\n\n\n*****************************Login-In*********************************");

                                if(incharge_id.equals("minhaj") && incarge_pw==12345) {

                                    System.out.println("Successfully Login!");
                                    Cash cashes = new Cash();
                                    cashes.Product_name();
                                    cashes.Product_code();
                                    cashes.Product_price();

                                    do {

                                        System.out.println("\n\nPRESS 1: Add Stock\nPress 2: Check Stock\nPRESS 3: To Exit");
                                        int stockmenu = sc.nextInt();

                                        switch (stockmenu) {
                                            case 1:
                                                System.out.println("Enter Product Name: ");
                                                String pname = sc.next();
                                                System.out.println("Enter Product Code: ");
                                                String cname = sc.next();
                                                System.out.println("Enter Product Price: ");
                                                int ppname = sc.nextInt();
                                                cashes.AddProduct(pname, cname, ppname);
                                                System.out.println("Product Added Successfully!");
                                                System.out.println("Would you like to see new menu?\nPress 1: If Yes!\nPress 2: If No!");
                                                int addedmenu = sc.nextInt();

                                                switch (addedmenu) {
                                                    case 1:
                                                        cashes.menu();
                                                        break;
                                                    case 2:
                                                        break;
                                                    default:
                                                        System.out.println("Sorry we have only 2 menu in this section. Put again Correctly");
                                                }
                                                break;
                                            case 2:
                                                cashes.menu();
                                                break;
                                            case 3:
                                                exit = true;
                                                break;

                                            default:
                                                System.out.println("Sorry we have only 3 menu in this section. Put again Correctly");
                                        }
                                    } while (!exit);
                                    break;
                                }
                                else {
                                    System.out.println("Wrong Password");
                                }
                                break;
                            case 2:
                                System.out.println("*****************************Login-In*********************************");
                                System.out.println("  *     *  					                                  *     *");
                                System.out.println("   *   * 					                                   *   *");
                                System.out.println("    * *						                                	* *");
                                System.out.println("     *							                                 *");
                                System.out.print("\n                       ADMIN ID: ");
                                String admin_id = scc.next();
                                System.out.print("\n                       PASSWORD: ");
                                int admin_pw = scc.nextInt();
                                System.out.println("\n\n\n\n\n*****************************Login-In*********************************");

                                if(admin_id.equals("huzaifa") && admin_pw==678910) {
                                    System.out.println("Successfully Login!");

                                    do {

                                        System.out.println("\n\nPress 1: Employees Portfolio\nPress 2: Add New Employee\nPress 3: To Exit");
                                        int admin1 = sc.nextInt();

                                        switch (admin1) {
                                            case 1:
                                                Employees employees = new Employees();
                                                employees.Employee_Id();
                                                employees.Employee_Name();
                                                employees.Employee_Contact();
                                                employees.basicPay();
                                                employees.Income_Tax();
                                                employees.OtherDeduction();
                                                employees.Netpay();
                                                employees.DisplayEmployeePortfolio();
                                                break;
                                            case 2:
                                                System.out.print("Enter Name of Employee\n");
                                                String ename = sc.next();
                                                System.out.print("Enter Id of Employee\n");
                                                String eid = s.next();
                                                System.out.println("Enter Contact of Employee");
                                                String ec = s.next();
                                                System.out.println("Enter Basic Pay of Employee");
                                                int epay = s.nextInt();

                                                Employees employees1 = new Employees();
                                                employees1.Employee_Id();
                                                employees1.Employee_Name();
                                                employees1.Employee_Contact();
                                                employees1.basicPay();
                                                employees1.Income_Tax();
                                                employees1.OtherDeduction();
                                                employees1.Netpay();
                                                employees1.AddEmployee(ename, eid, ec, epay);
                                                System.out.println("Employee Added Successfully!");
                                                System.out.println("Would you like to see new Employee Portfolio?\nPress 1: If Yes!\nPress 2: If No!");
                                                int addedemployee = s.nextInt();

                                                switch (addedemployee) {
                                                    case 1:
                                                        employees1.basicPay();
                                                        employees1.Income_Tax();
                                                        employees1.OtherDeduction();
                                                        employees1.Netpay();
                                                        employees1.DisplayEmployeePortfolio();
                                                        break;
                                                    case 2:
                                                        break;
                                                    default:
                                                        System.out.println("Sorry we have only 2 menu in this section. Put again Correctly");
                                                }
                                                break;
                                            case 3:
                                                exit = true;
                                                break;
                                            default:
                                                System.out.println("Sorry we have only 3 menu in this section. Put again Correctly");
                                        }
                                    } while (!exit);
                                    break;
                                }
                                else {
                                    System.out.println("Wrong Password!");
                                }
                                break;
                            case 3:
                                System.out.println("*****************************Login-In*********************************");
                                System.out.println("  *     *  					                                  *     *");
                                System.out.println("   *   * 					                                   *   *");
                                System.out.println("    * *						                                	* *");
                                System.out.println("     *							                                 *");
                                System.out.print("\n                       ACCOUNTANT ID: ");
                                String accountant_id = scc.next();
                                System.out.print("\n                       PASSWORD: ");
                                int accountant_pw = scc.nextInt();
                                System.out.println("\n\n\n\n\n*****************************Login-In*********************************");

                                if(accountant_id.equals("zain") && accountant_pw==111213) {
                                    System.out.println("Successfully Login!");
                                    do {

                                        System.out.println("\n\nPress 1: To Maintain Daily Cash Flow Statement");
                                        System.out.println("Press 2: To Maintain Creditor Accounts");
                                        System.out.println("Press 3: To Maintain Income Statement");
                                        System.out.println("Press 4: To Exit");
                                        int account = s.nextInt();

                                        switch (account) {
                                            case 1:
                                                System.out.println("Enter Today's Total Sales: ");
                                                int sales = sc.nextInt();
                                                System.out.println("Enter Today's Total Expense: ");
                                                int expense = sc.nextInt();
                                                DailyCashFlow dailyCashFlow = new DailyCashFlow(sales, expense);
                                                System.out.println(dailyCashFlow.cashFlow());
                                                dailyCashFlow.save();
                                                System.out.println("Cash Flow Statement Successfully Save to file");
                                                break;
                                            case 2:
                                                System.out.println("Enter Previous Account Balance: ");
                                                int balancebd = sc.nextInt();
                                                System.out.println("Enter Purchases: ");
                                                int purchase = sc.nextInt();
                                                System.out.println("Enter Purchase Returns: ");
                                                int purchaseR = sc.nextInt();
                                                System.out.println("Enter Paid Cash To Supplier: ");
                                                int paidcash = sc.nextInt();
                                                System.out.println("Enter Discount Received From Supplier: ");
                                                int discR = sc.nextInt();

                                                SuppilerAccounts suppilerAccounts = new SuppilerAccounts(purchase, purchaseR, paidcash, discR, balancebd);
                                                System.out.println(suppilerAccounts.CreditorAccount());
                                                suppilerAccounts.save();
                                                System.out.println("Supplier Account Statement Successfully Save to file");
                                                break;
                                            case 3:
                                                System.out.println("Enter Sales: ");
                                                int sale = s.nextInt();
                                                System.out.println("Enter Purchases: ");
                                                int purchases = s.nextInt();
                                                System.out.println("Enter Inventory: ");
                                                int inventory = s.nextInt();
                                                System.out.println("Enter Salaries Exp.: ");
                                                int salaries = s.nextInt();
                                                System.out.println("Enter Motor Exp.: ");
                                                int Mexp = s.nextInt();
                                                System.out.println("Enter Rent Exp.: ");
                                                int Rexp = s.nextInt();
                                                System.out.println("Enter Insurance Exp.: ");
                                                int Iexp = s.nextInt();
                                                System.out.println("Enter General Exp.: ");
                                                int Gexp = s.nextInt();
                                                System.out.println("Enter Business Exp.: ");
                                                int Bexp = s.nextInt();

                                                IncomeStatement incomeStatement = new IncomeStatement(sale, purchases, inventory, salaries, Mexp, Rexp, Iexp, Gexp, Bexp);
                                                System.out.println(incomeStatement.IS());
                                                incomeStatement.save();
                                                System.out.println("Income Statement Successfully Save to file");
                                                break;
                                            case 4:
                                                exit = true;
                                                break;
                                            default:
                                                System.out.println("Sorry we have only 4 menu in this section. Put again Correctly");
                                        }
                                    } while (!exit);
                                    break;
                                }
                                else {
                                    System.out.println("Wrong Password!");
                                }
                                break;
                            case 4:
                                exit = true;
                                break;
                            default:
                                System.out.println("Sorry we have only 4 menu in this section. Put again Correctly");
                        }
                    }while (!exit);
                    break;
            case 3:
                exit = true;
                break;
                default:
                    System.out.println("Sorry we have only 3 menu in this section. Put again Correctly");
        }
        } while (!exit);

    }

}
