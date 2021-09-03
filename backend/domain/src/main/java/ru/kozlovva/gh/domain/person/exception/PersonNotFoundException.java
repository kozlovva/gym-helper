package ru.kozlovva.gh.domain.person.exception;

import ru.kozlovva.gh.core.exception.NotFoundException;

public class PersonNotFoundException extends NotFoundException {

    public PersonNotFoundException() {
        super("Person not found");
    }
}
