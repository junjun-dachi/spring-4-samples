package org.junjun.spring.tutorials.service.impl;

import java.util.Date;
import java.util.List;

import org.junjun.spring.tutorials.bean.ToDoEntity;
import org.junjun.spring.tutorials.dao.ToDoDao;
import org.junjun.spring.tutorials.service.ToDoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ToDoServiceImpl implements ToDoService {

	@Autowired
	private ToDoDao toDoDao;

	@Override
	public List<ToDoEntity> getAll() {
		return toDoDao.getAll();
	}

	@Override
	public ToDoEntity create(ToDoEntity toDoEntity) {
		toDoEntity.setCreatedDate(new Date());
		return toDoDao.create(toDoEntity);
	}

	@Override
	public ToDoEntity delete(ToDoEntity toDoEntity) {

		return toDoDao.delete(toDoEntity);
	}

}
