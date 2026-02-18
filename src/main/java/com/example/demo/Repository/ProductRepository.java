package com.example.demo.Repository;

import com.example.demo.Model.Products;
import org.springframework.data.repository.CrudRepository;

public interface ProductRepository extends CrudRepository<Products, Integer> {
}
