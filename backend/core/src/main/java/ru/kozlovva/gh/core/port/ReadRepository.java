package ru.kozlovva.gh.core.port;


import ru.kozlovva.gh.core.entity.Entity;
import ru.kozlovva.gh.core.port.dto.SearchFilters;
import ru.kozlovva.gh.core.port.dto.SearchResult;

import java.util.Optional;

public interface ReadRepository<Id, E extends Entity<?>, Filters extends SearchFilters> {
    Optional<E> findById(Id id);

    SearchResult<E> find(Filters filters);

    Long count();
}
