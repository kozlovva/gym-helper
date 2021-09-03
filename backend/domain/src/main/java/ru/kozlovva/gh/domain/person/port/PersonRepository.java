package ru.kozlovva.gh.domain.person.port;

import ru.kozlovva.gh.core.port.CRUDRepository;
import ru.kozlovva.gh.core.port.dto.SearchFilters;
import ru.kozlovva.gh.domain.person.Person;

public interface PersonRepository extends CRUDRepository<String, Person, SearchFilters> {
}
