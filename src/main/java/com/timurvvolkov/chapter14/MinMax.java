package com.timurvvolkov.chapter14;

interface MinMax<T extends Comparable<T>> {
    T min();
    T max();
}
