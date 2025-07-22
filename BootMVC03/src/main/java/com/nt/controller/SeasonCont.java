package com.nt.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.nt.model.Employee;
import com.nt.service.Season;

@Controller
public class SeasonCont {
	@Autowired
	private Season s;
	@RequestMapping("/")
	public String Home() {
		return "home";
	}
	@GetMapping("/ses")
	public String ses(Map<String,Object> map) {
		String result=s.findseason();
		map.put("result", result);
		map.put("fav", new String[] {"green","yellow"});
		
		List<Employee> emps=List.of(new Employee(101,"raja"),new Employee(102,"rani"));
		map.put("emps", emps);
		return "welcome";
	}
	@PostMapping("/ses")
	public String ses1(Map<String,Object> map) {
		String result=s.findseason();
		map.put("result", result);
		return "show";
	}

}
