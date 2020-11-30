package ru.timurvvolkov.chapter08;

public class ColorBox extends Box {
    int color;

    public ColorBox(double width, double height, double depth, int color) {
        super(width, height, depth);
        this.color = color;
    }
}
