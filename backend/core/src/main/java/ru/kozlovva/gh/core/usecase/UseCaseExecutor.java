package ru.kozlovva.gh.core.usecase;

import java.util.function.Function;

public interface UseCaseExecutor {

    /**
     * UseCase executor with result
     *
     * @param useCase       - use case
     * @param input         - входящие данные
     * @param outputMapper  - мапер, преобхазующий исходящие данные use case в модель результата
     * @param <ResultModel> - конечные данные. Например, данные, аозвращаемые по RestAPI
     * @param <Input>       - входящие данные use case
     * @param <Output>      - исходящие данные use case
     * @return
     */
    <ResultModel, Input, Output> ResultModel execute(
            UseCase<Input, Output> useCase,
            Input input,
            Function<Output, ResultModel> outputMapper
    );

    /**
     * UseCase executor without result
     *
     * @param useCase
     * @param input
     * @param <Input>
     * @param <Output>
     */
    <Input, Output> Output execute(
            UseCase<Input, Output> useCase,
            Input input
    );

}
