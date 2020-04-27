package com.upgrad.datastructure.hashing;

import java.util.HashMap;

public class Aggregator {
    private HashMap<String, Integer> hashMap = new HashMap<>();
    
    public void add(String word) {
        if (hashMap.containsKey(word)) {
            hashMap.put(word, hashMap.get(word) + 1);
        } else {
            hashMap.put(word , 1);
        }
    }
    
}
