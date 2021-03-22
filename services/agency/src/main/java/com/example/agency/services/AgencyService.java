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

@Service
public class AgencyService {
    @Autowired
    private AgencyRepository agencyRepository;

    public void saveAgency(Agency agency) {
        agencyRepository.save(agency);
    }
}
