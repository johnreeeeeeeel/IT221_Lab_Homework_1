package com.mycompany.it221_lab_homework_1;

import java.util.Scanner;

public class SearchApp {

    public static void main(String[] args) {

        DataSet ds = new DataSet();
        Searcher searcher = new Searcher();

        int choice;

        do {
            System.out.println("\n--- Main Menu ---");
            System.out.println("1. Create Manual Dataset");
            System.out.println("2. Create Random Dataset");
            System.out.println("3. Validate Dataset");
            System.out.println("4. Search Target - Sequential");
            System.out.println("5. Seach Target - Binary");
            
            System.out.print("Choice: ");

            Scanner scanner = new Scanner(System.in);
            choice = scanner.nextInt();

            switch (choice) {

                case 1:
                    ds.createManual();
                    break;

                case 2:
                    ds.createRandom();
                    break;

                case 3:
                    ds.printData();
                    break;

                case 4:
                    if (ds.isEmpty()) {
                        System.out.println("\nDataset Empty. Create Dataset First.");
                        break;
                        
                    } else {
                        System.out.print("Enter target: ");
                        int targetSequential = scanner.nextInt();

                        SearchResult resultSequential = searcher.sequentialSearch(ds.getData(), targetSequential);

                        printResult("Sequential Search", targetSequential, resultSequential);
                        break;
                    }

                case 5:
                    if (ds.isEmpty()) {
                        System.out.println("\nDataset Empty. Create Dataset First.");
                        break;
                        
                    } else {
                        ds.sortAscending();

                        System.out.print("Enter target: ");
                        int targetBinary = scanner.nextInt();

                        SearchResult resultBinary = searcher.binarySearch(ds.getData(), targetBinary);

                        printResult("Binary Search", targetBinary, resultBinary);
                        break;
                    }

                default:
                    System.out.println("Invalid choice.");
            }

        } while (choice != 6);
    }

    public static void printResult(String algorithm, int target, SearchResult result) {
        System.out.println("\nAlgorithm: " + algorithm);
        System.out.println("Target: " + target);
        System.out.println("Found: " + (result.isFound() ? "Yes" : "No"));
        System.out.println("Index: " + result.getIndex());
        System.out.println("Comparisons: " + result.getComparison());
    }
}
