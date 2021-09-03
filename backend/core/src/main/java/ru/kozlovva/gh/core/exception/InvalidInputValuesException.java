package ru.kozlovva.gh.core.exception;

import javax.validation.ConstraintViolation;
import java.util.Set;
import java.util.stream.Collectors;

public class InvalidInputValuesException extends BadRequestException {

    public <I> InvalidInputValuesException(Set<ConstraintViolation<I>> constraintViolations) {
        super(constraintViolations
                .stream()
                .map(ConstraintViolation::getMessage)
                .collect(Collectors.joining(".")));
    }
}
