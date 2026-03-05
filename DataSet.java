package com.mycompany.it221_lab_homework_1;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class DataSet {
   
    private int[] data;
    
    public void createManual() {
        Scanner createManualElements = new  Scanner(System.in);
        System.out.println("Please Enter Number of Elements.");
        int manualElements = createManualElements.nextInt();
        
        data = new int [manualElements];
        
        for (int i = 0; i < manualElements; i++) {
            System.out.println("Enter Value " + (i + 1) + ": ");
            data[i] = createManualElements.nextInt();
        }
    }
    
    public void createRandom(int randomNumbers) {
        Random createRandomElement = new Random();
        
        data = new int[randomNumbers];
        
        for (int i = 0; i < randomNumbers; i++) {
            data[i] = createRandomElement.nextInt(100); 
            System.out.println("Random Dataset Created.");
        }
    }
    
    public void printData() {
        if (isEmpty()) {
            System.out.println("Empty Dataset. Create Dataset First.");
        } else {
            System.out.println("Data: ");
        
            for (int num : data) {
                System.out.print(num + " ");
            }
            System.out.println();
        }
    }
    
    public void sortAscending() {
        Arrays.sort(data);
        System.out.println("Sorted Dataset.");
    }
    
    public int[] getData() {
        return data;
    }
    
    public boolean isEmpty() {
        return data == null || data.length == 0;
    }
}
