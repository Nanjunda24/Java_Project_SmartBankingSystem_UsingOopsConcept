package SmartBankingSystem;

abstract class BankAccount {
    protected Customer customer;

    public BankAccount(Customer customer){
        
        this.customer = customer;
    }
    
    // add common methods for saving accunt and current account

    public void deposite(double amount){
       if (amount > 0 ){

        double newBalance = customer.getBalance() + amount;
        customer.setAccountBalance(newBalance);
        System.out.println(amount +" rupess successfully deposited to your bank!!!");
       }
        else{
            System.out.println("Amount must positive !!!!");
        }
    }


    // DisplayBalance ()

    public void DisplayBalance(){
        System.out.println("Your current account balance is : "+customer.getBalance()+" rupees");
        System.out.println("Account number: "+customer.getAccountNumber());
        System.out.println("Account holder name: "+customer.getCustomerName());
       } 

       abstract void withdraw(double amount);

    }

