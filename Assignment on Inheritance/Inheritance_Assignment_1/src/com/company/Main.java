package com.company;

public class Main {

    public static void main(String[] args) {
        //Shape tester
        System.out.println("Shape Class Tester");
        Shape s = new Shape();
        System.out.println(s.getColor() + " " + s.isFilled());
        System.out.println(s.toString());

        Shape s1 = new Shape("white", false);
        System.out.println(s1.toString());

        s1.setFilled(true);
        System.out.println(s1.toString());

        s1.setColor("violet");
        System.out.println(s1.toString());

        //Circle tester
        System.out.println();
        System.out.println("Circle Class Tester");
        Circle c1 = new Circle();

        System.out.println(c1.toString());
        System.out.println("Area = " + c1.getArea());
        System.out.println("Perimeter = "+ c1.getPerimeter());
        System.out.println("Radius for c1 circle is " + c1.getRadius());
        System.out.println();

        Circle c2 = new Circle(2.0);
        System.out.println(c2.toString());
        System.out.println("Area = " + c2.getArea());
        System.out.println("Perimeter = "+ c2.getPerimeter());
        System.out.println("Radius for c2 circle is " + c2.getRadius());
        System.out.println();

        c2.setRadius(4.0);
        c2.setColor("Pink"); //inherits from parent
        c2.setFilled(false);//inherits from parent
        System.out.println(c2.getColor() + " " + c2.isFilled());//inherits from parent
        System.out.println(c2.toString());
        System.out.println("Area = " + c2.getArea());
        System.out.println("Perimeter = "+ c2.getPerimeter());
        System.out.println("New Radius for c2 circle is " + c2.getRadius());
        System.out.println();

        Circle c3 = new Circle("Black", false, 6.0);
        System.out.println(c3.toString());
        System.out.println("Area = " + c3.getArea());
        System.out.println("Perimeter = "+ c3.getPerimeter());
        System.out.println("Radius for c3 circle is " + c3.getRadius());

        // Rectangle Tester
        System.out.println();
        System.out.println("Rectangle Class Tester");
        Rectangle r1 = new Rectangle();
        System.out.println(r1.toString());
        System.out.println("Area = " + r1.getArea());
        System.out.println("Perimeter = "+ r1.getPerimeter());
        System.out.println();

        Rectangle r2 = new Rectangle(2.0, 2.0);
        System.out.println(r2.toString());
        System.out.println("Area = " + r2.getArea());
        System.out.println("Perimeter = "+ r2.getPerimeter());
        System.out.println();

        r2.setWidth(4.0);
        r2.setLength(4.0);
        r2.setColor("Brown");//inherits from parent
        r2.setFilled(false);//inherits from parent
        System.out.println(r2.getColor() + " " + r2.isFilled());//inherits from parent
        System.out.println(r2.toString());
        System.out.println("Area = " + r2.getArea());
        System.out.println("Perimeter = "+ r2.getPerimeter());
        System.out.println();

        Rectangle r3 = new Rectangle("Blue", false, 6.0, 6.0);
        System.out.println(r3.toString());
        System.out.println("Area = " + r3.getArea());
        System.out.println("Perimeter = "+ r3.getPerimeter());

        //Square Tester
        System.out.println();
        System.out.println("Square Class Tester");

        Square sq1 = new Square();
        System.out.println(sq1.toString());
        System.out.println("Area = " + sq1.getArea());
        System.out.println("Perimeter = "+ sq1.getPerimeter());
        System.out.println();

        Square sq2 = new Square(4.0);
        System.out.println(sq2.toString());
        System.out.println("Area = " + sq2.getArea());
        System.out.println("Perimeter = "+ sq2.getPerimeter());
        System.out.println();

        sq2.setSide(6.0);
        sq2.setColor("Purple");//inherits from parent
        sq2.setFilled(false);//inherits from parent
        System.out.println(sq2.getColor() + " " + sq2.isFilled());//inherits from parent
        System.out.println(sq2.toString());
        System.out.println("Area = " + sq2.getArea());
        System.out.println("Perimeter = "+ sq2.getPerimeter());
        System.out.println();

        Square sq3 =  new Square("Gold", true, 8.0);
        System.out.println(sq3.toString());
        System.out.println("Area = " + sq3.getArea());
        System.out.println("Perimeter = "+ sq3.getPerimeter());
        System.out.println();





    }
}
