package com.vahikhata.task

import org.springframework.data.annotation.Id
import org.springframework.data.mongodb.core.mapping.Document
import java.util.*

@Document
data class TaskEntity (
    @Id
    val id : UUID,
    val name: String,
    val isDone: Boolean,
    val currentStatus: String
)