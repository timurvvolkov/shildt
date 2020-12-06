package com.timurvvolkov.chapter12;

public enum Apple3a {
    Jonathan(10), GoldenDel(9), RedDel, Winesap(15), Cortland(8);

    private int price;

    Apple3a(int price) {
        this.price = price;
    }

    Apple3a() {
        price = -1;
    }

    int getPrice() {
        return price;
    }
}
