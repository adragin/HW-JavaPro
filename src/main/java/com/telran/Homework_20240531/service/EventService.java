package com.telran.Homework_20240531.service;

import java.util.List;
import java.util.UUID;
import com.telran.Homework_20240531.repository.Event;
import com.telran.Homework_20240531.repository.EventsRepository;

public class EventService {
    private EventsRepository eventsRepository;

    public EventService(EventsRepository eventsRepository) {
        this.eventsRepository = eventsRepository;
    }

    public void createEvent(Event event) {
        eventsRepository.createEvent(event);
    }

    public Event getEventById(UUID id) {
        return eventsRepository.getEventById(id);
    }

    public List<Event> getAllEvents() {
        return eventsRepository.getAllEvents();
    }

    public List<Event> findEventsByCriteria(String criteria) {
        return eventsRepository.findEventsByCriteria(criteria);
    }

    public void updateEvent(Event event) {
        eventsRepository.updateEvent(event);
    }

    public void deleteEvent(UUID id) {
        eventsRepository.deleteEvent(id);
    }
}
