package geometry;

public class Square extends Shape{
    double side = 2.0;
    public Square(){}
    public Square(double side){
        this.side = side;
    }
    public Square(double side, String color, boolean filled) {
        super(color, filled);
        this.side = side;
    }
    public double getSide(){
        return this.side;
    }
    public void setSide(double side){
        this.side = side;
    }

    public double getArea(){
        return this.side*this.side;
    }
    public double getPerimeter(){
        return Math.pow(this.side,2);
    }

    public String toString(){
        return "Hình vuông với cạnh = "
                +getSide()
                +"là class con của class Shape "
                +super.toString();
    }
}
