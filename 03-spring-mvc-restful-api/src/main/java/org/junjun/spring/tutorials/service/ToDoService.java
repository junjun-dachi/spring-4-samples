package org.junjun.spring.tutorials.service;

import java.util.List;

import org.junjun.spring.tutorials.bean.ToDoEntity;

public interface ToDoService {

	List<ToDoEntity> getAll();

	ToDoEntity create(ToDoEntity toDoEntity);

	ToDoEntity delete(ToDoEntity toDoEntity);

}
