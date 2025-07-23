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
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.nt.model.Doctor;
import com.nt.service.Service1;

import jakarta.validation.Valid;

@Controller
public class Cont1 {

    @Autowired
    private Service1 serv;

    // Show doctor report
    @GetMapping("/genrate")
    public String showDoctors(Map<String, Object> map) {
        Iterable<Doctor> doctList = serv.getall();
        map.put("doctList", doctList);
        return "report";
    }

    // Show home page
    @GetMapping("/")
    public String showHome() {
        return "home";
    }

    // Show edit form
    @GetMapping("/doc_edit")
    public String docEdit(@RequestParam("no") Integer docid, Model model) {
        model.addAttribute("docid", docid);
        return "edit";
    }

    // Process update doctor form (edit.jsp)
    @PostMapping("/updated")
    public String updateDoctor(@Valid @ModelAttribute Doctor doctor,
                               
                               RedirectAttributes redirectAttributes) {
        

        String result = serv.edit(doctor);
        redirectAttributes.addFlashAttribute("result", result);
        return "redirect:/genrate";
    }

    // Process add doctor form (add.jsp)
    @PostMapping("/doc_add")
    public String addDoctor(@Valid @ModelAttribute("doctor") Doctor doctor,
                            BindingResult errors,
                            RedirectAttributes redirectAttributes) {
        if (errors.hasErrors()) {
            return "add"; // return to add.jsp if errors
        }

        String result = serv.edit1(doctor);
        redirectAttributes.addFlashAttribute("result", result);
        return "redirect:/genrate";
    }

    // Show country list for dropdown
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

    // Show country list page (optional)
    @GetMapping("/count")
    public String showCountries() {
        return "countshow";
    }

    // Delete doctor
    @GetMapping("/doc_delete")
    public String deleteDoctor(@RequestParam("no") Integer docid,
                               RedirectAttributes redirectAttributes) {
        String result = serv.delete(docid);
        redirectAttributes.addFlashAttribute("result", result);
        return "redirect:/genrate";
    }

    // Show add doctor form
    @GetMapping("/doc_add")
    public String showAddDoctorForm(@ModelAttribute("doctor") Doctor doctor) {
        return "add";
    }
}
