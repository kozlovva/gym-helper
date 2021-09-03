package ru.kozlovva.gh.core.port;

import ru.kozlovva.gh.core.entity.Entity;

public interface CreateUpdateRepository<E extends Entity<?>> {
    E save(E entity);
}
