package com.example.agency.services;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.time.LocalDateTime;
import java.util.List;

import com.example.agency.models.Agency;
import com.example.agency.repositories.AgencyRepository;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.UUID;
import java.util.Optional;
import org.springframework.http.ResponseEntity;
import org.springframework.http.HttpStatus;
import org.aspectj.bridge.MessageUtil;

@Service
public class AgencyService {
    @Autowired
    private AgencyRepository agencyRepository;

    public void saveAgency(Agency agency) {
        agencyRepository.save(agency);
    }

    public Optional<Agency> getAgency(UUID agencyID) {
        return agencyRepository.findById(agencyID);
    }
}
