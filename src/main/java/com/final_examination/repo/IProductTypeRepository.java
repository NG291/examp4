package com.final_examination.repo;

import com.final_examination.model.ProductType;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;



@Repository
public interface IProductTypeRepository extends JpaRepository<ProductType, Long> {
}