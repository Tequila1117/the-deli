package com.pluralsight.deli;

public enum BreadType {

// Constants for each type of bread with their string descriptiongit add -A
    WHITE("White Bread"), WHEAT("Wheat Bread"), RYE("Rye Bread"), WRAP("Wrap Bread");


    private final String name;

    // constructor to initialize instance variable
    BreadType(String name) {
        this.name = name;


    }
        //Getter to get the name of bread type
    public String getName() {
        return name;
    }


}
