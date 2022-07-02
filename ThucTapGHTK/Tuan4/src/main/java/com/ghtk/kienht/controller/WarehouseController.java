package com.ghtk.kienht.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ghtk.kienht.model.Dto.WarehouseDto;
import com.ghtk.kienht.model.entity.WarehouseEntity;
import com.ghtk.kienht.service.WarehouseService;
import com.ghtk.kienht.service.WarehouseServiceImpl;

@RestController
@RequestMapping("/api/v1.0/warehouse")
public class WarehouseController {
    @Autowired
    WarehouseServiceImpl warehouseServiceImpl;
    
    @GetMapping("")
    public ResponseEntity get() {
        return ResponseEntity.ok(warehouseServiceImpl.get());
    }

    @PostMapping("")
    public ResponseEntity create(
            @RequestBody WarehouseDto warehouseEntities) {
        return ResponseEntity.ok(warehouseServiceImpl.create(warehouseEntities));
    }

    @PutMapping("")
    public ResponseEntity put(@RequestBody WarehouseDto warehouseEntities){
        return ResponseEntity.ok(warehouseServiceImpl.put(warehouseEntities));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity delete(
            @PathVariable Long id) {
        return ResponseEntity.ok(warehouseServiceImpl.deleteById(id));
    }
}
