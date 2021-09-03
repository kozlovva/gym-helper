package ru.kozlovva.gh.domain;

import ru.kozlovva.gh.core.usecase.UseCaseExecutor;
import ru.kozlovva.gh.core.usecase.UseCaseExecutorImpl;

public abstract class BusinessLogicTest {

    protected final UseCaseExecutor useCaseExecutor = new UseCaseExecutorImpl();

}
