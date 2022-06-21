package com.ghtk.kienht.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.ghtk.kienht.model.entity.ProductEntity;
import com.ghtk.kienht.repository.ProductRepository;

@RestController
@RequestMapping("/api/v1.0/product")
public class ProductController {

    @Autowired
    private ProductRepository productRepository;

    @GetMapping("")
    public ResponseEntity get(
    @RequestParam(value = "page") int page,
    @RequestParam(value = "page_size") int pageSize

    ) {
        // List<ProductEntity> productEntities = productRepository.findAll();
        Page<ProductEntity> productEntities =
        productRepository.findAll(PageRequest.of(page, pageSize));
        return ResponseEntity.ok(productEntities);
    }
    @GetMapping("/searchproduct")
    public ResponseEntity get(){
        List<ProductEntity> productEntities = productRepository.findbyprice();
        return ResponseEntity.ok(productEntities);
    }

    @PostMapping("")
    public ResponseEntity create(
            @RequestBody ProductEntity productEntities ) {
        return ResponseEntity.ok(productRepository.save(productEntities));
    }

    @PutMapping("")
    public ResponseEntity update(
            @RequestBody ProductEntity productEntities) {
        return ResponseEntity.ok(productRepository.save(productEntities));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity delete(
        @PathVariable Long id) {
        productRepository.deleteById(id);
        return ResponseEntity.ok("Day di ong chau");
    }

}
