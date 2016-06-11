package com.cn.junjun.spring.sample.service;

import java.util.List;

import com.cn.junjun.spring.sample.bean.ToDoEntity;

public interface ToDoService {

	List<ToDoEntity> getAll();

	ToDoEntity create(ToDoEntity todo);

}
