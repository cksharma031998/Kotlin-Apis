package com.vahikhata.task

import org.springframework.web.bind.annotation.*
import java.util.*

@RestController
@RequestMapping("/api/task")
class TaskController(private val taskRepository: TaskRepository) {
    @GetMapping("/{id}")
    fun getTask(@PathVariable id: String): Optional<TaskEntity> {
        return taskRepository.findById(id)
    }

    @PostMapping("/")
    fun createTask(@RequestBody taskEntity: TaskEntity): TaskEntity {
        return taskRepository.save(taskEntity)
    }
}