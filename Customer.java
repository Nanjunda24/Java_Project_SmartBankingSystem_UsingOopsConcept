package SmartBankingSystem;

public class Customer {

    private String customerName;
    private long accountNumber;
    private double balance;

    public Customer(String customerName, long accountNumber, double balance){   
        this.customerName = customerName;
        this.accountNumber = accountNumber;
        this.balance = balance;    
    }

    void setCustomerName(String name){
        this.customerName = name;
    }

    void setAccountNumber(long accountNumber){
        this.accountNumber = accountNumber;
    }

    void setAccountBalance(double balance){
        if (balance >= 0){
            this.balance = balance;
        }else{
            System.out.println("Balance can't be zero!!");
        }
    }

    // read data 

    String getCustomerName(){
        return customerName;
    }

    long getAccountNumber(){
        return accountNumber;
    }

    double getBalance(){
        return balance;
    }

    
}
