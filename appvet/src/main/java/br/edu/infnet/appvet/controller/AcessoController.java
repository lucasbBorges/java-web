package br.edu.infnet.appvet.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import br.edu.infnet.appvet.model.domain.Usuario;
import br.edu.infnet.appvet.model.repository.AcessoRepository;

@Controller
public class AcessoController {
	
	@GetMapping(value = "/login")
	public String telaLogin() {
		return "login";
	}
	
	@PostMapping(value = "/login")
	public String login(Model model, Usuario usuario) {
		
		if(AcessoRepository.autenticar(usuario) != null) {
			return "redirect:/home";			
		}
		
		model.addAttribute("mensagem", "A senha referente ao email " + usuario.getEmail() + " está incorreta");
		return telaLogin();
	}
}
