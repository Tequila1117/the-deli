package com.pluralsight.deli;

public class Chip {
    // Instance variables
    private ChipType chipType;   // Type of chip (e.g., Lays, Doritos, etc.)
    private String size;         // Size of the chip (e.g., Small, Medium, Large)

    // Constructor to initialize Chip object with a type and size
    public Chip(ChipType chipType, String size) {
        this.chipType = chipType;
        this.size = size;
    }

    // Getter and setter for chipType
    public ChipType getChipType() {
        return chipType;
    }

    public void setChipType(ChipType chipType) {
        this.chipType = chipType;
    }

    // Getter and setter for size
    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    // Override toString to provide a detailed string representation of a chip
    @Override
    public String toString() {
        return "Chip: " + chipType + " - " + size;
    }
}