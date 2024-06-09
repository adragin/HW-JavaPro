package com.telran.Homework_20240531.repository;

import com.telran.Homework_20240531.logger.ConsoleLogger;
import com.telran.Homework_20240531.logger.Logger;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.UUID;

public class Event {
    UUID id;
    String title;
    LocalDateTime date;
    String description;
    String eventTypeCategory;
    boolean isCancelled;
    Host host;
    Logger logger = new ConsoleLogger();

    public Event(UUID id, String title, LocalDateTime date, String description, String eventTypeCategory, boolean isCancelled, Host host) {
        this.id = id;
        this.title = title;
        this.date = date;
        this.description = description;
        this.eventTypeCategory = eventTypeCategory;
        this.isCancelled = isCancelled;
        this.host = host;
        logger.info("Created new event.");
    }

    public UUID getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public LocalDateTime getDate() {
        return date;
    }

    public String getDescription() {
        return description;
    }

    public String getEventTypeCategory() {
        return eventTypeCategory;
    }

    public boolean isCancelled() {
        return isCancelled;
    }

    public Host getHost() {
        return host;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setDate(LocalDateTime date) {
        this.date = date;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setEventTypeCategory(String eventTypeCategory) {
        this.eventTypeCategory = eventTypeCategory;
    }

    public void setCancelled(boolean cancelled) {
        isCancelled = cancelled;
    }

    public void setHost(Host host) {
        this.host = host;
    }

    @Override
    public String toString() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd.MM.yyyy HH:mm");
        return "Event: \n" +
               "    id: " + id + '\n' +
               "    title: " + title + '\n' +
               "    date: " + date.format(formatter) + '\n' +
               "    description: " + description + '\n' +
               "    category: " + eventTypeCategory + '\n' +
               "    cancelled: " + (isCancelled ? "yes" : "no") + '\n' +
               "    event organizer: " + host;
    }
}
