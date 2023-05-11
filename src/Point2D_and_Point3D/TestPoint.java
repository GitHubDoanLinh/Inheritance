package Point2D_and_Point3D;

public class TestPoint {

    public static void main(String[] args) {
        Point2D p2 = new Point2D();
        p2.setX(2);
        p2.setY(6);
        p2.setXY(2,6);
        System.out.println("toa do cua 1 diem thuoc point2d : "+p2.getX()+", "+p2.getY());
        System.out.println(p2);

        Point3D p3 = new Point3D(2,6,8);
        System.out.println("toa do cua diem thuoc point3d : "+p3.getX()+", "+p3.getY()+","+p3.getZ());
        System.out.println(p3);

    }
}
