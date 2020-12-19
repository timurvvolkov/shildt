package com.timurvvolkov.dmdev.Lesson15_1;

class Rectangle extends Figure implements WithDiagonal {
    private Point leftUp;
    private Point rightDown;

    public Rectangle(Point leftUp, Point rightDown) {
        this.leftUp = leftUp;
        this.rightDown = rightDown;
    }

    @Override
    public double getArea() {
        return Math.abs((leftUp.getX() - rightDown.getX()) * (leftUp.getY() - rightDown.getY()));
    }

    @Override
    public double getDiagonal() {
        return leftUp.distance(rightDown);
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "leftUp=" + leftUp +
                ", rightDown=" + rightDown +
                '}';
    }

    public Point getLeftUp() {
        return leftUp;
    }

    public Point getRightDown() {
        return rightDown;
    }
}
