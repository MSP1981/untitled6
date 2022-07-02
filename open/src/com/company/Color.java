package com.company;

public enum Color {
    BLACK("Черный"),
    WHITE("Белый"),
    BLUE("Голубой"),
    RED("Красный");

    private String color;

    Color(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }
}


