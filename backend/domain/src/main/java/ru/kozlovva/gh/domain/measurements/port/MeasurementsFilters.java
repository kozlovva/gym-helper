package ru.kozlovva.gh.domain.measurements.port;

import lombok.EqualsAndHashCode;
import lombok.Value;
import ru.kozlovva.gh.core.port.dto.SearchFilters;

import java.time.LocalDateTime;

@Value(staticConstructor = "of")
@EqualsAndHashCode(callSuper = true)
public class MeasurementsFilters extends SearchFilters {

    LocalDateTime dateFrom;
    LocalDateTime dateTo;
    String userId;
}
