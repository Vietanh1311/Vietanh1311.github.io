package com.ghtk.kienht.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import com.ghtk.kienht.model.Dto.ProductDto;
import com.ghtk.kienht.model.entity.ProductEntity;
import com.ghtk.kienht.model.respone.ProductRespone;
import com.ghtk.kienht.repository.ProductRepository;

@Service
public interface ProductService {
    ResponseEntity<ProductRespone> get();

    ResponseEntity<ProductRespone> create(ProductEntity newProduct);

    ResponseEntity<ProductRespone> getById(Long id);

    ResponseEntity<ProductRespone> getbyprice();

    ResponseEntity<ProductRespone> put(ProductEntity product);

    ResponseEntity<ProductRespone> deleteById(Long id);

}
