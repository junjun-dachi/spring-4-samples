package org.junjun.spring.tutorials.web.controller;

import java.util.List;

import javax.validation.Valid;

import org.apache.log4j.Logger;
import org.junjun.spring.tutorials.bean.EntityList;
import org.junjun.spring.tutorials.bean.ToDoEntity;
import org.junjun.spring.tutorials.service.ToDoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/todo")
public class ToDoRestController {

	private static final Logger logger = Logger.getLogger(ToDoRestController.class);

	@Autowired
	private ToDoService toDoService;

	@RequestMapping(value = "", method = RequestMethod.GET)
	public ResponseEntity<?> list(Model model) {
		ResponseEntity<?> response = new ResponseEntity<>(HttpStatus.NO_CONTENT);
		List<ToDoEntity> toDoList = toDoService.getAll();
		EntityList<ToDoEntity> wapper = new EntityList<>(toDoList);
		if (toDoList.size() > 0) {
			response = new ResponseEntity<>(wapper, HttpStatus.OK);
		}
		return response;

	}

	@RequestMapping(value = "create", method = RequestMethod.POST)
	public ResponseEntity<ToDoEntity> create(@RequestBody @Valid ToDoEntity todo, BindingResult result) {
		ToDoEntity created = null;
		ResponseEntity<ToDoEntity> response = null;
		if (result.hasErrors()) {
			for (ObjectError err : result.getAllErrors()) {
				logger.warn(err.getDefaultMessage());
			}
			response = new ResponseEntity<>(HttpStatus.BAD_REQUEST);
		} else {
			created = toDoService.create(todo);
			response = new ResponseEntity<>(created, HttpStatus.OK);
		}

		return response;
	}

}
