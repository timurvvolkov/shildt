package com.timurvvolkov.chapter18;

class TestClone implements Cloneable {
    int a;
    double b;

    TestClone cloneTest() {
        try {
            return (TestClone) super.clone();
        } catch (CloneNotSupportedException e) {
            System.out.println("Клонирование невозможно.");
            return this;
        }
    }
}
