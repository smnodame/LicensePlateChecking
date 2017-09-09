package com.example.boonprakit.cars;

import java.io.Serializable;

/**
 * Created by boonprakit on 8/9/2560.
 */

public class Car implements Serializable {
    String company;
    String brand;
    String color;
    String city;
    String charactor;
    String id;

    public Car(String company, String brand, String color, String city, String charactor, String id){
        this.company = company;
        this.brand = brand;
        this.color = color;
        this.city = city;
        this.charactor = charactor;
        this.id = id;
    }
}
