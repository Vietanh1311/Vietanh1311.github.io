package com.ghtk.kienht.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.ghtk.kienht.model.entity.ProductEntity;

import java.util.List;
import java.util.Optional;

@Repository
public interface ProductRepository extends JpaRepository<ProductEntity, Long> {
    @Query(value = "SELECT * FROM product u WHERE u.price > 50000 AND u.name LIKE '%ao%' ORDER BY u.price desc ", nativeQuery = true)
    List<ProductEntity> findbyprice();
    
}
