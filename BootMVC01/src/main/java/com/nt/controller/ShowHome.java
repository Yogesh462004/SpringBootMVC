package com.nt.controller;

import java.io.PrintWriter;
import java.time.LocalDateTime;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

@Controller
public class ShowHome {
@RequestMapping("/")	
public String showHome() {
	return "welcome";
}
@RequestMapping("/pro")
public String pr(Map<String,Object>map) {
	map.put("name", "YogeshPatil");
	map.put("Date",LocalDateTime.now());
	return "show";
}

/*
 * @RequestMapping("/process") public Model process() { Model m=new
 * BindingAwareModelMap(); m.addAttribute("name","Mohan"); return m; }
 */
/*
 * @RequestMapping("/process") public Map<String,Object> proce(){
 * Map<String,Object> map=new HashMap(); map.put("name", "Rohan"); return map; }
 */
/*
 * @RequestMapping("/process") public ModelAndView process() { ModelAndView
 * mv=new ModelAndView(); mv.addObject("name","Mahesh");
 * mv.setViewName("process"); return mv; }
 */
/*
 * @RequestMapping("/process") public void process() { Map<String,Object>
 * map=new HashMap(); map.put("name", "Abhay");
 * 
 * }
 */
/*
 * @RequestMapping("/process") public String pr1(Map<String,Object>map) {
 * map.put("name", "Yogesh"); map.put("Date",LocalDateTime.now()); return null;
 * }
 */
/*
 * @RequestMapping("/process") public String pr1(Map<String,Object>map) {
 * map.put("name", "Yogesh"); map.put("Age", 22);//memory can be shared
 * map.put("Date",LocalDateTime.now()); return "forward:pro"; }
 */
/*
 * @RequestMapping("/process") public String pr1(Map<String,Object>map) {
 * map.put("name", "Yogesh"); map.put("Age", 22);//memory not shared
 * map.put("Date",LocalDateTime.now()); return "redirect:pro"; }
 */
/*
 * @RequestMapping("/process") public String pr1(HttpServletRequest
 * req,HttpServletResponse res) { req.setAttribute("Age", 23); return
 * "forward:pro"; }
  
 */
/*
 * @RequestMapping("/process") public String pr1(HttpSession ses) {
 * ses.setAttribute("Age", 24); return "forward:pro"; }
 */
@RequestMapping("/process")
public void pr1(HttpServletResponse res)throws Exception {
	    PrintWriter pw=res.getWriter();
	    pw.println("Hare Krishna Hare Krishna Krishna  Hare Hare");
	    pw.println("Hare Ram Hare Ram Ram Ram Hare Hare ");
}
}
