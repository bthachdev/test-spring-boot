package com.example.cfs.repositories;

import org.springframework.data.repository.CrudRepository;
import com.example.cfs.models.CFSEvent;
import java.util.UUID;
import java.time.LocalDateTime;
import java.util.List;

public interface CFSEventRepository extends CrudRepository<CFSEvent, UUID> {
    List<CFSEvent> findByEventTimeBetweenOrderByEventTimeDesc(LocalDateTime startDate, LocalDateTime endDate);
}