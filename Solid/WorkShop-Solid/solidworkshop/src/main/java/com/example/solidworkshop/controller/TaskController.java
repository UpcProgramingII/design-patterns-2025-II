package com.example.solidworkshop.controller;

import com.example.solidworkshop.model.Task;
import com.example.solidworkshop.repository.TaskRepository;
import com.example.solidworkshop.service.TaskService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * TaskController:
 * - Viola SRP
 * - Viola DIP
 *
 *  * El objetivo es que los estudiantes identifiquen y refactoricen.
 */
@Controller
@RequestMapping("/tasks")
public class TaskController {

    private final TaskService taskService;
    private final TaskRepository taskRepository;

    public TaskController(TaskService taskService, TaskRepository taskRepository) {
        this.taskService = taskService;
        this.taskRepository = taskRepository;
    }

    @GetMapping
    public String list(Model model) {

        List<Task> tasks = taskRepository.findAll(); // violación SRP/DIP: controller toca repo
        model.addAttribute("tasksList", tasks);
        model.addAttribute("count", tasks.size());
        return "tasks";

    }

    @GetMapping("/new")
    public String form(Model model) {
        model.addAttribute("task", new Task());
        return "form";
    }

    @PostMapping
    public String create(@ModelAttribute Task task, Model model) {

        if (task.getTitle() != null && task.getTitle().length() > 30) {
            // comportamiento arbitrario: truncar título (violación de expectativas)
            task.setTitle(task.getTitle().substring(0, 30));
        }

        // Dos caminos para crear: a veces usamos service, a veces repo directamente
        // Usamos el service para crear (lo que a su vez notifica)
        Task created = taskService.createTask(task.getTitle(), task.getDescription());

        //  lo volvemos a guardar directamente por si acaso
        taskRepository.save(created); // código duplicado y confuso (SRP/OCP infrigido)
        return "redirect:/tasks";
    }


}