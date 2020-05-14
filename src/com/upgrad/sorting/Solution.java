package com.upgrad.sorting;

import com.sun.org.apache.xml.internal.utils.SystemIDResolver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {
    
    public static void main(String[] args) {
        System.out.println("Welcome to the Sorting Algorithms Section");
        
        System.out.println("Enter number of elements in the Array");
    
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        try {
            int N = Integer.parseInt(reader.readLine());
            
            System.out.println("Please enter your array");
            
            String input = reader.readLine();
            String[] arrayElements = input.split(" ");
            
            int[] intInput = new int[N];
            
            for (int i = 0; i < N; i++) {
                intInput[i] = Integer.parseInt(arrayElements[i]);
            }
            
            System.out.println("Please enter you choice of Algorithm for Sorting");
            System.out.println("1. Selection Sort\n 2. Bubble Sort\n 3. Insertion Sort\n 4. Merge Sort\n 5. Quick Sort");
            
            int choice = Integer.parseInt(reader.readLine());
            
            SortingAlgorithms algorithms = new SortingAlgorithms(intInput, N);
            switch (choice) {
                case 1: algorithms.selectionSort();
                        System.out.println("Selection Sort");
                        break;
                        
                case 2: algorithms.bubbleSort();
                        System.out.println("Bubble Sort");
                        break;
                        
                case 3: algorithms.insertionSortIterativeMethod();
                        System.out.println("Insertion Iterative Method Sort");
                        break;
                        
                case 4: algorithms.mergeSort();
                        System.out.println("Merge Sort");
                        break;
                        
                case 5: System.out.println("Quick Sort");
                        break;
            }
        } catch (IOException e) {
            System.out.println(e);
        }
    }
}
