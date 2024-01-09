package com.booking.reserveNow.entity;

import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

import java.time.LocalDateTime;

@Entity
@Table(name = "time_table")
public class TimeTable {
    @EmbeddedId
    private TimeTableId id;
    private LocalDateTime depatureTimeAndDate;
    private LocalDateTime arrivalTimeAndDate;
    //todo: convert the data type to an enum (delayed, ontime, cancelled,...)
    private String status;
}
