package geometry;

public class Test {
    public static void main(String[] args) {
        Shape shape = new Shape();
        System.out.println(shape);

        Shape shape2 = new Shape("blue", false);
        System.out.println(shape2);
        System.out.println("---------------------------------------------------------------------------------------");

        Circle cc = new Circle();
        System.out.println(cc);
        Circle circle = new Circle(10.0);
        System.out.println(circle);
        circle = new Circle(3.5, "indigo", false);
        System.out.println(circle);
        System.out.println("dien tích hình tròn = "+circle.getArea());
        System.out.println("chu vi hình tròn = "+circle.getPerimeter());
        System.out.println("----------------------------------------------------------------------------------------");
        Rectangle rectangle = new Rectangle();
        System.out.println(rectangle);
        System.out.println("diện tích hcn = "+rectangle.getArea());
        System.out.println("chu vi hcn = "+rectangle.getPerimeter());
        Rectangle rectangle1 = new Rectangle(16,8);
        System.out.println(rectangle1);
        System.out.println("diện tích hcn1 = "+rectangle1.getArea());
        System.out.println("chu vi hcn1 = "+rectangle1.getPerimeter());
        Rectangle rectangle2 = new Rectangle(18,12,"blue",false);
        System.out.println(rectangle2);
        System.out.println("diện tích hcn2 = "+rectangle2.getArea());
        System.out.println("chu vi hcn2 = "+rectangle2.getArea());
        System.out.println("----------------------------------------------------------------------------------------");
        Square square = new Square();
        System.out.println(square);
        System.out.println("chu vi hình vuông : "+square.getPerimeter());
        System.out.println("diện tích hình vuông: "+square.getArea());
        Square square1 = new Square(4);
        System.out.println(square1);
        System.out.println("chu vi hình vuông1 : "+square1.getPerimeter());
        System.out.println("diện tích hình vuông1: "+square1.getArea());
        Square square2 = new Square(6,"yellow",true);
        System.out.println(square2);
        System.out.println("chu vi hình vuông1 : "+square2.getPerimeter());
        System.out.println("diện tích hình vuông1: "+square2.getArea());




    }


}
