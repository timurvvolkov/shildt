package com.timurvvolkov.chapter29;

import java.util.ArrayList;
import java.util.Spliterator;
import java.util.stream.Stream;

class StreamDemo10 {
    public static void main(String[] args) {
        ArrayList<String> myList = new ArrayList<>();
        myList.add("Альфа");
        myList.add("Бета");
        myList.add("Гамма");
        myList.add("Дельта");
        myList.add("Кси");
        myList.add("Омега");

        Stream<String> myStream = myList.stream();

        Spliterator<String> splitItr = myStream.spliterator();

        Spliterator<String> splitItr2 = splitItr.trySplit();

        if (splitItr2 != null) {
            System.out.println("Результат, выводимый итератором splitItr2: ");
            splitItr2.forEachRemaining(n -> System.out.println(n));
        }

        System.out.println("\nРезультат, выводимый итератором splitItr: ");
        splitItr.forEachRemaining(n -> System.out.println(n));
    }
}
