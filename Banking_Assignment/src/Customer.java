public class Customer {
    private String firstname;
    private String lastname;
    private Account account;

    public Customer(String f, String l) {
        this.firstname = f;
        this.lastname = l;
        this.account = null;
    }

    public String getFirstname() {
        return firstname;
    }

    public String getLastname() {
        return lastname;
    }
    public String getName()
    {
        return firstname + " " + lastname;
    }

    public Account getAccount() {
        return account;
    }

    public void setAccount(Account acct) {
        if (account != null)
        {
            System.out.println("Account has been Created");
        }
        else
        {
            this.account = acct;
        }
    }
}
