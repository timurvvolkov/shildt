package com.timurvvolkov.my.equalshashcode;

import java.util.Map;
import java.util.HashMap;

public class HMap {
    public static void main(String[] args) {
        Map<String, String> hashmap = new HashMap<>();
        String key = "0";
        hashmap.put(key, "zero");
        int hashCode = key.hashCode();
        System.out.println(hashCode);
        hashCode = hashCode ^ (hashCode >>> 20) ^ (hashCode >>> 12);
        System.out.println(hashCode);
        hashCode = hashCode ^ (hashCode >>> 7) ^ (hashCode >>> 4);
        System.out.println(hashCode);
        int size = 16;
        System.out.println(hashCode & (size - 1));

        key = "key";
        hashmap.put(key, "one");
        hashCode = key.hashCode();
        System.out.println(hashCode);
        hashCode = hashCode ^ (hashCode >>> 20) ^ (hashCode >>> 12);
        System.out.println(hashCode);
        hashCode = hashCode ^ (hashCode >>> 7) ^ (hashCode >>> 4);
        System.out.println(hashCode);
        System.out.println(hashCode & (size - 1));
    }
}
