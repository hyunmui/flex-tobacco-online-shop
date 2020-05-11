package com.flexibledev.tobaccoshop.entities;

import lombok.Builder;
import lombok.Getter;

import javax.persistence.*;

@Getter
@Builder
@Entity
@Table(name = "products")
public class Product {

    @Id
    @Column
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column
    private String name;

    @Column
    private double price;

    @Column
    private int unitQuantity;

}
