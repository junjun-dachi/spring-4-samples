package com.cn.junjun.spring.sample.dao.impl;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.cn.junjun.spring.sample.bean.ToDoEntity;
import com.cn.junjun.spring.sample.dao.ToDoDao;

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

}
