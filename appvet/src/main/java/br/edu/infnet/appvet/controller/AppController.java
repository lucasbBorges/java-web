package br.edu.infnet.appvet.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class AppController {
	
	@GetMapping(value = "/")
	public String telaInicio() {
		return "redirect:/login";
	}
	
	@GetMapping(value = "/home")
	public String telaHome() {
		return "index";
	}
}
