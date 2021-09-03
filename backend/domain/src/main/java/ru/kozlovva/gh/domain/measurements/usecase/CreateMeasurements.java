package ru.kozlovva.gh.domain.measurements.usecase;

import lombok.RequiredArgsConstructor;
import lombok.Value;
import ru.kozlovva.gh.core.usecase.UseCase;
import ru.kozlovva.gh.domain.measurements.Measurements;
import ru.kozlovva.gh.domain.measurements.port.MeasurementsIdGenerator;
import ru.kozlovva.gh.domain.measurements.port.MeasurementsRepository;
import ru.kozlovva.gh.domain.person.usecase.FindPersonById;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Positive;
import java.time.LocalDateTime;

@RequiredArgsConstructor
public class CreateMeasurements implements UseCase<CreateMeasurements.CreateMeasurementsRequest, Measurements> {

    private final MeasurementsRepository repository;
    private final MeasurementsIdGenerator<?> idGenerator;
    private final FindPersonById findPersonById;

    @Override
    public Measurements execute(CreateMeasurementsRequest i) {
        var person = findPersonById.execute(i.getUserId());
        var measurements = new Measurements(
                idGenerator.generate(),
                person.getId(),
                i.getWeight(),
                i.getFatPercent(),
                i.getMusclePercent(),
                i.getDate()
        );
        repository.save(measurements);
        return measurements;
    }

    @Value(staticConstructor = "of")
    public static class CreateMeasurementsRequest {

        @NotNull(message = "User id not provided")
        String userId;

        @NotNull
        @Positive
        Double weight;
        int fatPercent;
        int musclePercent;
        LocalDateTime date;
    }

}
