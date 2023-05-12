package com.example.buensabor.Models.Enum;

public enum DeliveryMethod {
    DELIVERY("Delivery"),
    TAKE_AWAY("Take away");

    private String name;
    DeliveryMethod(String name) {
        this.name = name;
    }

    public String getName(){
        return name;
    }
}
