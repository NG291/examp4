package com.final_examination.service;

import com.final_examination.model.Order;
import com.final_examination.repo.IOrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.time.LocalDate;
import java.util.List;

@Service
public class OrderService implements IOrderService{
    @Autowired
    private IOrderRepository orderRepository;

    @Override
    public Page<Order> findAll(Pageable pageable) {
        return orderRepository.findAll(pageable);
    }

    public Order findById(Long orderId) {
        return orderRepository.findById(orderId).orElse(null);
    }

    public void save (Order order) {
        orderRepository.save(order);
    }

    @Transactional
    @Override
    public Order updateOrder(Long orderId, Order orderDetails) {
        // Tìm đối tượng Order theo ID
        Order existingOrder = orderRepository.findById(orderId).orElse(null);

        if (existingOrder != null) {
            // Cập nhật các thuộc tính của đối tượng Order
            existingOrder.setPurchaseDate(orderDetails.getPurchaseDate());
            existingOrder.setQuantity(orderDetails.getQuantity());
            existingOrder.setProduct(orderDetails.getProduct());

            // Lưu đối tượng đã được cập nhật
            return orderRepository.save(existingOrder);
        } else {
            // Nếu Order không tồn tại, trả về null hoặc xử lý lỗi khác
            return null;
        }
    }


}
