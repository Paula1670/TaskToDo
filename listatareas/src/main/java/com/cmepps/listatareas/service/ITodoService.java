package com.cmepps.listatareas.service;

import java.util.Date;
import java.util.List;
import java.util.Optional;

import com.cmepps.listatareas.model.Todo;

public interface ITodoService {

    List < Todo > getTodosByUser(String user);

    Optional < Todo > getTodoById(long id);

    void updateTodo(Todo todo);

    void addTodo(String name, String desc, Date targetDate, boolean isDone);

    void deleteTodo(long id);

    void saveTodo(Todo todo);
}
