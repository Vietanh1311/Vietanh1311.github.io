package com.ghtk.kienht.model.Dto;

import lombok.Data;

@Data
public class WarehouseDto {
    private Long id;
    private String name;
    private String address;
    private Long provinceId;
    private Long districtId;
}
