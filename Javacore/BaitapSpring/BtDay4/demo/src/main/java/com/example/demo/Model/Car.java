package com.example.demo.Model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class Car {
    private Integer id;
    private String model;
    private String manufacturer;
    private int price;
    private int sales;
    private String photo;

}
