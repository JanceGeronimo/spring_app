package com.springapp.restapi.repository.task;

import com.springapp.restapi.entity.Task;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TaskRepository extends JpaRepository<Task, Long> {

}
