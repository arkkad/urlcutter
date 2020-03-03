package ru.url.cutter.model.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.url.cutter.model.Link;

import java.util.Optional;

public interface LinkRepo extends JpaRepository<Link, Long> {
    Optional<Link> findById(Long id);
}
