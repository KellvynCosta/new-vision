package com.itb.tcc.inf2am.newvision.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.itb.tcc.inf2am.newvision.model.Cliente;
import com.itb.tcc.inf2am.newvision.repository.ClienteRepository;

@Controller
@RequestMapping("/newvision/cliente")
public class ClienteController {
	
	@Autowired // Injeção de depêndencia ( o objeto será criado automaticamente pelo spring)
	private ClienteRepository clienteRepository;
	
	// Carregar o formulário de Cadastro de Usuário
	
	@GetMapping("/novo-cliente")
	public String novoCliente(Cliente cliente, Model model) {
		
		model.addAttribute("cliente", cliente);
		return "cadastro-nvs";
		
	}
	
	// Inserir Cliente
	
	
	@PostMapping("/add-cliente")
	public String addCliente(Cliente cliente, Model model) {
		
		cliente.setCodStatusCliente(true);
		
		Cliente clienteDb = clienteRepository.save(cliente);
		
		return "redirect:/newvision/cliente/login";
	}
	
	@GetMapping("/login")
	public String showFormLogin () {

		return "login-nvs";
	}
	
	@PostMapping("/login")
	public String autenticarCliente(Cliente cliente, Model model) {
		Cliente acesso = this.clienteRepository.acessar(cliente.getEmail(), cliente.getSenha());
		if (acesso != null){
			return "redirect:home";
		}
		return "login-nvs";
		
	}
	

	@GetMapping("/home")
	public String showHome(Cliente cliente, Model model) {
		List<Cliente> listaClientes = new ArrayList();
		listaClientes = clienteRepository.findAll();
		model.addAttribute("cliente", listaClientes);
		return "consulta";
	}
	

	
	
	
	
	
	
}