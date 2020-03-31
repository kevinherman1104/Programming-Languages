public class Invoiceitem {
    private int id;
    private String desc;
    private int quantity;
    private double unitPrice;


    public Invoiceitem(int id, String desc, int quantity, double unitPrice) {
        this.id = id;
        this.desc = desc;
        this.quantity = quantity;
        this.unitPrice = unitPrice;


    }

    public int getId() {
        return id;
    }

    public String getDesc() {
        return desc;
    }

    public int getQuantity() {
        return quantity;
    }

    public double getUnitPrice() {
        return unitPrice;
    }

    public void setQuantity(int quantity) {
        if (quantity <= 0)
        {
            System.out.println("Quantity cannot have negative values !");
        }
        else
        {
            this.quantity = quantity;
        }

    }

    public void setUnitPrice(double unitPrice) {
        if (unitPrice <= 0)
        {
            System.out.println("Unit Price cannot have negative values !");
        }
        else
        {
            this.unitPrice = unitPrice;
        }
    }
    public double getTotal()
    {
        return unitPrice * quantity;
    }

    @Override
    public String toString()
    {
        return "InvoiceItem [ id = " + id + ",desc = " + desc + ",qty = " + quantity + ", unitPrice = " + unitPrice + "]";
    }
}
