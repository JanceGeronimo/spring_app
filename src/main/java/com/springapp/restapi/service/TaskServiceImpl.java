package com.springapp.restapi.service;

import com.springapp.restapi.entity.Task;
import com.springapp.restapi.repository.task.TaskRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TaskServiceImpl implements TaskService{

    @Autowired
    private TaskRepository taskRepository;

    public TaskServiceImpl(TaskRepository taskRepository){
        super();
        this.taskRepository = taskRepository;
    }

    @Override
    public List<Task> getAllTasks() {
        return taskRepository.findAll();
    }

    @Override
    public Task saveTask(Task task) {
        return taskRepository.save(task);
    }

    @Override
    public Task getTaskId(Long id) {
        return taskRepository.findById(id).get();
    }

    @Override
    public Task editTask(Task task) {
        return taskRepository.save(task);
    }

    @Override
    public void deleteTaskById(Long id) {
        taskRepository.deleteById(id);
    }


}
