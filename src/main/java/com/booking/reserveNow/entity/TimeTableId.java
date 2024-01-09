package com.booking.reserveNow.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;

import java.io.Serializable;

@Embeddable
public class TimeTableId implements Serializable {
    @Column(
            name = "route_id"
    )
    private Long routeId;
    @Column(
            name = "ship_id"
    )
    private Long shipId;
}
