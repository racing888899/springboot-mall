package com.ricky.springbootmall.dao;

import com.ricky.springbootmall.dto.ProductRequest;
import com.ricky.springbootmall.model.Product;

public interface ProudctDao {

    Product getProductById(Integer productId);

    Integer createProduct(ProductRequest productRequest);

    void updateProduct(Integer productId, ProductRequest productRequest);
}
