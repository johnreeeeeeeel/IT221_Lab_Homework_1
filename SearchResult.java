package com.mycompany.it221_lab_homework_1;

public class SearchResult {
    private final boolean found;
    private final int index;
    private final int comparison;
    
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
