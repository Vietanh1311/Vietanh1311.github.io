package com.ghtk.kienht.service;

import java.sql.Date;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import com.ghtk.kienht.model.Dto.ProductDto;
import com.ghtk.kienht.model.entity.CategoryEntity;
import com.ghtk.kienht.model.entity.ProductEntity;
import com.ghtk.kienht.model.respone.ProductRespone;
import com.ghtk.kienht.repository.CategoryRepository;
import com.ghtk.kienht.repository.ProductRepository;

@Service
public class ProductServiceImpl implements ProductService {

    @Autowired
    private ModelMapper modelMapper;
    @Autowired
    private ProductRepository productRepository;
    @Autowired
    private CategoryRepository categoryRepository;

    private CategoryEntity categoryEntity;

    @Override
    public ResponseEntity<ProductRespone> get() {
        // TODO Auto-generated method stub
        List<ProductEntity> productEntity = productRepository.findAll();
        if (productEntity.isEmpty() == false) {
            return ResponseEntity.status(HttpStatus.OK).body(
                    new ProductRespone("oke", "successful delete", productEntity.stream()
                            .map(p -> modelMapper.map(p, ProductDto.class)).collect(Collectors.toList())));
        } else {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body(
                    new ProductRespone("False", "Cannot find product ", ""));
        }

    }

    @Override
    public ResponseEntity<ProductRespone> create(@RequestBody ProductEntity productEntities) {
        // TODO Auto-generated method stub
        if (productEntities.getPrice() <= 0) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body(
                    new ProductRespone("False", "Price should not be less than 0", ""));
        } else if (productEntities.getName() == null) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body(
                    new ProductRespone("False", "Name cannot be empty", ""));
        } else if (productEntities.getName().length() > 100) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body(
                    new ProductRespone("False", "name length should not be more than 100", ""));
        }
        productEntities.setStatus("1");
        Date created_at = new Date(System.currentTimeMillis());
        productEntities.setCreated_at(created_at);
        String code = categoryEntity.getId() + productEntities.getSku() + created_at;
        productEntities.setCode(code);
        productRepository.save(productEntities);
        return ResponseEntity.status(HttpStatus.OK).body(
                new ProductRespone("True", "Successful", productEntities));
    }

    @Override
    public ResponseEntity<ProductRespone> getById(Long id) {
        // TODO Auto-generated method stub
        Optional<ProductEntity> productEntity = productRepository.findById(id);

        // convert to Dto
        ProductDto productRespone = modelMapper.map(productEntity.get(), ProductDto.class);
        if (productEntity.isPresent()) {
            return ResponseEntity.status(HttpStatus.OK).body(
                    new ProductRespone("oke", "success", productRespone));
        } else {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body(
                    new ProductRespone("False", "Cannot find product with id " + id, ""));
        }
    }

    @Override
    public ResponseEntity<ProductRespone> put(@RequestBody ProductEntity productEntities) {
        // TODO Auto-generated method stub
        if (productEntities.getPrice() <= 0) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body(
                    new ProductRespone("False", "Price should not be less than 0", ""));
        } else if (productEntities.getName() == null) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body(
                    new ProductRespone("False", "Name cannot be empty", ""));
        } else if (productEntities.getName().length() > 100) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body(
                    new ProductRespone("False", "name length should not be more than 100", ""));
        }
        productEntities.setStatus("0");
        Date modified_at = new Date(System.currentTimeMillis());
        productEntities.setModified_at(modified_at);
        ;
        productRepository.save(productEntities);
        return ResponseEntity.status(HttpStatus.OK).body(
                new ProductRespone("True", "Successful", productEntities));
    }

    @Override
    public ResponseEntity<ProductRespone> deleteById(Long id) {
        // TODO Auto-generated method stub
        ProductEntity productEntities = new ProductEntity();
        Optional<ProductEntity> productEntity = productRepository.findById(id);
        if (productEntity.isPresent()) {
            productRepository.deleteById(id);
            productEntities.setStatus("0");
            return ResponseEntity.status(HttpStatus.OK).body(
                    new ProductRespone("oke", "successful delete", ""));
        } else {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body(
                    new ProductRespone("False", "Cannot find product with id " + id, ""));
        }

    }

    @Override
    public ResponseEntity<ProductRespone> getbyprice() {
        List<ProductEntity> productEntity = productRepository.findbyprice();

        if (productEntity.isEmpty() == false) {
            return ResponseEntity.status(HttpStatus.OK).body(
                    new ProductRespone("oke", "successful delete", productEntity.stream()
                            .map(p -> modelMapper.map(p, ProductDto.class)).collect(Collectors.toList())));
        } else {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body(
                    new ProductRespone("False", "Cannot find product ", ""));
        }

    }

}
