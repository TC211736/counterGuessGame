package com.company;

public class Counter {
    private String colour;

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }
    Counter(String pcolour) {
        colour = pcolour;
    }

    @Override
    public String toString() {
        return "Your Counter is the colour " + colour;
    }
}
