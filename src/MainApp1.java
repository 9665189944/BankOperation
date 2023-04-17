import java.util.ArrayList;
import java.util.Scanner;

public class MainApp1 {
    public static void main(String[] args) throws Exception {
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter the Number Store Data ");
        int No=sc.nextInt();

        //Upcasting
        Bank a1=new ICCIBank();
        //downCasting
        ICCIBank b1=(ICCIBank) a1;

       // ArrayList<Customer> data=new ArrayList<>();
        System.out.println("Account No\t Name \tamt");
        for(int i=0;i<No;i++)
        {
                b1.info();

        }
        boolean status=true;

        while(status)
        {
            System.out.println("Select Option");
            System.out.println("1.Add Record");
            System.out.println("2.Deposit Money");
            System.out.println("3.Withdraw Money");
            System.out.println("4.Checked Balance");
            System.out.println("5.Delete Particulate Record");
            System.out.println("6.Search Customer record");
            System.out.println("7.Display  All Customer");
            System.out.println("8.Exit");


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
                    System.out.println("Delete Particulate record");
                    System.out.println("Enter account Number");
                    int accoNo= sc.nextInt();
                    try {
                        a1.DeleteRecord(accoNo);
                    }catch (Exception e)
                    {
                        System.out.println(e);
                    }
                    break;

                case 6:
                    System.out.println("Search Customer record");
                    System.out.println("Enter account Number");
                    int accoNo1= sc.nextInt();
                    a1.SearchCustomerRecord(accoNo1);
                    break;

                case 7:
                    System.out.println("Display All Customer");
                    a1.displayAllCustomer();
                    break;

                default:
                    status=false;

            }
        }
    }
}
