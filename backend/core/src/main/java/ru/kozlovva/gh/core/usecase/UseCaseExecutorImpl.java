package ru.kozlovva.gh.core.usecase;

import ru.kozlovva.gh.core.exception.InvalidInputValuesException;

import javax.validation.Validation;
import javax.validation.Validator;
import java.util.function.Function;

public class UseCaseExecutorImpl implements UseCaseExecutor {

    private final Validator validator;

    public UseCaseExecutorImpl(Validator validator) {
        this.validator = validator;
    }

    public UseCaseExecutorImpl() {
        var factory = Validation.buildDefaultValidatorFactory();
        validator = factory.getValidator();
        factory.close();
    }

    @Override
    public <ResultModel, Input, Output> ResultModel execute(UseCase<Input, Output> useCase, Input input, Function<Output, ResultModel> outputMapper) {
        validate(input);
        return outputMapper.apply(useCase.execute(input));
    }

    @Override
    public <Input, Output> Output execute(UseCase<Input, Output> useCase, Input input) {
        validate(input);
        return useCase.execute(input);
    }

    private <I> void validate(I i) {
        var s = validator.validate(i);
        if (!s.isEmpty())
            throw new InvalidInputValuesException(s);
    }
}
