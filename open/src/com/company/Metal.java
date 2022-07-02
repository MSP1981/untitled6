package com.company;

public enum Metal {
    GOLD ("Золото"),
    SILVER ("Серебро"),
    ALUMINUM ("Алюминий"),
    PLASTIC ("Пластик");

    private String value;
    Metal(String value){
        this.value = value;
    }
    public String getValue() {
        return value;
    }
}
