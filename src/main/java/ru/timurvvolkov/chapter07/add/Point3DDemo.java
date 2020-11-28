package ru.timurvvolkov.chapter07.add;

public class Point3DDemo {
    public static void main(String[] args) {
        Point3D pt1 = new Point3D();
        pt1.x = 1;
        pt1.y = 4;
        pt1.z = 7;
        System.out.println("Точка 1: x = " + pt1.x + "; y =  " + pt1.y + "; z = " + pt1.z);
        Point3D pt2 = new Point3D();
        pt2.x = 2;
        pt2.y = 6;
        pt2.z = 0;
        System.out.println("Точка 2: x = " + pt2.x + "; y =  " + pt2.y + "; z = " + pt2.z);
        Point3D pt3 = new Point3D();
        pt3.x = 8;
        pt3.y = 7;
        pt3.z = 2;
        System.out.println("Точка 3: x = " + pt3.x + "; y =  " + pt3.y + "; z = " + pt3.z);
    }
}
