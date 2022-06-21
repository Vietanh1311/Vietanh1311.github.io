package com.ghtk.kienht.controller;

import com.ghtk.kienht.model.entity.CategoryEntity;
import com.ghtk.kienht.repository.CategoryRepository;
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

@RestController
@RequestMapping("/api/v1.0/category")
public class CategoryController {

  @Autowired
  private CategoryRepository categoryRepository;

  @GetMapping("")
  public ResponseEntity get(
      @RequestParam(value = "page") int page,
      @RequestParam(value = "page_size") int pageSize

  ) {
    // List<CategoryEntity> categoryEntities = categoryRepository.findAll();
    Page<CategoryEntity> categoryEntities = categoryRepository.findAll(PageRequest.of(page, pageSize));
    return ResponseEntity.ok(categoryEntities);
  }

  @PostMapping("")
  public ResponseEntity create(
      @RequestBody CategoryEntity categoryEntity) {
    return ResponseEntity.ok(categoryRepository.save(categoryEntity));
  }

  @PutMapping("")
  public ResponseEntity update(
      @RequestBody CategoryEntity categoryEntity) {
    return ResponseEntity.ok(categoryRepository.save(categoryEntity));
  }

  @DeleteMapping("/{id}")
  public ResponseEntity delete(
    @PathVariable Long id) {
    categoryRepository.deleteById(id);
    return ResponseEntity.ok("Day di ong chau");
  }

}
