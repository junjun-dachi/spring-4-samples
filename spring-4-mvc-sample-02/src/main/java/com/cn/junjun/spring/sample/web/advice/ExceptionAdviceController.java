package com.cn.junjun.spring.sample.web.advice;

import javax.servlet.http.HttpServletRequest;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.NoHandlerFoundException;

@ControllerAdvice
public class ExceptionAdviceController {

	@ExceptionHandler(NoHandlerFoundException.class)
	public String dealWithNoHandlerFoundException(HttpServletRequest httpServletRequest) {
		return "nofound";
	}
}