package com.timurvvolkov.chapter11;

public class Caller2 implements Runnable {
    String msg;
    CallMe target;
    Thread t;

    public Caller2(CallMe target, String msg) {
        this.target = target;
        this.msg = msg;
        t = new Thread(this);
        t.start();
    }

    public void run() {
        synchronized (target) {
            target.call(msg);
        }
    }
}
