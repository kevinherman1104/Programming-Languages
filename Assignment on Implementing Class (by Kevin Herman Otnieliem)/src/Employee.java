
public class Employee {
    private int id;
    private String firstname;
    private String lastname;
    private int salary;

    public Employee(int id, String firstname, String lastname, int salary)
    {
        this.id = id;
        this.firstname =  firstname;
        this.lastname = lastname;
        this.salary = salary;
    }

    public int getId() {
        return id;
    }
    public String getFirstname() {
        return firstname;
    }
    public String getLastname() {
        return lastname;
    }
    public int getSalary() {
        return salary;
    }
    public void setSalary(int salary) {
        this.salary = salary;
    }
    public String getName ()
    {
        return firstname + " " + lastname;
    }
    public int AnnualSalary()
    {
        return 12 * salary;
    }
    public int raiseSalary(int percent)
    {
        if(percent <= 0)
        {
            System.out.println("Error percent must not be negative !");
            return this.salary;
        }
        else
        {
            int addsalary = salary * percent/100;
            this.salary += addsalary;
            return this.salary;


        }
    }

    @Override
    public String toString()
    {
        return "Employee[ id = " + id + ",name = " + getName() + ", salary = " + getSalary() +  "]";
    }

}
