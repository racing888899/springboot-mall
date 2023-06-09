package com.ricky.springbootmall.dao;

import com.ricky.springbootmall.dto.ProductQueryParams;
import com.ricky.springbootmall.dto.ProductRequest;
import com.ricky.springbootmall.model.Product;

import java.util.List;

public interface ProudctDao {

    Integer countProduct(ProductQueryParams productQueryParams);

    List<Product> getProducts(ProductQueryParams productQueryParams);

    Product getProductById(Integer productId);

    Integer createProduct(ProductRequest productRequest);

    void updateProduct(Integer productId, ProductRequest productRequest);

    void updateStock(Integer productId, Integer stock);

    void deleteProductById(Integer productId);
}
