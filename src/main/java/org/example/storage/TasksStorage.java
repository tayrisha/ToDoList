package org.example.storage;

import org.example.Tasks;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;

@Component
public class TasksStorage {
    Map<Integer, Tasks> tasksHashMap = new HashMap<>();
    Integer id = 0;

    public Tasks create(Tasks taskToCreate) {
        id++;
        taskToCreate.setTaskNumber(id);
        tasksHashMap.put(id, taskToCreate);
        return taskToCreate;
    }

    public Tasks read(Integer id) {
        return tasksHashMap.get(id);
    }

    public Tasks update(Tasks taskToUpdate, Integer id) {
        taskToUpdate.setTaskNumber(id);
        tasksHashMap.put(id, taskToUpdate);
        return taskToUpdate;

    }

    public void delete(Integer id) {
        tasksHashMap.remove(id);

    }

}

