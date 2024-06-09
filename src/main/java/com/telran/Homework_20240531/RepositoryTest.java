package com.telran.Homework_20240531;

import com.telran.Homework_20240531.repository.*;
import com.telran.Homework_20240531.logger.*;
import com.telran.Homework_20240531.service.*;

import java.time.LocalDateTime;
import java.util.UUID;

public class RepositoryTest {
    public static void main(String[] args) {
        EventsRepository eventsRepository = new MyRepository();
        EventService eventService = new EventService(eventsRepository);
        Logger logger = new ConsoleLogger();

//        Host host = new Host(UUID.randomUUID(), "john.doe@example.com", "John Doe", "johndoe", "image.png");
        Host host = new Host("john.doeexample.com", "", null, null);

        Event event1 = new Event("Conference", LocalDateTime.now(), "Tech Conference", "Technology", false, host);
        Event event2 = new Event("Meeting", LocalDateTime.now().plusDays(1), "Business Meeting", "Business", false, host);


        eventService.createEvent(event1);

        eventService.createEvent(event2);

        UUID eventId = event1.getId();
        Event foundEvent = eventService.getEventById(eventId);
        System.out.println("Result of search: ");
        System.out.println("    Title: " + foundEvent.getTitle());
        System.out.println("    Host: " + foundEvent.getHost().getDisplayName());

        System.out.println("All Events:");
        eventService.getAllEvents().forEach(event -> System.out.println(event));

        eventService.findEventsByCriteria("Tech").forEach(event -> System.out.println(event));

        foundEvent.setCancelled(true);
        eventService.updateEvent(foundEvent);

        eventService.deleteEvent(eventId);

        System.out.println("All Events after deletion: ");
        eventService.getAllEvents().forEach(event -> System.out.println(event));
    }
}
