
public class Rectangle {
    private float length;
    private float wide;

    public Rectangle()
    {
        this.length = 1.0f;
        this.wide = 1.0f;
    }
    public Rectangle(float length, float wide)
    {
        this.setLength(length);
        this.setWide(wide);

    }

    public float getLength() {
        return length;
    }

    public void setLength(float length) {
        if (length <= 0)
        {
            this.length = 1.0f;
        }
        else
        {
            this.length = length;
        }
    }

    public float getWide() {
        return wide;
    }

    public void setWide(float wide) {
        if (wide <= 0)
        {
            this.wide = 1.0f;
        }
        else
        {
            this.wide = wide;
        }
    }
    public double getArea ()
    {
        return length * wide;
    }
    public double getPerimeter()
    {
        return 2 * (length + wide);
    }
    @Override
    public String toString()
    {
        return "Rectangle = " + "[ Length = " + length + " Width = " + wide  + "]";
    }
}
