package ru.kozlovva.gh.domain.person.usecase;

import org.mockito.Mockito;
import ru.kozlovva.gh.domain.BusinessLogicTest;
import ru.kozlovva.gh.domain.person.port.PersonIdGenerator;
import ru.kozlovva.gh.domain.person.port.PersonRepository;

public class PersonTest extends BusinessLogicTest {

    protected final PersonIdGenerator<?> personIdGenerator = Mockito.mock(PersonIdGenerator.class);
    protected final PersonRepository personRepository = Mockito.mock(PersonRepository.class);

}
