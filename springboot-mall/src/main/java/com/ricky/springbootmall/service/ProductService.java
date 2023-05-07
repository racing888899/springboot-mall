package com.ricky.springbootmall.service;

import com.ricky.springbootmall.constant.ProductCategory;
import com.ricky.springbootmall.dto.ProductRequest;
import com.ricky.springbootmall.model.Product;

import java.util.List;

public interface ProductService {

    List<Product> getProducts(ProductCategory category, String search);

    Product getProductById(Integer productId);

    Integer createProduct(ProductRequest productRequest);

    void updateProduct(Integer productId, ProductRequest productRequest);

    void deleteProductById(Integer productId);
}
