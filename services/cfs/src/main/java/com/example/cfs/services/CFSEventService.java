package com.example.cfs.services;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.cfs.models.CFSEvent;
import java.time.LocalDateTime;
import java.util.List;

import com.example.cfs.repositories.CFSEventRepository;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.UUID;

@Service
public class CFSEventService {
    @Autowired
    private CFSEventRepository cfsEventRepository;

    public List<CFSEvent> searchCFSByTimeRange(LocalDateTime startDate, LocalDateTime endDate) {
        return cfsEventRepository.findByEventTimeBetweenOrderByEventTimeDesc(startDate, endDate);
    }

    public void saveCFS(CFSEvent cfsEvent) {
        cfsEventRepository.save(cfsEvent);
    }
}
