
public class Driver {
    public static void main(String []  args)
    {
        // rectangle
        Rectangle r1 = new Rectangle();
        Rectangle r2 =  new Rectangle(8, 8);

        System.out.println(r1.getLength() + " " + r1.getWide() + " " + r1.getArea() + " " + r1.getPerimeter());
        System.out.println(r2.getLength() + " " + r2.getWide() + " " + r2.getArea() + " " + r2.getPerimeter());

        System.out.println(r2.toString());

        System.out.println();
        System.out.println();

        // Employee Class
        Employee e1 =  new Employee(12, "kevin", "herman", 20000);
        System.out.println(e1.getId());
        System.out.println(e1.getFirstname());
        System.out.println(e1.getLastname());
        System.out.println(e1.getName());
        e1.setSalary(20000);
        System.out.println("Annual salary = " + e1.AnnualSalary());
        System.out.println("new salary = " + e1.raiseSalary(20));
        System.out.println(e1.toString());

        System.out.println();
        System.out.println();


        // Invoice item
        Invoiceitem i1 = new Invoiceitem(01, "mantap", 25, 6000);
        System.out.println(i1.getId());
        System.out.println(i1.getDesc());
        System.out.println(i1.getQuantity());
        System.out.println(i1.getUnitPrice());
        i1.setQuantity(5);
        i1.setUnitPrice(5000);
        System.out.println(i1.getTotal());
        System.out.println(i1.toString());

        System.out.println();
        System.out.println();

        // Account
        Account a1 = new Account(1, "kevin", 200);
        Account a2 = new Account(2,"nicho", 10);
        System.out.println(a1.getId());
        System.out.println(a1.getName());
        System.out.println(a1.getBalance());
        a1.credit(20);
        a1.debit(30);
        a1.transferTo(a2, 10);
        System.out.println(a1.toString());
        System.out.println(a2.toString());

        System.out.println();
        System.out.println();

        // The date
        TheDate d1 = new TheDate(11,4,2001);
        System.out.println(d1.getDay());
        System.out.println(d1.getMonth());
        System.out.println(d1.getYear());
        d1.setDay(12);
        d1.setMonth(2);
        d1.setMonth(2009);
        System.out.println(d1.toString());
        d1.setDate(11,7,2015);
        System.out.println(d1.toString());

        System.out.println();
        System.out.println();

        // The Time
        TheTime t1 =  new TheTime(5,12,12);
        System.out.println(t1.getHour());
        System.out.println(t1.getMinute());
        System.out.println(t1.getSecond());
        System.out.println(t1.toString());

        t1.setHour(12);
        t1.setMinute(2);
        t1.setSecond(45);
        System.out.println(t1.toString());

        t1.setTime(17,5,8);
        System.out.println(t1.toString());

        System.out.println(t1.nextSecond());
        t1.setTime(17,5,8);
        System.out.println(t1.previousSecond());



    }
}
