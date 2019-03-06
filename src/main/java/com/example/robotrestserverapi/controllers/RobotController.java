package com.example.robotrestserverapi.controllers;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.example.robotrestserverapi.dao.RobotDAO;
import com.example.robotrestserverapi.model.Robot;

@Controller
public class RobotController {
	@Autowired
	private RobotDAO robotDao;
	
	@RequestMapping(value="/new", method=RequestMethod.GET)
	public String newRobot(ModelMap model) {
		Robot robot = new Robot();
		model.addAttribute("robot", robot);
		return "new";
	}
	
	@RequestMapping(value="/save", method=RequestMethod.POST)
	public String saveRobot(@Valid Robot robot , BindingResult result, ModelMap model, RedirectAttributes redirectAttributes) {
		if(result.hasErrors()) {
			System.out.println("has errors");
			return "new";
		}
		
		robotDao.save(robot);
		return "redirect:/home";
	}
	
	@RequestMapping(value="/home")
	public ModelAndView getAll() {
		List<Robot> list=robotDao.findAll();
		return new ModelAndView("home", "list", list);
	}
	

	
	@RequestMapping(value="/deleterobot/{id}", method=RequestMethod.GET)
	public ModelAndView delete(@PathVariable int id) {
		Robot robot=robotDao.findOne(id);
		robotDao.delete(robot);
		return new ModelAndView("redirect:/home");
	}
	
	
	
	
}
