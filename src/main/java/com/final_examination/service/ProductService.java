package com.final_examination.service;

import com.final_examination.model.Product;
import com.final_examination.repo.IProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService implements IProductService{
    @Autowired
    private IProductRepository productRepository;

    @Override
    public List<Product> findAll() {
        return productRepository.findAll();
    }

    public List<Product> findByProductTypeId(Long typeId) {
        return productRepository.findByProductTypeId(typeId);
    }
}
