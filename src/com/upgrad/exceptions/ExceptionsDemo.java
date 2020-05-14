package com.upgrad.exceptions;

import java.io.FileNotFoundException;
import java.io.IOException;

public class ExceptionsDemo {
    public static void main(String[] args) {
        System.out.println("\nInside main ...");
        share();
        System.out.println("\nEnd of main");
    }
    
    private static void share() {
        System.out.println("\nInside share ...");
    
        try {
            HttpConnect.send(1, "hello", "http://www.goodsnips.com");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("Connecting to a different server ....");
        } finally {
            System.out.println("Finally blocked has been called ...");
        }
    
        System.out.println("\nEnd of share ...");
    }
}
