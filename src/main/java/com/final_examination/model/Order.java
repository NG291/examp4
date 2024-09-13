package com.final_examination.model;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table(name = "orders")
public class Order {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ma_don_hang")
    private Long id;

    //    @Transient
    @Column(name = "ngay_mua")
    private String purchaseDate;

    @Column(name = "so_luong")
    private Integer quantity;

    @ManyToOne
    @JoinColumn(name = "ma_sp")
    private Product product;
}
