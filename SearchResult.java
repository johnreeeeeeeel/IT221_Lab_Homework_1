package com.mycompany.it221_lab_homework_1;

public class SearchResult {
    private boolean found;
    private int index;
    private int comparison;
    
    public SearchResult (boolean found, int index, int comparison) {
        this.found = found;
        this.index = index;
        this.comparison = comparison;
    }
    
    public boolean isFound() {
        return found;
    }
    
    public int getIndex() {
        return index;
    }
    
    public int getComparison() {
        return comparison;
    }
}
