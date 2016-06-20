package com.cn.junjun.spring.sample.web.controller;

import java.util.List;

import javax.validation.Valid;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.cn.junjun.spring.sample.bean.ToDoEntity;
import com.cn.junjun.spring.sample.service.ToDoService;

@Controller
@RequestMapping("todo")
public class ToDoController {

	private static final Logger logger = Logger.getLogger(ToDoController.class);

	@Autowired
	private ToDoService toDoService;

	@RequestMapping(value = "list", method = RequestMethod.GET)
	public String list(Model model) {
		String page = "todo/list";
		List<ToDoEntity> toDoList = toDoService.getAll();
		model.addAttribute("toDoList", toDoList);
		model.addAttribute("newToDo", new ToDoEntity());
		return page;
	}

	@RequestMapping(value = "rest/list", method = RequestMethod.GET)
	public String restList(Model model) {
		String page = "todo/rest/list";
		List<ToDoEntity> toDoList = toDoService.getAll();
		model.addAttribute("toDoList", toDoList);
		model.addAttribute("newToDo", new ToDoEntity());
		return page;
	}

	@RequestMapping(value = "create", method = RequestMethod.POST)

	public String create(@Valid @ModelAttribute("newToDo") ToDoEntity toDoEntity, BindingResult result, Model model) {
		String page = "todo/list";
		if (result.hasErrors()) {
			for (ObjectError error : result.getAllErrors()) {
				logger.debug(error.getDefaultMessage());
			}
		} else {
			toDoService.create(toDoEntity);
		}
		List<ToDoEntity> toDoList = toDoService.getAll();
		model.addAttribute("toDoList", toDoList);
		model.addAttribute("newToDo", toDoEntity);
		return page;
	}

}
