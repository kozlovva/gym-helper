package ru.kozlovva.gh.domain.person.usecase;

import lombok.RequiredArgsConstructor;
import lombok.Value;
import ru.kozlovva.gh.core.usecase.UseCase;
import ru.kozlovva.gh.domain.person.Person;
import ru.kozlovva.gh.domain.person.port.PersonIdGenerator;
import ru.kozlovva.gh.domain.person.port.PersonRepository;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;

@RequiredArgsConstructor
public class CreatePerson implements UseCase<CreatePerson.CreatePersonCommand, Person> {

    private final PersonIdGenerator<?> personIdGenerator;
    private final PersonRepository personRepository;

    @Override
    public Person execute(CreatePersonCommand i) {
        var person = new Person(personIdGenerator.generate(), i.getName(), i.getAge(), i.getHeight());
        personRepository.save(person);
        return person;
    }

    @Value(staticConstructor = "of")
    public static class CreatePersonCommand {
        String name;
        int age;

        @Min(1)
        @Max(300)
        @NotNull(message = "Please, indicate your height")
        Double height;
    }

}
