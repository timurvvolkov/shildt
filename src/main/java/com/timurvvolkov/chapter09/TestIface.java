package com.timurvvolkov.chapter09;

public class TestIface {
    public static void main(String[] args) {
        CallBack c = new Client();
        c.callback(42);
    }
}
