package BankOperation;

import java.util.Scanner;

public class MainApp1 {
    public static void main(String[] args) throws Exception {
        Scanner sc=new Scanner(System.in);



//        int No=sc.nextInt();

        //Upcasting
        Bank a1=new ICCIBank();


        //downCasting
        ICCIBank b1=(ICCIBank) a1;
        System.out.println("Enter the Number Store Data ");
        b1.CustomerInfo();

       // ArrayList<Customer> data=new ArrayList<>();
//        System.out.println("Account No\t Name \tamt");
//        for(int i=0;i<No;i++)
//        {
//                b1.info();
//
//        }


        boolean status=true;

        while(status)
        {
            System.out.println("Select Option");
            System.out.println("1.Add Record");
            System.out.println("2.Deposit Money");
            System.out.println("3.Withdraw Money");
            System.out.println("4.Checked Balance");
            System.out.println("5.Delete Particular Record");
            System.out.println("6.Search Customer record");
            System.out.println("7.Display  All Customer");
            System.out.println("8.Update Customer Name");
            System.out.println("9.Exit");


            int choice=sc.nextInt();

            switch (choice)
            {
                case 1:
                    System.out.println("Enter the Number Add Record");
                    int n= sc.nextInt();
                    System.out.println("Account No\t Name \tamt");
                    for(int i=0;i<n;i++)
                    {
                        b1.info();
                    }
                    break;

                case 2:
                    System.out.println("1.Deposit Money");
                    System.out.println("Enter AccountNo");
                    int accNo= sc.nextInt();
                    System.out.println("Enter Amount");
                    double amt= sc.nextDouble();
                    try {
                        a1.deposit(accNo, amt);
                    }catch (Exception e)
                    {
                        System.out.println(e);
                    }
                    break;

                case 3:
                    System.out.println("2.withdraw");
                    System.out.println("Enter Account No");
                    int accNo1= sc.nextInt();
                    System.out.println("Enter Amount");
                    double amt1= sc.nextDouble();
                    a1.withdraw(accNo1, amt1);
                    break;

                case 4:
                    System.out.println("3.Checked Balance");
                    System.out.println("Enter Account NO");
                    int accNO3= sc.nextInt();
                    try {
                        a1.checkBalance(accNO3);
                    }catch (Exception e)
                    {
                        System.out.println(e);
                    }
                    break;

                case 5:
                    System.out.println("Delete Particular  record");
                    System.out.println("Enter account Number");
                    int deleteID= sc.nextInt();
                    a1.DeleteRecord(deleteID);
                    break;

                case 6:
                    System.out.println("Search Customer record");
                    System.out.println("Enter account Number");
                    int searchID= sc.nextInt();
                    a1.SearchCustomerRecord(searchID);
                    break;

                case 7:
                    System.out.println("Display All Customer");
                    a1.displayAllCustomer();
                    break;

                case 8:
                    System.out.println("Update Customer Name");
                    System.out.println("Enter account Number");
                    int updateID= sc.nextInt();
                    System.out.println("Enter Name Of Customer");
                    String updateName=sc.next();
                    a1.updateNameCustomer(updateID,updateName);
                       break;

                default:
                    status=false;

            }
        }
    }
}
