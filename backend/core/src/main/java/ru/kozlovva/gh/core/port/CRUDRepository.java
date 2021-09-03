package ru.kozlovva.gh.core.port;


import ru.kozlovva.gh.core.entity.Entity;
import ru.kozlovva.gh.core.port.dto.SearchFilters;

public interface CRUDRepository<Id, E extends Entity<?>, Filters extends SearchFilters>
        extends DeleteRepository<Id>, CreateUpdateRepository<E>, ReadRepository<Id, E, Filters> {

}
