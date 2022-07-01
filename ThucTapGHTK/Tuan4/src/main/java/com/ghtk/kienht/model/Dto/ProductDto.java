package com.ghtk.kienht.model.Dto;

import java.sql.Date;

import lombok.Data;

@Data

public class ProductDto {
    private Long id;
    private String name;
    private Long price;
    private String sku;
    private String status;
    private String description;
    
}
