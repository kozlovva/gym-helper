package ru.kozlovva.gh.domain.person;

import lombok.*;
import ru.kozlovva.gh.core.entity.Entity;

/**
 * Basic person information
 */
@Getter
@Setter
@ToString
@EqualsAndHashCode(callSuper = true)
public class Person extends Entity<String> {

    private String name;
    private int age;
    private Double height;

    public Person(String id, String name, int age, Double height) {
        super(id);
        this.name = name;
        this.age = age;
        this.height = height;
    }
}
