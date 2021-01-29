package com.timurvvolkov.my.equalshashcode;

import java.util.Objects;

public class MyClass {
    private int a;
    private int b;

    public MyClass(int a, int b) {
        this.a = a;
        this.b = b;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MyClass myClass = (MyClass) o;
        return a == myClass.a &&
                b == myClass.b;
    }

    @Override
    public int hashCode() {
        return Objects.hash(a, b);
    }

    public static void main(String[] args) {
        MyClass myClass1 = new MyClass(2, 1);
        MyClass myClass2 = new MyClass(2, 1);
        MyClass myClass3 = new MyClass(2, 2);
        System.out.println(myClass1.hashCode());
        System.out.println(myClass2.hashCode());
        System.out.println(myClass3.hashCode());
        System.out.println(myClass1.equals(myClass2));
        System.out.println(myClass2.equals(myClass1));
        System.out.println(myClass1.equals(myClass3));
        System.out.println(myClass3.equals(myClass1));
        System.out.println(myClass2.equals(myClass3));
        System.out.println(myClass3.equals(myClass2));
    }
}
