package com.example.robotrestserverapi.controllers;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.robotrestserverapi.model.Robot;
import com.example.robotrestserverapi.repository.RobotRepository;




@Controller
public class PagesController {
	
	@GetMapping("/")
	public String home(ModelMap modelMap) {
		modelMap.put("name", "testeur");
		return "pages/home";
	}
	
} 
