package com.telran.Homework_20240531.repository;

import java.util.List;
import java.util.UUID;

public interface EventsRepository {
    void createEvent(Event event);
    Event getEventById(UUID id);
    List<Event> getAllEvents();
    List<Event> findEventsByCriteria(String criteria);
    void updateEvent(Event event);
    void deleteEvent(UUID id);
}
