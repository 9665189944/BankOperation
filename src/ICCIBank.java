import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class ICCIBank implements Bank {

    Scanner sc = new Scanner(System.in);
    Customer c1;
    ArrayList<Customer> data1 = new ArrayList<>();

    void info() {
        data1.add(new Customer(sc.nextInt(), sc.next(), sc.nextDouble()));
        System.out.println(data1);
    }


    //Customer s;
    @Override
    public void deposit(int accNo, double amt) {
        Iterator itr = data1.iterator();
        // System.out.println(data1);
        while (itr.hasNext()) {
           c1 = (Customer) itr.next();
            if (c1.getAccNo() == accNo) {
                c1.setBankBalnce(c1.getBankBalnce() + amt);
                System.out.println("Deposit Successfully" + c1.getBankBalnce());
            }
            //else {
//                throw new Exception("Invalid Account Number");
//            }
        }
    }

    @Override
    public void withdraw(int accNo, double amt) throws Exception {
        Iterator<Customer> itr = data1.iterator();
        while (itr.hasNext()) {
            c1 = itr.next();
            if (c1.getAccNo() == accNo) {

                if (c1.getBankBalnce() >= amt) {
                    c1.setBankBalnce(c1.getBankBalnce() - amt);

                    System.out.println("withdraw Successfully");
                } else {
                    throw new InsufficientBalance( "insufficient balance");
                }
            }
        }
    }

    @Override
    public void checkBalance(int accNo) {
        Iterator<Customer> itr = data1.iterator();
        while (itr.hasNext()) {
            c1 = itr.next();

            if (c1.getAccNo() == accNo) {
                System.out.println("Bank Balance is  " + c1.getBankBalnce());
            }
        }
    }
    @Override
    public  void displayAllCustomer()
    {
        Iterator<Customer> itr = data1.iterator();
        while (itr.hasNext()) {
            c1 = itr.next();
            System.out.println("========================================================");
            System.out.println( c1.getAccNo()+"\t"+c1.getName()+"\t"+c1.getBankBalnce());
          }
        }

    @Override
    public void SearchCustomerRecord(int accoNo)  {
        Iterator<Customer> itr = data1.iterator();
        while (itr.hasNext()) {
           c1 = itr.next();
            if (c1.getAccNo() == accoNo) {
                System.out.println("========================================================");
                System.out.println(c1.getAccNo() + "\t" + c1.getName() + "\t" + c1.getBankBalnce());
                System.out.println("========================================================");
            }
        }
    }

    @Override
    public void DeleteRecord(int accNo)  {
        Iterator<Customer> itr = data1.iterator();
        while (itr.hasNext()) {
            c1 = itr.next();
            if (c1.getAccNo() == accNo) {
                System.out.println("========================================================");
                data1.remove(c1.getAccNo());
            }
        }

    }
}

