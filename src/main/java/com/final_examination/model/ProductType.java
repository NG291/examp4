package com.final_examination.model;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
public class ProductType {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ma_loai_sp")
    private Long id;

    @Column(name = "ten_loai_sp")
    private String name;
}
