package org.junjun.spring.tutorials.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class AuthController {

	@RequestMapping(value = "/login", method = RequestMethod.GET)
	public String displayLoginPage() {
		return "login";
	}

	@RequestMapping(value = "/login", method = RequestMethod.POST)
	public String login() {
		return "forward:/rest/todo/list";
	}

	@RequestMapping(value = "/logout", method = RequestMethod.POST)
	public String logout() {
		return "/login";
	}
}
