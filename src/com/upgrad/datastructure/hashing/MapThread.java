package com.upgrad.datastructure.hashing;

import java.util.ArrayList;

public class MapThread implements Runnable{
    
    private static ArrayList<Aggregator> listOfAggregator= new ArrayList<>();
    private static int numberOfAggregator;
    
    public static void setNumberOfAggregator(int num) {
        numberOfAggregator = num;
        for (int i= 0; i < num; i++) {
            listOfAggregator.add(new Aggregator());
        }
    }
    
    private int getIndexOfAggregator(String s) {
        return 0;
    }
    
    
    private void addWordToAggregator(int index, String word) {
    
    }
    
    
    @Override
    public void run() {
        System.out.println();
    }
}
