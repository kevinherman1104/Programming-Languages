public class Account {
    private int id;
    private String name;
    private int balance;

    public Account(int id, String name) {
        this.id = id;
        this.name = name;
        this.balance = 0;
    }

    public Account(int id, String name, int balance) {
        this.id = id;
        this.name = name;
        this.balance = balance;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getBalance() {
        return balance;
    }
    public int credit(int amount)
    {
        return balance + amount;

    }
    public int debit(int amount)
    {
        if (amount <= balance)
        {
            balance =  balance - amount;
        }
        else
        {
            System.out.println("Amount exceeded balance");
        }
        return balance;
    }

    public int transferTo( Account another, int amount)
    {
        if (amount <= this.balance)
        {
            this.balance  = this.balance - amount;
            another.balance = another.balance + amount;
        }
        else
        {
            System.out.println("Amount exceeded balance");
        }
        return balance;
    }
    @Override
    public String toString()
    {
        return "Account[ id = " + id + ", name = " + name  + ",balance = " + balance + "]";
    }



}

