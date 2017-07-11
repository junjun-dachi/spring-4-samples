package org.junjun.spring.tutorials.dao;

import java.util.List;

import org.junjun.spring.tutorials.bean.ToDoEntity;

public interface ToDoDao {

	List<ToDoEntity> getAll();

	ToDoEntity create(ToDoEntity toDoEntity);

	ToDoEntity delete(ToDoEntity toDoEntity);

}
