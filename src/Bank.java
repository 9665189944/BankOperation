public interface Bank {
      void deposit(int accNo,double amt);
    void withdraw(int accNo,double amt) throws Exception;
    void checkBalance(int accNo) throws Exception;

    void displayAllCustomer()  throws  Exception;

    void SearchCustomerRecord(int accoNo) throws Exception;

    void DeleteRecord(int accoNo) throws Exception;


}
