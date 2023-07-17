package com.mycompany.springhomework.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.mycompany.springhomework.controller.HomeworkController;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Controller
public class HomeworkController {
	@RequestMapping("/")	// http://localhost:8080/sptringwebapp/
	public String index() {
		log.info("실행1");
		return "index";
	}
}
