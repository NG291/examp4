package com.final_examination.repo;

import com.final_examination.model.Order;
import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.stereotype.Repository;



@Repository
public interface IOrderRepository extends JpaRepository<Order, Long> {
}

