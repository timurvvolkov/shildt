package com.timurvvolkov.chapter07.add14;

public class PersonDemo {
    public static void main(String[] args) {
        Person p1 = new Person();
        Person p2 = new Person("Ivanov-Kotov Ivan Ivanovich");
        Person p3 = new Person("Ivanov-Kotov Ivan Ivanovich", 25);
        Person p4 = new Person("Ivanov-Kotov Ivan Ivanovich", 37, 76);
        Person p5 = new Person("Ivanov-Kotov Ivan Ivanovich", 21, 68, 3);
        p1.setFio("Ivanov-Kotov Ivan Ivanovich");
        p1.setAge(32);
        p1.setWeight(83);
        p1.setRank(1);
        p2.setAge(44);
        p2.setWeight(93);
        p2.setRank(5);
        p3.setWeight(87);
        p3.setRank(4);
        p4.setRank(2);
        show(p1);
        show(p2);
        show(p3);
        show(p4);
        show(p5);
    }

    public static void show(Person person) {
        System.out.println("fio = " + person.getFio()
                + " age = " + person.getAge()
                + " weight = " + person.getWeight()
                + " rank = " + person.getRank()
        );
    }
}
