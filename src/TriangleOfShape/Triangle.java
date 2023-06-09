package TriangleOfShape;

import java.util.PrimitiveIterator;

public class Triangle extends Shape2{
    private double side1 = 1.0;
    private double side2 = 1.0;
    private double side3 = 1.0;

    public Triangle(){};
    public Triangle(double side1, double side2, double side3, String color, boolean filled){
        super(color, filled);
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    public void setSide1(double side1) {
        this.side1 = side1;
    }

    public void setSide2(double side2) {
        this.side2 = side2;
    }

    public void setSide3(double side3) {
        this.side3 = side3;
    }

    public double getSide1() {
        return side1;
    }

    public double getSide2() {
        return side2;
    }

    public double getSide3() {
        return side3;
    }

    public double getCV(){
        return this.side1 + this.side2 + this.side3;
    }
    public double getArea(){
        return Math.sqrt((this.getCV()/2)*((this.getCV()/2)-this.side1)*((this.getCV()/2)-this.side2)*((this.getCV()/2)-this.side3));
    }

    public  String toString(){
        return "tam giác với 3 cạnh = "
                +this.side1
                +" "+this.side2
                +" "+this.side3
                +" là class con của "
                +super.toString();
    }
}
