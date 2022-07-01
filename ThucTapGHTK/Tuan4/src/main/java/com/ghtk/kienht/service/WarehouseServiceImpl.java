package com.ghtk.kienht.service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import com.ghtk.kienht.model.Dto.WarehouseDto;
import com.ghtk.kienht.model.entity.DistrictEntity;
import com.ghtk.kienht.model.entity.ProvinceEntity;
import com.ghtk.kienht.model.entity.WarehouseEntity;
import com.ghtk.kienht.model.respone.WarehouseRespone;
import com.ghtk.kienht.repository.DistrictRepository;
import com.ghtk.kienht.repository.ProvinceRepository;
import com.ghtk.kienht.repository.WarehouseRepository;

@Service
public class WarehouseServiceImpl implements WarehouseService {
    @Autowired
    private ModelMapper modelMapper;

    @Autowired
    private WarehouseRepository warehouseRepository;

    @Autowired
    private ProvinceRepository provinceRepository;

    @Autowired
    private DistrictRepository districtRepository;

    private DistrictEntity districtEntity;

    private ProvinceEntity provinceEntity;

    @Override
    public ResponseEntity get() {
        List<WarehouseEntity> warehouseEntity = warehouseRepository.findAll();
        if (warehouseEntity.isEmpty() == false) {
            return ResponseEntity.status(HttpStatus.OK).body(
                    new WarehouseRespone("oke", "successful delete", warehouseEntity.stream()
                            .map(p -> modelMapper.map(p, WarehouseDto.class)).collect(Collectors.toList())));
        } else {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body(
                    new WarehouseRespone("False", "Cannot find Warehouse ", ""));
        }
    }

    @Override
    public ResponseEntity<WarehouseRespone> create(@RequestBody WarehouseDto newWarehouse) {
        // TODO Auto-generated method stub
        Optional<ProvinceEntity> optionalProvinceEntity = provinceRepository.findById(newWarehouse.getProvinceId());
        if (optionalProvinceEntity.isPresent() == false) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body(
                    new WarehouseRespone("False", "data province not found", ""));
        }
        Optional<DistrictEntity> optionalDistrictEntity = districtRepository.findById(newWarehouse.getDistrictId());
        if (optionalDistrictEntity.isPresent() == false) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body(
                    new WarehouseRespone("False", "data district not found", ""));
        }
        WarehouseEntity warehouseEntity = modelMapper.map(newWarehouse, WarehouseEntity.class);
        warehouseEntity.setAddress(warehouseEntity.getAddress() + ", " + optionalDistrictEntity.get().getName() + ", "
                + optionalProvinceEntity.get().getName());
        warehouseEntity.setStatus(1L);
        // String address = districtEntity.getName() + " " + provinceEntity.getName();
        // newWarehouse.setAddress(address);
        warehouseRepository.save(warehouseEntity);
        WarehouseDto warehouseRespone = modelMapper.map(warehouseEntity, WarehouseDto.class);
        return ResponseEntity.status(HttpStatus.OK).body(
                new WarehouseRespone("True", "Successful", warehouseRespone));
    }

    @Override
    public ResponseEntity<WarehouseRespone> put(WarehouseDto warehouse) {
        // TODO Auto-generated method stub
        Optional<ProvinceEntity> optionalProvinceEntity = provinceRepository.findById(warehouse.getProvinceId());
        if (optionalProvinceEntity.isPresent() == false) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body(
                    new WarehouseRespone("False", "data province not found", ""));
        }
        Optional<DistrictEntity> optionalDistrictEntity = districtRepository.findById(warehouse.getDistrictId());
        if (optionalDistrictEntity.isPresent() == false) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body(
                    new WarehouseRespone("False", "data district not found", ""));
        }
        WarehouseEntity warehouseEntity = modelMapper.map(warehouse, WarehouseEntity.class);
        warehouseEntity.setAddress(warehouseEntity.getAddress() + ", " + optionalDistrictEntity.get().getName() + ", "
                + optionalProvinceEntity.get().getName());
        // String address = districtEntity.getName() + " " + provinceEntity.getName();
        // newWarehouse.setAddress(address);
        warehouseRepository.save(warehouseEntity);
        WarehouseDto warehouseRespone = modelMapper.map(warehouseEntity, WarehouseDto.class);
        return ResponseEntity.status(HttpStatus.OK).body(
                new WarehouseRespone("True", "Successful", warehouseRespone));
    }

    @Override
    public ResponseEntity<WarehouseRespone> deleteById(Long id) {
        // TODO Auto-generated method stub
        WarehouseEntity warehouseEntity = new WarehouseEntity();
        Optional<WarehouseEntity> warehouseEnties = warehouseRepository.findById(id);
        if (warehouseEnties.isPresent()) {
            warehouseRepository.deleteById(id);
            warehouseEntity.setStatus(0L);
            ;
            return ResponseEntity.status(HttpStatus.OK).body(
                    new WarehouseRespone("oke", "successful delete", ""));
        } else {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body(
                    new WarehouseRespone("False", "Cannot find product with id " + id, ""));
        }
    }

}
