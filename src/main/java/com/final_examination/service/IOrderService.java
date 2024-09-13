package com.final_examination.service;

import com.final_examination.model.Order;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.time.LocalDate;
import java.util.List;

public interface IOrderService {
    Page<Order> findAll(Pageable pageable);

    Order findById(Long id);

    Order updateOrder(Long orderId, Order order);

    void save(Order order);
}
