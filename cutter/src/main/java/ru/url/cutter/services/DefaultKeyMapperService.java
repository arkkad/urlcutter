package ru.url.cutter.services;

import org.springframework.beans.factory.annotation.Autowired;
import ru.url.cutter.model.Link;
import ru.url.cutter.model.repositories.LinkRepo;

import java.util.Optional;

public class DefaultKeyMapperService implements KeyMapperService {

    @Autowired
    private LinkRepo linkRepo;

    @Override
    public Optional<Link> getLink(String key) {
        return linkRepo.findById(Long.valueOf(key));
    }

    @Override
    public void add(String link) {
        linkRepo.save(new Link(link));

    }
}
