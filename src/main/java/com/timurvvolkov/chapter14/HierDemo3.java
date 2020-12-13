package com.timurvvolkov.chapter14;

class HierDemo3 {
    public static void main(String[] args) {
        Gen<Integer> iOb = new Gen<>(88);
        Gen2b<Integer> iOb2 = new Gen2b<>(99);
        Gen2b<String> strOb2 = new Gen2b<>("Тест обобщений");
        if (iOb2 instanceof Gen2b<?>) {
            System.out.println("Объект iOb2 является экземпляром класса Gen2b");
        }
        if (iOb2 instanceof Gen<?>) {
            System.out.println("Объект iOb2 является экземпляром класса Gen");
        }
        System.out.println();
        if (strOb2 instanceof Gen2b<?>) {
            System.out.println("Объект strOb является экземпляром класса Gen2b");
        }
        if (strOb2 instanceof Gen<?>) {
            System.out.println("Объект strOb является экземпляром класса Gen");
        }
        System.out.println();
        if (iOb instanceof Gen2b<?>) {
            System.out.println("Объект iOb является экземпляром класса Gen2b");
        }
        if (iOb instanceof Gen<?>) {
            System.out.println("Объект iOb является экземпляром класса Gen");
        }
//        if (iOb2 instanceof Gen2b<Integer>) {
//            System.out.println("Объект iOb является экземпляром класса Gen2b<Integer>");
//        }
    }
}
