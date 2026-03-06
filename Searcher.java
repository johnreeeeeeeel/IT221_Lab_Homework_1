package com.mycompany.it221_lab_homework_1;

public class Searcher {

    public SearchResult sequentialSearch(int[] data, int target) {

        int comparisons = 0;

        for (int i = 0; i < data.length; i++) {
            comparisons++;

            if (data[i] == target) {
                return new SearchResult(true, i, comparisons);
            }
        }

        return new SearchResult(false, -1, comparisons);
    }

    public SearchResult binarySearch(int[] data, int target) {

        int first = 0;
        int last = data.length - 1;
        int comparisons = 0;

        while (first <= last) {
            int mid = (first + last) / 2;
            comparisons++;

            if (data[mid] == target) {
                return new SearchResult(true, mid, comparisons);
            } 
            else if (target > data[mid]) {
                first = mid + 1;
            } 
            else {
                last = mid - 1;
            }
        }

        return new SearchResult(false, -1, comparisons);
    }
}
