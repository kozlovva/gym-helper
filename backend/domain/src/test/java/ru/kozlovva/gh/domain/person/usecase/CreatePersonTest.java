package ru.kozlovva.gh.domain.person.usecase;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class CreatePersonTest extends PersonTest {

    private final CreatePerson createPerson;

    public CreatePersonTest() {
        this.createPerson = new CreatePerson(personIdGenerator, personRepository);
    }

    @Test
    void successfulCreationPersonTest() {
        var command = CreatePerson.CreatePersonCommand.of("Peter", 10, 150D);
        var person = useCaseExecutor.execute(createPerson, command);
        assertNotNull(person.getId(), "Id is null");
        assertEquals("Peter", person.getName(), "Invalid name");
        assertEquals(10, person.getAge());
        assertEquals(150D, person.getHeight());
    }


}