public class Account{
    private double balance;


    public Account(double balance) {
        if (balance <= 0)
        {
            this.balance = 0;
        }
        else
        {
            this.balance = balance;
        }
    }

    public double getBalance() {
        return balance;
    }
    public boolean deposit (double amount)
    {
        this.balance += amount;
        return true;
    }
    public boolean withdraw(double amount)
    {
        if (amount <= this.balance)
        {
            this.balance-=amount;
            return true;
        }
        else
        {
            System.out.println("Amount has exceeded balance!");
            return false;
        }

    }

}
