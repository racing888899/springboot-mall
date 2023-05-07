package com.ricky.springbootmall.service.impl;

import com.ricky.springbootmall.dao.ProudctDao;
import com.ricky.springbootmall.dto.ProductRequest;
import com.ricky.springbootmall.model.Product;
import com.ricky.springbootmall.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ProductServiceImpl implements ProductService {

    @Autowired
    private ProudctDao proudctDao;

    @Override
    public Product getProductById(Integer productId) {
        return proudctDao.getProductById(productId);
    }

    @Override
    public Integer createProduct(ProductRequest productRequest) {
        return proudctDao.createProduct(productRequest);
    }

    @Override
    public void updateProduct(Integer productId, ProductRequest productRequest) {
        proudctDao.updateProduct(productId, productRequest);
    }

    @Override
    public void deleteProductById(Integer productId) {
        proudctDao.deleteProductById(productId);
    }
}
