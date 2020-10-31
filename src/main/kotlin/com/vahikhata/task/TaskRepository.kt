package com.vahikhata.task

import org.springframework.data.mongodb.repository.MongoRepository


interface TaskRepository : MongoRepository<TaskEntity, String> {}