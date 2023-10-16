package com.example.sports.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;


import com.example.sports.Model.sports;

import com.example.sports.service.sportservices;
 

@Controller
public class homeController {
@Autowired
private sportservices service;


	@GetMapping("/index")
	public String get1()
	{
		return "index";
	}
	@GetMapping("/about")
	public String get2()
	{
		return "about";
	}
	@GetMapping("/contact")
	public String get3()
	{
		return "contact";
	}
	@GetMapping("/service")
	public String get4()
	
	{
		return "service";
	}
	@PostMapping("/save")
	public String Addsports(@ModelAttribute sports s) {
		service.save(s);
		return "redirect:/index";
	}
	@GetMapping("/single")
	public ModelAndView getAllspo() {
		List<sports>list=service.getAllspo();
		return new ModelAndView("Data","sol",list);
	}
	@RequestMapping("/deleteBook/{id}")
	public String deleteBook(@PathVariable("id")int id) {
		service.deletecode(id);
		return "redirect:/single";
	}
	
	
}
