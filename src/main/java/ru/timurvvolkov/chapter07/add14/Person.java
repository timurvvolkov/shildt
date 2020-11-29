package ru.timurvvolkov.chapter07.add14;

public class Person {
    private String fio;
    private int age;
    private int weight;
    private int rank;

    Person() {
    }

    Person(String fio) {
        this.fio = fio;
    }

    Person(String fio, int age) {
        this.fio = fio;
        this.age = age;
    }

    Person(String fio, int age, int weight) {
        this.fio = fio;
        this.age = age;
        this.weight = weight;
    }

    Person(String fio, int age, int weight, int rank) {
        this.fio = fio;
        this.age = age;
        this.weight = weight;
        this.rank = rank;
    }

    public String getFio() {
        return fio;
    }

    public void setFio(String fio) {
        char[] arr = fio.toCharArray();
        for (char ch : arr) {
            if (!((ch >= 65 && ch <= 90) || (ch >= 97 && ch <= 122) || (ch == 32) || (ch == 45))) {
                return;
            }
        }
        this.fio = fio;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age >= 14 && age <= 100) {
            this.age = age;
        }
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        if (weight >= 25 && weight <= 200) {
            this.weight = weight;
        }
    }

    public int getRank() {
        return rank;
    }

    public void setRank(int rank) {
        if (rank >= 1 && rank <= 5) {
            this.rank = rank;
        }
    }
}
