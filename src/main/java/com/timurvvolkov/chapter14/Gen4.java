package com.timurvvolkov.chapter14;

class Gen4<T extends Number> {
    T ob;
    T[] vals;

    Gen4(T o, T[] nums) {
        ob = o;
//        vals = new T[10];
        vals = nums;
    }
}
