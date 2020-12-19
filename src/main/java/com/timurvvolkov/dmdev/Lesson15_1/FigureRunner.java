package com.timurvvolkov.dmdev.Lesson15_1;

class FigureRunner {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(new Point(0, 100), new Point(100, 10));
        Circle circle = new Circle(new Point(25, 30), 20.4);
        Triangle triangle = new Triangle(new Point(0, 0), new Point(30, 50), new Point(60, 10));
        System.out.println(rectangle);
        System.out.println(rectangle.getLeftUp() + " " + rectangle.getRightDown());
        System.out.println("Площадь: " + rectangle.getArea());
        System.out.println("Длина диагонали: " + rectangle.getDiagonal());
        System.out.println(circle);
        System.out.println(circle.getPoint() + " " + circle.getRadius());
        System.out.println("Площадь: " + circle.getArea());
        System.out.println("Периметр: " + circle.getPerimeter());
        System.out.println(triangle);
        System.out.println(triangle.getPoint1() + " " + triangle.getPoint2() + " " + triangle.getPoint3());
        System.out.println("Площадь: " + triangle.getArea());
        System.out.println("Периметр: " + triangle.getPerimeter());
        System.out.println("Высота: " + triangle.getHeight());
        System.out.println(ShapeUtils.isRectangle(circle));
        System.out.println(ShapeUtils.isTriangle(triangle));
        System.out.println(circle.isAreaEqual(rectangle));
    }
}
