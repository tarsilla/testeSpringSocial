package edu.ifrn.teste.SpringSocial.controller;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import edu.ifrn.teste.SpringSocial.model.User;
import edu.ifrn.teste.SpringSocial.service.UserService;


@Controller
@RequestMapping("/user")
public class UserController {
	
	private UserService service;


	@GetMapping("/formulario")
	public ModelAndView formulario(User user) {
		ModelAndView view = new ModelAndView("user/form");
		view.addObject("user",user);
		return view;
	}
	
	@PostMapping("/salvar")
	public ModelAndView save( User user, BindingResult result) {
		System.out.println("testando cadastro");
		
		service.save(user);
		
		
		ModelAndView mv = new ModelAndView("login");
		
		return mv;
	}
}