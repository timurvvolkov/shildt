package com.timurvvolkov.chapter26;

import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class LabelDemo extends Frame {
    public LabelDemo() {
        setLayout(new FlowLayout());

        Label one = new Label("One");
        Label two = new Label("Two");
        Label three = new Label("Three");

        add(one);
        add(two);
        add(three);

        addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent we) {
                System.exit(0);
            }
        });
    }

    public static void main(String[] args) {
        LabelDemo appwin = new LabelDemo();
        appwin.setSize(new Dimension(300, 100));
        appwin.setTitle("LabelDemo");
        appwin.setVisible(true);
    }
}
