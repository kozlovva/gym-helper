package ru.kozlovva.gh.domain.person.usecase;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Value;
import ru.kozlovva.gh.core.usecase.UseCase;
import ru.kozlovva.gh.domain.person.Person;
import ru.kozlovva.gh.domain.person.exception.PersonNotFoundException;
import ru.kozlovva.gh.domain.person.port.PersonRepository;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;

@RequiredArgsConstructor
public class UpdatePerson implements UseCase<UpdatePerson.UpdatePersonCommand, Person> {

    private final PersonRepository repository;

    @Override
    public Person execute(UpdatePerson.UpdatePersonCommand command) {
        Person person = repository.findById(command.id)
                .orElseThrow(PersonNotFoundException::new);
        person.setName(command.getName());
        person.setAge(command.getAge());
        person.setHeight(command.getHeight());
        repository.save(person);
        return person;
    }

    @Value(staticConstructor = "of")
    public static class UpdatePersonCommand {
        @NotNull(message = "ID not provided")
        String id;
        String name;
        int age;

        @Min(1)
        @Max(300)
        @NotNull(message = "Please, indicate your height")
        Double height;
    }

}
