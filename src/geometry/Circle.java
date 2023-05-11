package geometry;

import javax.swing.plaf.PanelUI;

public class Circle extends Shape{
    private double radius = 1.0;// Thuộc tính riêng của class Circle
    public Circle(){}

    public Circle(double radius){
        this.radius = radius;
    }
    public Circle(double radius, String color, boolean filled){
        super(color, filled);// super gọi tới thuộc tính của class cha
        this.radius = radius;
    }

    public double getRadius(){
        return this.radius;
    }
    public void setRadius(double radius){
        this.radius = radius;
    }

    public double getArea(){
        return radius*radius * Math.PI;
    }
    public double getPerimeter(){
        return 2 * radius * Math.PI;
    }

    @Override // ghi đè phương thức toString() của class cha (Shape)
    public String toString(){
        return "Một hình tròn với bán kính = "
                + getRadius()
                +", là 1 class con của class shape "
                + super.toString();// super đại diện cho class cha
    }
}
