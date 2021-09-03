package ru.kozlovva.gh.core.usecase;

public interface UseCase<Input, Output> {

    Output execute(Input i);

}
