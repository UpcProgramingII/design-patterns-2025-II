package com.example.solidworkshop.repository;

import com.example.solidworkshop.model.Task;
import org.springframework.stereotype.Repository;

import java.util.*;
import java.util.concurrent.atomic.AtomicLong;

/**
 * Repositorio en memoria:
 * - Simula base de datos con una Map.
 * - Viola DIP / SRP en el uso que se hará del repo (el controlador utiliza este repo
 *   directamente además del servicio).
 */
@Repository
public class TaskRepository {

    private final Map<Long, Task> storage = new LinkedHashMap<>();

    // métodos CRUD básicos
    public Task save(Task t) {

        storage.put(t.getId(), t);
        return t;
    }

    public Optional<Task> findById(Long id) {
        return Optional.ofNullable(storage.get(id));
    }

    public List<Task> findAll() {
        return new ArrayList<>(storage.values());
    }

    public void deleteById(Long id) {
        storage.remove(id);
    }

    public void clearAll() {
        storage.clear();
    }
}
