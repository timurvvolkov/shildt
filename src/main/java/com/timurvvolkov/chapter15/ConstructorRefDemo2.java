package com.timurvvolkov.chapter15;

class ConstructorRefDemo2 {
    public static void main(String[] args) {
        MyFunc5<Integer> myClassCons = MyClass3<Integer>::new;
        MyClass3<Integer> mc = myClassCons.func(100);
        System.out.println("Значение val в объекте mc равно " + mc.getVal());
    }
}
