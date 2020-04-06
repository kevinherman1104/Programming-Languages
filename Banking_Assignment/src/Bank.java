import java.util.ArrayList;

public class Bank {
    private ArrayList<Customer> customers;
    private int numberOfCustomers;
    private String bankName;

    public Bank(String bName) {
        this.bankName = bName;
        this.numberOfCustomers = 0;
        customers = new ArrayList<Customer>();
    }
    public String getBankName()
    {
        return this.bankName;
    }
    public void addCustomer(String f, String l)
    {
        customers.add(new Customer(f,l));
        numberOfCustomers++;
    }
    public int getNumberOfCustomers()
    {
        return numberOfCustomers;
    }
    public Customer getCustomer(int index)
    {
        return customers.get(index);
    }
}
