package com.timurvvolkov.chapter08;

public class DemoSuper {
    public static void main(String[] args) {
        BoxWeight mybox1 = new BoxWeight(10, 20, 15, 34.3);
        BoxWeight mybox2 = new BoxWeight(2, 3, 4, 0.076);
        BoxWeight mybox3 = new BoxWeight();
        BoxWeight mycube = new BoxWeight(3, 2);
        BoxWeight myclone = new BoxWeight(mybox1);
        System.out.println("Объем mybox1 равен " + mybox1.volume());
        System.out.println("Вес mybox1 равен " + mybox1.weight);
        System.out.println();
        System.out.println("Объем mybox2 равен " + mybox2.volume());
        System.out.println("Вес mybox2 равен " + mybox2.weight);
        System.out.println();
        System.out.println("Объем mybox3 равен " + mybox3.volume());
        System.out.println("Вес mybox3 равен " + mybox3.weight);
        System.out.println();
        System.out.println("Объем mycube равен " + mycube.volume());
        System.out.println("Вес mycube равен " + mycube.weight);
        System.out.println();
        System.out.println("Объем myclone равен " + myclone.volume());
        System.out.println("Вес myclone равен " + myclone.weight);
    }
}
