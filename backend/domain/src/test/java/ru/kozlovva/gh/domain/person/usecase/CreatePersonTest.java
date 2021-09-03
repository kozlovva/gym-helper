package ru.kozlovva.gh.domain.person.usecase;

import org.junit.jupiter.api.Test;
import ru.kozlovva.gh.domain.BusinessLogicTest;

import static org.junit.jupiter.api.Assertions.*;

public class CreatePersonTest extends BusinessLogicTest {

    private final CreatePerson createPerson;

    public CreatePersonTest() {

        this.createPerson = new CreatePerson();
    }

    @Test
    void successfulCreationPersonTest() {
        var command = CreatePerson.CreatePersonCommand.of("Peter", 10, 150D);
        var person = useCaseExecutor.execute(createPerson, command);
        assertNotNull(person.getId(), "Id is null");
        assertEquals("Peter", person.getName(), "Invalid name");
    }

}