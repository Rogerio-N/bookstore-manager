package io.github.rogerion.users.repository;

import io.github.rogerion.users.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Long> {
}
