import java.util.Iterator;

public class Customer {


    private int accNo;
    private String name;
    private double bankBalnce;

    public Customer( int accNo, String name,double bankBalnce) {

        this.accNo = accNo;
        this.name = name;
        this.bankBalnce = bankBalnce;
    }


    public String getName() {

        return name;
    }

    public void setName(String name) {

        this.name = name;
    }

    public int getAccNo() {

        return accNo;
    }

    public void setAccNo(int accNo) {

        this.accNo = accNo;
    }

    public double getBankBalnce() {

        return bankBalnce;
    }

    public void setBankBalnce(double bankBalnce) {

        this.bankBalnce = bankBalnce;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "accNo=" + accNo +
                ", name='" + name + '\'' +
                ", bankBalnce=" + bankBalnce +
                '}';
    }
}
