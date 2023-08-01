package com.workintech.model;

public enum PaintColor {
    RED("Red"),
    BLUE("Blue"),
    GREEN("Green"),
    YELLOW("Yellow"),
    BLACK("Black"),
    WHITE("White");

    private final String colorName;

    PaintColor(String colorName) {
        this.colorName = colorName;
    }
    public String getColorName() {
        return colorName;
    }
}
