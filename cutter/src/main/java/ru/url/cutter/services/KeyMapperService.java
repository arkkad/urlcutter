package ru.url.cutter.services;

import ru.url.cutter.model.Link;

import java.util.Optional;

public interface KeyMapperService {
    Optional<Link> getLink(String key);
    void add(String link);

}
