package com.nt.controller;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.nt.model.Student;

@Controller
public class StudReg {
    @GetMapping("/")
	public String show() {
		return "home";
	}
    @GetMapping("/register")
    public String shor(Map<String,Object> map) {
    	
    	return "formfill";
    }
    @PostMapping("/register")
    public String shoreg(Map<String,Object> map,@ModelAttribute("student")Student student) {
    	
    	return "result";
    }
}
