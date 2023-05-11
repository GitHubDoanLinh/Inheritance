package TriangleOfShape;

import java.util.Scanner;

public class TestTriangle {
    public static void main(String[] args) {
        Triangle tg1 = new Triangle();
        System.out.println("Chu vi tam giac1 = "+tg1.getCV());
        System.out.println("Dien tich tam giac = "+tg1.getArea());
        System.out.println(tg1);
        Triangle tg2 = new Triangle(6.0, 6.0, 6.0,"Pink", true);
        System.out.println("Chu vi tam giac1 = "+tg2.getCV());
        System.out.println("Dien tich tam giac = "+tg2.getArea());
        System.out.println(tg2);
        System.out.println("--------------------------------------------------------------------");
        System.out.println("mời bạn nhập vào chiều dài cạnh a của tg: *) a+b>c || a+c>b || b+c>a : ");
        double a = new Scanner(System.in).nextInt();
        System.out.println("mời bạn nhập vào chiều dài cạnh b của tg: *) a+b>c || a+c>b || b+c>a : ");
        double b = new Scanner(System.in).nextInt();
        System.out.println("mời bạn nhập vào chiều dài cạnh c của tg: *) a+b>c || a+c>b || b+c>a : ");
        double c = new Scanner(System.in).nextInt();
        Triangle tg3 = new Triangle(a,b,c,"Violet",true);
        System.out.println("Chu vi tam giac3 = "+tg3.getCV());
        System.out.println("Dien tich tam giac3 = "+tg3.getArea());
        System.out.println(tg3);




    }
}
