package CircleAndCilynder;

public class Cylinder extends Circle{
    private double height = 3.0;
    public Cylinder(){
        super();
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public Cylinder(double height, double radius, String color){
        super(radius, color);
        this.height = height;
    }
    public double getV(){
        return super.getArea()*this.height;
    }
    public String toString(){
        return "Hình trụ với chiều cao = "
                +getHeight()
                +" là class con của "
                +super.toString();
    }
}
