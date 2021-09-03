package ru.kozlovva.gh.core.port;

public interface BaseIdGenerator<T> {
    String generate();
    T parse(String id);
}
