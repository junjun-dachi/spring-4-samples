package com.cn.junjun.spring.sample.service.impl;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cn.junjun.spring.sample.bean.ToDoEntity;
import com.cn.junjun.spring.sample.dao.ToDoDao;
import com.cn.junjun.spring.sample.service.ToDoService;

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
