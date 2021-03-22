package com.example.user.repositories;

import org.springframework.data.repository.CrudRepository;
import com.example.user.models.User;
import java.util.UUID;
import java.time.LocalDateTime;
import java.util.List;

public interface UserRepository extends CrudRepository<User, UUID> {
}