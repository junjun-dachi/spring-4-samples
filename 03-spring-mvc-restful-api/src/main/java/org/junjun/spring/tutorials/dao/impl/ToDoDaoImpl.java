package org.junjun.spring.tutorials.dao.impl;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

import org.junjun.spring.tutorials.bean.ToDoEntity;
import org.junjun.spring.tutorials.dao.ToDoDao;
import org.springframework.stereotype.Repository;

@Repository
public class ToDoDaoImpl implements ToDoDao {

	private List<ToDoEntity> list = new ArrayList<>();

	public ToDoDaoImpl() {

		ToDoEntity defaultToDo = new ToDoEntity();
		defaultToDo.setContent("default");
		defaultToDo.setCreatedDate(new Date());
		list.add(defaultToDo);
	}

	@Override
	public List<ToDoEntity> getAll() {
		return list;
	}

	@Override
	public ToDoEntity create(ToDoEntity toDoEntity) {
		list.add(toDoEntity);
		return toDoEntity;
	}

	@Override
	public ToDoEntity delete(ToDoEntity toDoEntity) {

		Iterator<ToDoEntity> i = list.iterator();
		while (i.hasNext()) {
			ToDoEntity saved = i.next();
			if (saved.getContent().equals(toDoEntity.getContent())) {
				i.remove();
			}
		}
		return toDoEntity;
	}

}
