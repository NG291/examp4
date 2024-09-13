package com.final_examination.controller;

import com.final_examination.model.Order;
import com.final_examination.model.Product;
import com.final_examination.model.ProductType;
import com.final_examination.service.IOrderService;
import com.final_examination.service.IProductService;
import com.final_examination.service.IProductTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.util.List;

@Controller
@RequestMapping("/orders")
public class ProductController {

    @Autowired
    private IOrderService orderService;

    @Autowired
    private IProductService productService;

    @Autowired
    private IProductTypeService productTypeService;

    @GetMapping
    public String findAll(@PageableDefault(value = 5) Pageable pageable, Model model){
        Page<Order> orders = orderService.findAll((org.springframework.data.domain.Pageable) pageable);
        model.addAttribute("orders", orders);
        return "orders/list";
    }
    @GetMapping("/update/{id}")
    public String showUpdateForm(@PathVariable("id") Long id, Model model) {
        Order order = orderService.findById(id);
        if (order != null) {
            model.addAttribute("order", order);
            return "orders/edit";
        } else {
            return "redirect:/orders";
        }
    }

    @PostMapping("/{id}")
    public String updateOrder(@PathVariable("id") Long id, @ModelAttribute Order order) {
        Order updatedOrder = orderService.updateOrder(id, order);
        if (updatedOrder != null) {
            return "redirect:/orders";
        } else {
            return "redirect:/orders";
        }
    }
}
