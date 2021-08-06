package io.github.rogerion.publisher.repository;

import io.github.rogerion.publisher.entity.Publisher;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PublisherRepository extends JpaRepository<Publisher,Long> {
}
