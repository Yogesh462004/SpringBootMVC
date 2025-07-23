package com.nt.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.nt.model.Doctor;
import com.nt.service.Service1;

@Controller
public class Cont1 {
@Autowired	
private Service1 serv;
@GetMapping("/genrate")
public String showdoct(Map<String,Object> map) {
	System.out.println("genn");
	Iterable<Doctor> doctList=serv.getall();
	map.put("doctList", doctList);
	return "report";
}
@GetMapping("/")
public String shoe() {
	return "home";
}
@GetMapping("/doc_edit")
public String docedit(@RequestParam("no")Integer docid,Model model) {
	System.out.println("Cont1.docedit()");
	model.addAttribute("docid", docid);
	return "edit";
}
@PostMapping("/updated")
public String updated(@ModelAttribute Doctor doctor,RedirectAttributes redirectAttributes) {
	System.out.println("Cont1.updated()");
	String result=serv.edit(doctor);
	 // Store result as a flash attribute
    redirectAttributes.addFlashAttribute("result", result);
    
    return "redirect:/genrate";
}


  @PostMapping("/doc_add") public String updated1(@ModelAttribute Doctor
  doctor,RedirectAttributes redirectAttributes) {
  System.out.println("Cont1.updated()"); String result=serv.edit1(doctor); //
  //Store result as a flash attribute
  redirectAttributes.addFlashAttribute("result", result);
  
 return "redirect:/genrate"; }
  
  @ModelAttribute("cList")
  public List<String> buildCountries() {
      Locale[] locales = Locale.getAvailableLocales();
      Set<String> countrySet = new TreeSet<>();
      for (Locale locale : locales) {
          String country = locale.getDisplayCountry();
          if (!country.isBlank()) {
              countrySet.add(country);
          }
      }
      return new ArrayList<>(countrySet);
  }
  @GetMapping("/count")
  public String showCountries() {
      return "countshow";
  }
/*
 * @PostMapping("/doc_add") public String updated1(@ModelAttribute Doctor
 * doctor,HttpSession ses) { System.out.println("Cont1.updated()"); String
 * result=serv.edit1(doctor); // Store result as a flash attribute
 * ses.setAttribute("result", result) ; return "redirect:/genrate"; }
 */
@GetMapping("/doc_delete")
public String del(@RequestParam("no")Integer docid,RedirectAttributes redirectAttributes) {
	System.out.println("DOC DELETE");
	Integer id=docid;
	String result=serv.delete(id);
	redirectAttributes.addFlashAttribute("result", result);
	return "redirect:/genrate";
	
	
}
@GetMapping("/doc_add")
public String doceadd(@ModelAttribute("doctor")Doctor doctor) {
	System.out.println("Cont1.doceadd()");
	return "add";
}
}
