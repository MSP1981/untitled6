package com.company;

public class ColorBox extends Box {
    private String color;

    public ColorBox(double width, double height, double depth, String metal, String color) {
        super(width, height, depth, metal);
        this.color = color;
        if (width <= 0 || height <=0 || depth <= 0) {
            System.out.println("Не могу добавить коробку");
        }
    }

    @Override
    public String toString() {
        return "ColorBox{" +
                "color='" + color + '\'' +
                "} " + super.toString();
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    }



