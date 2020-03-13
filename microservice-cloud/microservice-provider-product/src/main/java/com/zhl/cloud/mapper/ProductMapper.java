package com.zhl.cloud.mapper;

import com.zhl.cloud.entities.Product;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;


@Mapper //或在主启动类上使用@MapperScan注解
public interface ProductMapper {
    Product findById(Long pid);
    List<Product> findAll();
    boolean addProduct(Product product);
}
