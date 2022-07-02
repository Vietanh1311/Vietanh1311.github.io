package com.ghtk.kienht.controller;

import java.util.List;
import java.util.Optional;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.http.HttpStatus;
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


import com.ghtk.kienht.model.Dto.ProductDto;
import com.ghtk.kienht.model.entity.ProductEntity;
import com.ghtk.kienht.model.respone.ProductRespone;
import com.ghtk.kienht.repository.ProductRepository;
import com.ghtk.kienht.service.ProductService;
import com.ghtk.kienht.service.ProductServiceImpl;

import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;

@RestController
@RequestMapping("/api/v1.0/product")
public class ProductController {

    @Autowired
    private ProductServiceImpl productServiceImpl;

    @ApiOperation(value = "Get list product", response = ProductDto.class, responseContainer = "List")
    @ApiResponses({
            @ApiResponse(code=500,message = "")
    })
    @GetMapping("")
    public ResponseEntity get() {
        return ResponseEntity.ok(productServiceImpl.get());
    }

    @GetMapping("/searchproduct")
    public ResponseEntity getbyprice() {
        return ResponseEntity.ok(productServiceImpl.getbyprice());
    }

    @GetMapping("/{id}")
    ResponseEntity FindByProductId(@PathVariable Long id) {
        return ResponseEntity.ok(productServiceImpl.getById(id));
    }

    @PostMapping("")
    public ResponseEntity create(
            @RequestBody ProductEntity productEntities) {
        return ResponseEntity.ok(productServiceImpl.create(productEntities));
    }

    @PutMapping("")
    public ResponseEntity update(
            @RequestBody ProductEntity productEntities) {
        return ResponseEntity.ok(productServiceImpl.put(productEntities));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity delete(
            @PathVariable Long id) {
        return ResponseEntity.ok(productServiceImpl.deleteById(id));
    }

    // @PostMapping("")
    // public ResponseEntity create(){
    // return ResponseEntity.ok(productService.create(null));
    // }

}
