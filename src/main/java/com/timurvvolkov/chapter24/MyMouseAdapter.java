package com.timurvvolkov.chapter24;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

class MyMouseAdapter extends MouseAdapter {
    AdapterDemo adapterDemo;

    public MyMouseAdapter(AdapterDemo adapterDemo) {
        this.adapterDemo = adapterDemo;
    }

    @Override
    public void mouseClicked(MouseEvent me) {
        adapterDemo.msg += "Mouse clicked";
        adapterDemo.repaint();
    }

    @Override
    public void mouseDragged(MouseEvent me) {
        adapterDemo.msg += "Mouse dragged";
        adapterDemo.repaint();
    }
}
