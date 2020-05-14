package com.upgrad.sorting;

import java.util.Arrays;

public class SortingAlgorithms {
    private int[] array;
    private int size;
    
    public SortingAlgorithms(int[] array, int size) {
        this.array = array;
        this.size = size;
    }
    
    public void selectionSort() {
        for (int i = 0; i < size-2; i++) {
            int minValue = array[i];
            int minIndex = i;
            for (int j = i ; j < size ; j++) {
                if (array[j] < minValue) {
                    minIndex = j;
                    minValue = array[j];
                }
            }
            
            // swap i and minIndex
            int temp = array[i];
            array[i] = array[minIndex];
            array[minIndex] = temp;
        }
        this.printOutput("O(n^2)");
    }
    
    private void printOutput(String runningTime) {
        for (int value : array) {
            System.out.println(value);
        }
        
        System.out.println(" Running time " + runningTime);
    }
    
    public void bubbleSort() {
        for (int k = 0; k < size; k++ ) {
            boolean flag = false;
            for (int i = 0; i < size - k -1; i++) {
                if (array[i] > array[i+1]) {
                    int temp = array[i+1];
                    array[i+1] = array[i];
                    array[i] = temp;
                    flag = true;
                }
            }
            if (!flag) {
                break;
            }
        }
        
        this.printOutput("O(n^2)");
    }
    
    
    public void insertionSortIterativeMethod() {
        for (int i = 1; i < size; i++) {
            int value = array[i];
            int j = i - 1;
            while (j >= 0) {
                if (array[j] > value) {
                    array[j+1] = array[j];
                    
                } else {
                    break;
                }
                j-= 1;
            }
            array[j+1] = value;
        }
       
        this.printOutput("O(n^2");
    }
    
    public void mergeSort() {
        int[] input = this.array;
        this.array = this.mergeSortUtil(input);
        this.printOutput("O(nlogn)");
    }
    
    private int[] mergeSortUtil(int[] arr) {
        
        int size = arr.length;
        if (size < 2) {
            return arr;
        }
       
        int mid = size / 2;
        int[] left = mergeSortUtil(Arrays.copyOfRange(arr, 0, mid));
        int[] right = mergeSortUtil(Arrays.copyOfRange(arr, mid, size));
        
        // merge the result
        return this.merge(left, right);
    }
    
    private int[] merge(int[] left, int[] right) {
        int sizeOfLeftArray = left.length;
        int sizeOfRightArray = right.length;
        int currentLeftIndex = 0;
        int currentRightIndex = 0;
        int[] resultantArray = new int[sizeOfLeftArray + sizeOfRightArray];
        int index = 0;
    
        while (currentLeftIndex < sizeOfLeftArray && currentRightIndex < sizeOfRightArray) {
            if (left[currentLeftIndex] <= right[currentRightIndex]) {
                resultantArray[index] = left[currentLeftIndex];
                currentLeftIndex += 1;
    
            } else if (right[currentRightIndex] < left[currentLeftIndex]) {
                resultantArray[index] = right[currentRightIndex];
                currentRightIndex += 1;
            }
            index += 1;
        }
    
        while (currentLeftIndex < sizeOfLeftArray) {
            resultantArray[index] = left[currentLeftIndex];
            currentLeftIndex += 1;
            index += 1;
        }
    
        while (currentRightIndex < sizeOfRightArray) {
            resultantArray[index] = right[currentRightIndex];
            currentRightIndex += 1;
            index += 1;
        }
    
        return resultantArray;
    }
    
    public void quickSort() {
    
    }
    
    private void quickSortUtil(int[] arr, int start, int end) {
        if (start >= end) {
//            int partitionIndex = partition(arr);
            // quickSortUtil();
        }
    }
    
//    private int partition(int[] array) {
//
//    }
//
    public void quickSelect() {}
}


