package SmartBankingSystem;

public class SmartBankingSystemMain {

    public static void main(String[] args) {
        
        Customer  c = new Customer("Nanjunnda K M", 73090100045714L,1000);
        
        OnlineBankingServie oba = new OnlineBankingServie();

        oba.openAccount();

        BankAccount bank ; // we can't create object for abstract class

        bank = new SavingAccount(c);

        bank.DisplayBalance();
        
        System.out.println("---------------------------------------------------");

        bank.deposite(123456);
        System.out.println("---------------------------------------------------");

        bank.withdraw(12365);
        System.out.println("---------------------------------------------------");
        
        bank.DisplayBalance();
    //   to access calculateInterestmethod we need to create downcasting
        // down
        SavingAccount sa = (SavingAccount) bank;
        sa.calculateInterest();

        System.out.println("-----------------object 2----------------------------------");

        Customer c2 = new Customer("Charan H G", 8088913798L,500);

        BankAccount bank2;

        bank2 = new CurrentAccount(c2);

        bank2.DisplayBalance();
        System.out.println("---------------------------------------------------");          
        bank2.deposite(10000);
        System.out.println("---------------------------------------------------");
        bank2.withdraw(6000);

        System.out.println("---------------------------------------------------");
        bank2.DisplayBalance();
        oba.closeAccount();


    }
    
}
