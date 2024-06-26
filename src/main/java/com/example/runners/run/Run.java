package com.example.runners.run;

import java.time.LocalDateTime;

public record Run(
    Integer id,
    String title,
    LocalDateTime startdate,
    LocalDateTime completdate,
    Integer miles,
    Location location) {

    // Compact canonical constructor for validation
    public Run {
        if (id < 0 || miles < 0) {
            throw new IllegalArgumentException("ID and miles cannot be negative");
        }
    }

    // Additional constructor if needed
    public Run(int id, String title, LocalDateTime startdate, LocalDateTime completdate, int miles, Location location) {
        this(Integer.valueOf(id), title, startdate, completdate, Integer.valueOf(miles), location);
    }
}
