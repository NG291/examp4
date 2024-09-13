package com.final_examination.model.dto;

import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import lombok.Data;

@Data
public class ProductDTO {
    @NotBlank(message = "Tên không được để trống")
    private String name;
    @Min(value = 100, message = "Giá không được nhỏ hơn 100")
    private double price;
    private Double discount;
    @Min(value = 10, message = "stock không nhỏ hơn 10")
    private int stock;
}