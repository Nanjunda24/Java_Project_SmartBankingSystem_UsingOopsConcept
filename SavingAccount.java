package SmartBankingSystem;

public class SavingAccount extends BankAccount{

    

    public SavingAccount(Customer customer){
        super(customer);
       
    }

   // @override withdraw() method
    final double INTERASTERATE = 0.04;
   
   void withdraw(double amount){
    if (amount > 0 && amount <= customer.getBalance()){

        double remainingAmount = customer.getBalance() - amount ;

        customer.setAccountBalance(remainingAmount);
        System.out.println(amount +" rupees withdrawn successfully from your saving account!!!");
    }
    else{
        System.out.println("Insufficient balance or invalid amount!!!!");
    }
}

public void calculateInterest(){

    double interest = customer.getBalance()* INTERASTERATE ;
    System.out.println("Interest earned on your saving account is: "+interest+" rupees");
    customer.setAccountBalance(customer.getBalance() + interest);
    System.out.println("New balance after adding interest : "+customer.getBalance()+" rupees");
}

    
}
