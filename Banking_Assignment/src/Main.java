public class Main {
    public static void main (String [] args)
    {

        Bank bank  = new Bank("BCA");
        bank.addCustomer("Kevin", "Herman");
        bank.addCustomer("Nick", "Elodeon");

        System.out.println();

        System.out.println("Number of Customer in Bank " + bank.getBankName() + " is " + bank.getNumberOfCustomers());
        System.out.println(bank.getCustomer(0).getFirstname() + " " + bank.getCustomer(0).getLastname());
        System.out.println(bank.getCustomer(1).getFirstname() + " " + bank.getCustomer(1).getLastname());

        bank.getCustomer(0).setAccount(new Account(1000));
        bank.getCustomer(1).setAccount(new Account(-1000));

        System.out.println("Balance for " + bank.getCustomer(0).getName() + " is " + bank.getCustomer(0).getAccount().getBalance());
        System.out.println("Balance for " + bank.getCustomer(1) .getName()+ " is "  + bank.getCustomer(1).getAccount().getBalance());

        System.out.println();
        System.out.println("Deposit Status for " + bank.getCustomer(0).getName()+ " is " + bank.getCustomer(0).getAccount().deposit(20));
        System.out.println("Deposit Status for " + bank.getCustomer(1).getName()+ " is " + bank.getCustomer(1).getAccount().deposit(50));

        System.out.println();
        System.out.println("Balance for " + bank.getCustomer(0).getName() + " now is " + bank.getCustomer(0).getAccount().getBalance());
        System.out.println("Balance for " + bank.getCustomer(1) .getName()+ " now is "  + bank.getCustomer(1).getAccount().getBalance());

        System.out.println();
        System.out.println("Withdraw Status for " + bank.getCustomer(0).getName()+ " is " + bank.getCustomer(0).getAccount().withdraw(50));
        System.out.println("Withdraw Status for " + bank.getCustomer(1).getName()+ " is " + bank.getCustomer(1).getAccount().withdraw(500));


        System.out.println();
        System.out.println("Balance for " + bank.getCustomer(0).getName() + " now is " + bank.getCustomer(0).getAccount().getBalance());
        System.out.println("Balance for " + bank.getCustomer(1) .getName()+ " now is "  + bank.getCustomer(1).getAccount().getBalance());

        System.out.println();
        System.out.println("SetAccount status for " + bank.getCustomer(0).getName() + " is = ");
        bank.getCustomer(0).setAccount(new Account(90));





    }
}


