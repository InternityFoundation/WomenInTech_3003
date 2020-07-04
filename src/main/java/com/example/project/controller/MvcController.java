package com.example.project.controller;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import com.example.project.entity.Client;
import com.example.project.service.ClientService;
 
@Controller
public class MvcController {
     @Autowired
    private ClientService service;
    
     
     @RequestMapping("/")
    public String home() {
        
        return "index";
    }
	@RequestMapping(value = "/save", method = RequestMethod.POST)
	public String saveClient(@ModelAttribute("client") Client client) {
		service.save(client);
		System.out.println(client);
	    return "register_success";
	}
     @GetMapping("/register")
     public String showForm(Model model) {
        Client client = new Client();
        List<String> professionList = Arrays.asList("Developer", "Designer", "Tester");
         model.addAttribute("client", client);
        model.addAttribute("professionList", professionList);
         
        return "register_form";
    }
     @RequestMapping("/ExamClient")
     public String showSkill() {
         
         return "ExamClient";
     }
}