package CircleAndCilynder;

import javax.swing.plaf.PanelUI;

public class Circle {
    private double radius = 2.0;
    private String color ;
    public Circle(){};
    public Circle(double radius, String color){
        this.radius = radius;
        this.color = color;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
    public double getArea() {
        return Math.PI*(this.radius*this.radius);
    }

    public String toString(){
        return "class Circle với r = "
                +getRadius()
                +" diện tích  = "
                +getArea();
    }
}
