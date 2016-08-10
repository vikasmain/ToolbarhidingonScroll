package com.example.dell.toolbarhidingonscroll;


public class NumberHelper {

    String numNames;
    int numImages;

    public int getNumImages() {
        return numImages;
    }

    public void setNumImages(int numImages) {
        this.numImages = numImages;
    }

    public String getNumNames() {
        return numNames;
    }

    public void setNumNames(String numNames) {
        this.numNames = numNames;
    }

    public NumberHelper(String numNames, Integer numImages) {
        this.numNames = numNames;
        this.numImages = numImages;
    }
}