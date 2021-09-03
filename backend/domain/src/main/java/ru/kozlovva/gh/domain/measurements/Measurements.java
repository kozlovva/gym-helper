package ru.kozlovva.gh.domain.measurements;

import lombok.Getter;
import ru.kozlovva.gh.core.entity.Entity;

import java.time.LocalDateTime;

/**
 * Basic body measurements
 */
@Getter
public class Measurements extends Entity<String> {

    private String userId;
    private Double weight;
    private int fatPercent;
    private int musclePercent;
    private LocalDateTime date = LocalDateTime.now();

    public Measurements(String s, String userId, Double weight, int fatPercent, int musclePercent, LocalDateTime date) {
        super(s);
        this.userId = userId;
        this.weight = weight;
        this.fatPercent = fatPercent;
        this.musclePercent = musclePercent;
        if (date != null)
            this.date = date;
    }
}
