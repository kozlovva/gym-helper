package ru.kozlovva.gh.domain.measurements.port;

import ru.kozlovva.gh.core.port.CRUDRepository;
import ru.kozlovva.gh.domain.measurements.Measurements;

public interface MeasurementsRepository extends CRUDRepository<String, Measurements, MeasurementsFilters> {
}
