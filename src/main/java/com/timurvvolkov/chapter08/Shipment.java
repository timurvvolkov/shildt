package com.timurvvolkov.chapter08;

public class Shipment extends BoxWeight {
    double cost;

    Shipment(Shipment ob) {
        super(ob);
        cost = ob.cost;
    }

    Shipment(double width, double height, double depth, double weight, double cost) {
        super(width, height, depth, weight);
        this.cost = cost;
    }

    Shipment() {
        super();
        cost = -1;
    }

    Shipment(double len, double weight, double cost) {
        super(len, weight);
        this.cost = cost;
    }
}
