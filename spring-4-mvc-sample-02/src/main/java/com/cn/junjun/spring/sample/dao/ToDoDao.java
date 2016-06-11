package com.cn.junjun.spring.sample.dao;

import java.util.List;

import com.cn.junjun.spring.sample.bean.ToDoEntity;

public interface ToDoDao {

	List<ToDoEntity> getAll();

	ToDoEntity create(ToDoEntity toDoEntity);

}
