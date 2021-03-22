package com.example.cfs.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.time.LocalDateTime;
import java.util.UUID;

@Entity
public class CFSEvent {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID id;

    private String eventNumber;
    private String eventTypeCode;
    private LocalDateTime eventTime;
    private LocalDateTime dispatchTime;

    public UUID getId() { return id; }
    public void setId(UUID id) { this.id = id; }

    public String getEventNumber() { return eventNumber; }
    public void setEventNumber(String eventNumber) { this.eventNumber = eventNumber; }

    public String getEventTypeCode() { return eventTypeCode; }
    public void setEventTypeCode(String eventTypeCode) { this.eventTypeCode = eventTypeCode; }

    public LocalDateTime getEventTime() { return eventTime; }
    public void setEventTime(LocalDateTime eventTime) { this.eventTime = eventTime; }

    public LocalDateTime getDispatchTime() { return dispatchTime; }
    public void setDispatchTime(LocalDateTime dispatchTime) { this.dispatchTime = dispatchTime; }
}