package com.example.cfs.controllers;

import com.example.cfs.models.CFSEvent;
import com.example.cfs.services.CFSEventService;
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
@RequestMapping(value="v1/cfs-events")
public class CFSEventController {
    @Autowired
    private CFSEventService cfsEventService;

    /**
     * Search CFS Events by time range.
     */
    @RequestMapping(value = "/search", method = RequestMethod.GET)
    public List<CFSEvent> searchCFSEvents(@RequestParam("startdate")
                                          @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
                                          LocalDateTime startDate,
                                          @RequestParam("enddate")
                                          @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
                                          LocalDateTime endDate) {
        return cfsEventService.searchCFSByTimeRange(startDate, endDate);
    }



    /**
     * Add a new CFS Event.
     */
    @RequestMapping(value = "/", method = RequestMethod.POST)
    public void saveCFSEvent(@RequestBody CFSEvent cfsEvent) {
        cfsEventService.saveCFS(cfsEvent);
    }
}
