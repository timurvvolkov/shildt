package com.timurvvolkov.chapter15;

class HighTemp {
    private int hTemp;

    HighTemp(int ht) {
        this.hTemp = ht;
    }

    boolean sameTemp(HighTemp ht2) {
        return hTemp == ht2.hTemp;
    }

    boolean lessThanTemp(HighTemp ht2) {
        return hTemp < ht2.hTemp;
    }
}
