package ru.kozlovva.gh.domain.measurements.usecase;

import lombok.RequiredArgsConstructor;
import ru.kozlovva.gh.core.port.dto.SearchResult;
import ru.kozlovva.gh.core.usecase.UseCase;
import ru.kozlovva.gh.domain.measurements.Measurements;
import ru.kozlovva.gh.domain.measurements.port.MeasurementsFilters;
import ru.kozlovva.gh.domain.measurements.port.MeasurementsRepository;

@RequiredArgsConstructor
public class FindMeasurements implements UseCase<MeasurementsFilters, SearchResult<Measurements>> {

    private final MeasurementsRepository repository;

    @Override
    public SearchResult<Measurements> execute(MeasurementsFilters i) {
        return repository.find(i);
    }
}
