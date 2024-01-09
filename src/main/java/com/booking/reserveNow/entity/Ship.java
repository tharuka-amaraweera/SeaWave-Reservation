package com.booking.reserveNow.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "ship")
public class Ship {
    @Id
    @SequenceGenerator(
            name = "ship_sequence",
            sequenceName = "ship_sequence",
            allocationSize = 1
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "ship_sequence"
    )
    @Column(
            name = "id",
            updatable = false
    )
    private Long id;
    @Column(
            name = "name",
            nullable = false,
            unique = true
    )
    private String name;
    @Column(
            name = "capacity",
            nullable = false
    )
    private Long capacity;
    @Column(
            name = "pricePerAdult"
    )
    private Double pricePerAdult;
    @Column(
            name = "pricePerChildren"
    )
    private Double pricePerChildren;
    @Column(
            name = "pricePerStudent"
    )
    private Double pricePerStudent;
    @Column(
            name = "pricePerCat"
    )
    private Double pricePerCat;
    @Column(
            name = "pricePerDog"
    )
    private Double pricePerDog;

}
