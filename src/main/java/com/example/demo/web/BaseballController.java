package com.example.demo.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class BaseballController {
	@GetMapping("/baseball")
	public ModelAndView input(String inputValue) {
		System.out.print("input value :" + inputValue);
		ModelAndView mav = new ModelAndView("baseball/result");
		mav.addObject("baseball", inputValue);
		return mav;
	}
}
