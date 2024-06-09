package com.telran.Homework_20240531.repository;

import com.telran.Homework_20240531.logger.ConsoleLogger;
import com.telran.Homework_20240531.logger.Logger;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class MyRepository implements EventsRepository {
    private List<Event> events = new ArrayList<>();
    Logger logger = new ConsoleLogger();

    @Override
    public void createEvent(Event event) {
        events.add(event);
        logger.info("New event added to repository.");
    }

    @Override
    public Event getEventById(UUID id) {
        logger.info("Search event with id " + id);
        for (Event e : events) {
            if (e.getId().equals(id)) {
                return e;
            }
        }
        return null;
    }

    @Override
    public List<Event> getAllEvents() {
        logger.info("Request to display all events: ");
        return new ArrayList<>(events);
    }

    @Override
    public List<Event> findEventsByCriteria(String criteria) {
        logger.info("Search Events by \'" + criteria + "\': ");
        List<Event> findedEvents = new ArrayList<>();
        for (Event e : events) {
            if (e.getTitle().contains(criteria) ||
                    e.getEventTypeCategory().contains(criteria) ||
                    e.getDescription().contains(criteria)) {
                findedEvents.add(e);
            }
        }
        return findedEvents;
    }

    @Override
    public void updateEvent(Event event) {
        logger.info("Update event " + event.getId() + ".");
        for (int i = 0; i < events.size(); i++) {
            if (events.get(i).getId().equals(event.getId())) {
                events.set(i, event);
                logger.info("Event " + event.getId() + " updated.");
                return;
            }
        }
        logger.info("Event " + event.getId() + "is missing.");
    }

    @Override
    public void deleteEvent(UUID id) {
        logger.info("Delete event " + id + ".");
        for (int i = 0; i < events.size(); i++) {
            if (events.get(i).getId().equals(id)) {
                events.remove(i);
                logger.info("Event " + id + " deleted.");
                return;
            }
        }
        logger.info("Event " + id + " is missing.");
    }
}
