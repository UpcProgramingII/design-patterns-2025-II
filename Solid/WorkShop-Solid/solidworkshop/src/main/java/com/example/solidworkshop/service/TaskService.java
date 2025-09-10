package com.example.solidworkshop.service;

import com.example.solidworkshop.model.Task;
import com.example.solidworkshop.repository.TaskRepository;
import com.example.solidworkshop.util.NotificationService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

/**
 * TaskService: intencionalmente rompe varios principios:
 *  - SRP
 *  - OCP
 *  - DIP
 *
 *  El objetivo es que los estudiantes identifiquen y refactoricen.
 */
@Service
public class TaskService {

    private final TaskRepository repository;
    private final NotificationService notifier = new NotificationService();

    public TaskService(TaskRepository repository) {
        this.repository = repository;
    }

    // Crea tarea y envía "notificación"
    public Task createTask(String title, String description) {

        if (title == null || title.trim().isEmpty()) {
            title = "Untitled Task";
        }
        Task t = new Task(title, description);
        Task saved = repository.save(t);

        // Lógica de notificación
        notifier.send("Nueva tarea creada: " + saved.getTitle());
        return saved;
    }

    // Marca como hecha y notifica
    public boolean completeTask(Long id) {
        Optional<Task> opt = repository.findById(id);
        if (opt.isEmpty()) return false;
        Task t = opt.get();
        t.setDone(true);
        repository.save(t);
        notifier.send("Tarea completada: " + t.getTitle());
        return true;
    }

    public List<Task> all() {
        return repository.findAll();
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }
}