package com.nt.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.nt.service.Season;

@Controller
public class SeasonCont {
	@Autowired
	private Season s;
	@RequestMapping("/")
	public String Home() {
		return "home";
	}
	@RequestMapping("/ses")
	public String ses(Map<String,Object> map) {
		String result=s.findseason();
		map.put("result", result);
		return "welcome";
	}

}
