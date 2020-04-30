package com.company;

public class Square extends Rectangle{

    public Square(){
        super();
    }

    public Square( double side )
    {
        super(side,side);
    }
    public Square(String color, boolean filled, double side)
    {
        super(color, filled, side, side);
    }

    public void setSide(double side) {
        super.setWidth(side);
    }


    public double getSide() {
        return super.getWidth();
    }

    @Override
    public double getArea() {
        return super.getArea();
    }

    @Override
    public double getPerimeter() {
        return super.getPerimeter();
    }

    @Override
    public String toString() {
        return "A Square with side = " + getSide() + ", which is a subclass of " + super.toString();
    }
}

