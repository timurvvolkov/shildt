package com.timurvvolkov.chapter24;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class MyMouseAdapter2 extends MouseAdapter {
    MousePressedDemo mousePressedDemo;

    public MyMouseAdapter2(MousePressedDemo mousePressedDemo) {
        this.mousePressedDemo = mousePressedDemo;
    }

    @Override
    public void mousePressed(MouseEvent me) {
        mousePressedDemo.msg = "Mouse pressed.";
        mousePressedDemo.repaint();
    }
}
