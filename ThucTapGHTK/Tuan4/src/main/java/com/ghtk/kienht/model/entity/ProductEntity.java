package com.ghtk.kienht.model.entity;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "product")
public class ProductEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "name", nullable = false)
    // @NotNull(message = "Name cannot be null")
    private String name;

    // @Min(value = 0, message = "price should not be less than 18")
    private Long price;
    private String sku;
    private String code;
    private String status;
    private String description;
    private Date created_at;
    private Date modified_at;
    @OneToOne // Đánh dấu có mỗi quan hệ 1-1 với category entity
    @JoinColumn(name = "category_id") // Liên kết với nhau qua khóa ngoại category_id
    private CategoryEntity category_id;
    public boolean isPresent() {
        return false;
    }
    
}
