package com.bit.tsigner.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class NoticeController {
	@GetMapping(value = "/notice")
	public String notice() {
		
		return "notice";
	}
}
