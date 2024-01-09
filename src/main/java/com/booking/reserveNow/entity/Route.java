package com.booking.reserveNow.entity;

import jakarta.persistence.*;

@Entity(name = "Route")
@Table(name = "route")
public class Route {
    @Id
    @SequenceGenerator(
            name = "route_sequence",
            sequenceName = "route_sequence",
            allocationSize = 1
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "route_sequence"
    )
    @Column(
            name = "id"
    )
    private Long id;
    @Column(
            name = "startFrom",
            nullable = false
    )
    private String startFrom;
    @Column(
            name = "toWhere",
            nullable = false

    )
    private String toWhere;
}
