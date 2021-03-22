package com.example.agency.repositories;

import org.springframework.data.repository.CrudRepository;
import com.example.agency.models.Agency;
import java.util.UUID;
import java.time.LocalDateTime;
import java.util.List;

public interface AgencyRepository extends CrudRepository<Agency, UUID> {
}