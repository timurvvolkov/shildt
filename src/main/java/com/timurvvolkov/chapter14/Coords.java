package com.timurvvolkov.chapter14;

class Coords<T extends TwoD> {
    T[] coords;

    Coords(T[] coords) {
        this.coords = coords;
    }
}
