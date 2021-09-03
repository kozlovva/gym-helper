package ru.kozlovva.gh.core.port.impl;

import ru.kozlovva.gh.core.port.BaseIdGenerator;

import java.util.UUID;

public class StringIdGenerator implements BaseIdGenerator<String> {

    @Override
    public String generate() {
        return UUID.randomUUID().toString();
    }

    @Override
    public String parse(String id) {
        return id;
    }
}
