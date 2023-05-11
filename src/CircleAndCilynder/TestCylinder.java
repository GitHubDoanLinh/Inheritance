package CircleAndCilynder;

public class TestCylinder {
    public static void main(String[] args) {
        Cylinder cylinder = new Cylinder();
        System.out.println(cylinder);
        System.out.println("thể tích hình trụ = "+cylinder.getV());
        Cylinder cylinder1 = new Cylinder(5.0,3.5,"blue");
        System.out.println(cylinder1);
        System.out.println("thể tích hình trụ 1 = "+cylinder1.getV());

    }
}
