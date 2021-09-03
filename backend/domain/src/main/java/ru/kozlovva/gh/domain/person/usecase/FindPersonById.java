package ru.kozlovva.gh.domain.person.usecase;

import lombok.RequiredArgsConstructor;
import ru.kozlovva.gh.core.usecase.UseCase;
import ru.kozlovva.gh.domain.person.Person;
import ru.kozlovva.gh.domain.person.exception.PersonNotFoundException;
import ru.kozlovva.gh.domain.person.port.PersonRepository;

@RequiredArgsConstructor
public class FindPersonById implements UseCase<String, Person> {

    private final PersonRepository repository;

    @Override
    public Person execute(String i) {
        return repository.findById(i)
                .orElseThrow(PersonNotFoundException::new);
    }
}
