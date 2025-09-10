package com.example.solidworkshop.model;

import java.time.LocalDateTime;

/**
 * Modelo simple de Task.
 *
 * NOTA: aquí hay una pequeña violación del principio de Encapsulamiento
 * (se exponen setters públicos para todo), lo que facilitará a los estudiantes
 * detectar invariantes rotos.
 */
public class Task {
    private static long count=0;
    private  Long id;
    private String title;
    private String description;
    private boolean done;
    private LocalDateTime createdAt;

    public Task() {
        this.createdAt = LocalDateTime.now();

    }

    public Task(String title, String description) {
        count++;
        this.id = count;
        this.title = title;
        this.description = description;
        this.done = false;
        this.createdAt = LocalDateTime.now();
    }

    // getters y setters (públicos)
    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public String getTitle() { return title; }
    public void setTitle(String title) { this.title = title; }

    public String getDescription() { return description; }
    public void setDescription(String description) { this.description = description; }

    public boolean isDone() { return done; }
    public void setDone(boolean done) { this.done = done; }

    public LocalDateTime getCreatedAt() { return createdAt; }
    public void setCreatedAt(LocalDateTime createdAt) { this.createdAt = createdAt; }
}
