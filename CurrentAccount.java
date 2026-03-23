package SmartBankingSystem;

public class CurrentAccount extends BankAccount {

    double OVERDRAFT_LIMIT = 5000.0;
    public CurrentAccount(Customer customer){
        super(customer);
        
    }

    @Override
    void withdraw(double amount) {
                // TODO Auto-generated method stub
        if (amount > 0 && amount <= (customer.getBalance() + OVERDRAFT_LIMIT)){     
            double remainingAmount = customer.getBalance() - amount ;

            customer.setAccountBalance(remainingAmount);
            System.out.println(amount +" rupees withdrawn successfully from your current account!!!");
        }
        else{
            System.out.println("Insufficient balance or invalid amount!!!!");
        }           
    }


    
}
