package com.ghtk.kienht.service;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.ghtk.kienht.model.Dto.WarehouseDto;
import com.ghtk.kienht.model.entity.WarehouseEntity;
import com.ghtk.kienht.model.respone.WarehouseRespone;

@Service
public interface WarehouseService {
    ResponseEntity get();

    ResponseEntity create(WarehouseDto newWarehouse);

    ResponseEntity<WarehouseRespone> put(WarehouseDto warehouse);

    ResponseEntity<WarehouseRespone> deleteById(Long id);
}
