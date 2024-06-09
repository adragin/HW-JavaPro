package com.telran.Homework_20240531.repository;

import com.telran.Homework_20240531.logger.ConsoleLogger;
import com.telran.Homework_20240531.logger.Logger;

import java.util.UUID;

public class Host {
    private UUID id;
    private String email;
    private String displayName;
    private String username;
    private String image;
    private Logger logger = new ConsoleLogger();

    public Host(String email, String displayName, String username, String image) {
        StringBuilder errors = new StringBuilder("\n\tErrors by creating host:\n");
        int startLengthErrors = errors.length();

        this.id = UUID.randomUUID();

        if (!email.contains("@")) {
            errors.append("\t\t\'email\' must have symbol \'@\'");
        } else {
            this.email = email;
        }

        if (displayName == null || displayName.isEmpty()) {
            if (errors.length() != startLengthErrors) {
                errors.append(';');
            } else {
                errors.append(' ');
            }
            errors.append("\n\t\t\'displayName\' must not be \'null\' or empty");
        } else {
            this.displayName = displayName;
        }

        if (username == null || username.isEmpty()) {
            if (errors.length() != startLengthErrors) {
                errors.append(';');
            } else {
                errors.append(' ');
            }
            errors.append("\n\t\t\'username\' must not be \'null\' or empty");
        } else {
            this.username = username;
        }

        if (image == null) {
            if (errors.length() != startLengthErrors) {
                errors.append(';');
            } else {
                errors.append(' ');
            }
            errors.append("\n\t\t\'image\' must not be \'null\'");
        } else {
            this.image = image;
        }

        if (errors.length() == startLengthErrors) {
            logger.info("Created new host.");
        } else {
            logger.info("Host has not been created. Incorrect input data.");
            errors.append(".");
            throw new RuntimeException(errors.toString());
        }
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setDisplayName(String displayName) {
        this.displayName = displayName;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public UUID getId() {
        return id;
    }

    public String getEmail() {
        return email;
    }

    public String getDisplayName() {
        return displayName;
    }

    public String getUsername() {
        return username;
    }

    public String getImage() {
        return image;
    }

    @Override
    public String toString() {
        return displayName + " (" + email + ")";
    }
}
