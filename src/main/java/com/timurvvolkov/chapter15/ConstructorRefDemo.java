package com.timurvvolkov.chapter15;

class ConstructorRefDemo {
    public static void main(String[] args) {
        MyFunc4 myClassCons = MyClass2::new;
        MyClass2 mc = myClassCons.func(100);
        System.out.println("Значение val в объекте mc равно " + mc.getVal());
    }
}
