package com.final_examination.service;

import com.final_examination.model.ProductType;
import com.final_examination.repo.IProductTypeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductTypeService implements IProductTypeService {
    @Autowired
    private IProductTypeRepository iProductTypeRepository;

    @Override
    public List<ProductType> findAll() {
        return iProductTypeRepository.findAll();
    }
}