package com.ricky.springbootmall.service;

import com.ricky.springbootmall.dto.ProductRequest;
import com.ricky.springbootmall.model.Product;

public interface ProductService {

    Product getProductById(Integer productId);

    Integer createProduct(ProductRequest productRequest);
}
