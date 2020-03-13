package com.zhl.cloud.service;

import com.zhl.cloud.entities.Product;

import java.util.List;

public interface ProductService {
    boolean add(Product product);
    Product get(Long id);
    List<Product> list();
}
