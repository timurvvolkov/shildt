package com.timurvvolkov.chapter15;

class ConstructorRefDemo3 {
    static <R, T> R myClassFactory(MyFunc6<R, T> cons, T v) {
        return cons.func(v);
    }

    public static void main(String[] args) {
        MyFunc6<MyClass3<Double>, Double> myClassCons = MyClass3<Double>::new;
        MyClass3<Double> mc = myClassFactory(myClassCons, 100.1);
        System.out.println("Значение val в объекте mc равно " + mc.getVal());
        MyFunc6<MyClass4, String> myClassCons2 = MyClass4::new;
        MyClass4 mc2 = myClassFactory(myClassCons2, "Лямбда");
        System.out.println("Значение str в объекте mc2 равно " + mc2.getVal());
    }
}
