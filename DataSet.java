package com.mycompany.it221_lab_homework_1;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class DataSet {
   
    private int[] data;
    
    public void createManual() {
        Scanner createManualElements = new Scanner(System.in);
        System.out.print("Enter Number of Elements: ");
        int manualElements = createManualElements.nextInt();
        
        data = new int [manualElements];
        
        for (int i = 0; i < manualElements; i++) {
            System.out.print("Enter Value For " +  (i + 1) + ": ");
            data [i] = createManualElements.nextInt();
        }
        
        printData();
    }
    
    public void createRandom() {
        Scanner createRandomElements = new Scanner(System.in);
        System.out.print("Enter Number of Elements: ");
        int randomElements = createRandomElements.nextInt();
        
        data = new int [randomElements];
        
        for (int i = 0; i < data.length; i++) {
            Random random = new Random();
            data[i] = random.nextInt(100);
        }
        
        printData();
    }
    
    public void printData() {
        if (isEmpty()) {
            System.out.println("\nEmpty Dataset. Create Dataset First.");
        } else {
            System.out.print("\nYour Generated Data: ");
        
            for (int num : data) {
                System.out.print(num + " ");
            }
            System.out.println();
        }
    }
    
    public void sortAscending() {
        Arrays.sort(data);
    }
    
    public int[] getData() {
        return data;
    }
    
    public boolean isEmpty() {
        return data == null || data.length == 0;
    }
}
