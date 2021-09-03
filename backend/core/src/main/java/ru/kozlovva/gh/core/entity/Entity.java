package ru.kozlovva.gh.core.entity;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.time.LocalDateTime;

@AllArgsConstructor
@Data
public class Entity<ID> {
    protected ID id;
    protected LocalDateTime createdAt;
    protected LocalDateTime updatedAt;

    public Entity(ID id) {
        this.id = id;
        this.createdAt = LocalDateTime.now();
        this.updatedAt = LocalDateTime.now();
    }




}
