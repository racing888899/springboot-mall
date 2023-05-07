package com.ricky.springbootmall.dao;

import com.ricky.springbootmall.model.Product;

public interface ProudctDao {

    Product getProductById(Integer productId);
}
