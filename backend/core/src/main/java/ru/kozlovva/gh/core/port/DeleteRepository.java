package ru.kozlovva.gh.core.port;

public interface DeleteRepository<Id> {
    Boolean delete(Id id);
}
