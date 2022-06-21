package com.ghtk.kienht.model.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "product")
public class ProductEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String price;
    private String sku;
    private String status;
    private String description;
    @OneToOne // Đánh dấu có mỗi quan hệ 1-1 với category entity
    @JoinColumn(name = "category_id") // Liên kết với nhau qua khóa ngoại category_id
    private CategoryEntity category_id;
    
}
