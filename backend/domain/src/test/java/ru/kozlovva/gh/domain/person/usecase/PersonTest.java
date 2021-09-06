package ru.kozlovva.gh.domain.person.usecase;

import org.mockito.Mockito;
import ru.kozlovva.gh.domain.BusinessLogicTest;
import ru.kozlovva.gh.domain.person.Person;
import ru.kozlovva.gh.domain.person.port.PersonIdGenerator;
import ru.kozlovva.gh.domain.person.port.PersonRepository;

import java.util.UUID;

import static org.mockito.ArgumentMatchers.any;

public class PersonTest extends BusinessLogicTest {

    protected final PersonIdGenerator<?> personIdGenerator;
    protected final PersonRepository personRepository;

    public PersonTest() {
        personIdGenerator = Mockito.mock(PersonIdGenerator.class);
        personRepository = Mockito.mock(PersonRepository.class);

        Mockito.when(personIdGenerator.generate())
                .thenReturn(UUID.randomUUID().toString());

        Mockito.when(personRepository.save(any(Person.class)))
                .thenAnswer(a -> a.getArgument(0));
    }
}
