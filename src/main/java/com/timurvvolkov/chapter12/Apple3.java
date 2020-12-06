package com.timurvvolkov.chapter12;

public enum Apple3 {
    Jonathan(10), GoldenDel(9), RedDel(12), Winesap(15), Cortland(8);

    private int price;

    Apple3(int price) {
        this.price = price;
    }

    int getPrice() {
        return price;
    }
}
