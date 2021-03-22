package com.example.agency.controllers;

import com.example.agency.models.Agency;
import com.example.agency.services.AgencyService;
import java.time.LocalDateTime;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.format.annotation.DateTimeFormat;
import java.util.List;

@RestController
@RequestMapping(value="v1/agencies")
public class AgencyController {
    @Autowired
    private AgencyService agencyService;

    /**
     * Add a new Agency.
     */
    @RequestMapping(value = "/", method = RequestMethod.POST)
    public void saveAgency(@RequestBody Agency agency) {
        agencyService.saveAgency(agency);
    }
}
