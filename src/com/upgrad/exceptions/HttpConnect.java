package com.upgrad.exceptions;

import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * @param destination
 * @param data
 * @param partner
 * @throws IOException
 * @throws IllegalArgumentException generated if destination < 0 || destination > 1
 */

public class HttpConnect {
    public static void send(int destination, String data, String partner) throws IOException {
        
        if ( destination < 0 || destination > 1) {
            throw new IllegalArgumentException();
        }
        
        System.out.println("\nInside send ...");
        if (destination == 0) {
            throw new FileNotFoundException("");
        } else if (destination == 1) {
            throw new IOException();
        }
        System.out.println("\nEnd of send");
    }
}
