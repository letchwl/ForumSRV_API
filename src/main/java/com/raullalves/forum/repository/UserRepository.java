package com.raullalves.forum.repository;

import com.raullalves.forum.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
