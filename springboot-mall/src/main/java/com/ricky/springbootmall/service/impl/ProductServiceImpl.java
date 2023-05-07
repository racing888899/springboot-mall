package com.ricky.springbootmall.service.impl;

import com.ricky.springbootmall.dao.ProudctDao;
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
}
