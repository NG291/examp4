package com.final_examination.service;

import com.final_examination.model.Product;
import com.final_examination.model.ProductType;

import java.util.List;

public interface IProductService {
    List<Product> findAll();
}
