package com.final_examination.model;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "products")
@Data
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ma_sp")
    private Long id;

    @Column(name = "ten_sp")
    private String name;

    @Column(name = "gia_sp")
    private Double price;

    @Column(name = "tinh_trang_sp")
    private String auctionStatus;

    @ManyToOne
    @JoinColumn(name = "ma_loai_sp")
    private ProductType productType;
}

