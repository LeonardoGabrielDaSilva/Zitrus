package br.com.zitrus.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.client.HttpClientErrorException;
import org.springframework.web.client.RestTemplate;

import br.com.zitrus.dto.ClienteEnderecoDto;
import br.com.zitrus.model.Cliente;
import br.com.zitrus.model.ClienteEndereco;
import br.com.zitrus.model.Endereco;
import br.com.zitrus.repository.ClienteEnderecoRepository;
import br.com.zitrus.repository.ClienteRepository;
import br.com.zitrus.repository.EnderecoRepository;

@Controller
@RequestMapping("cliente")
public class ClienteController {

	private final String openCep = "https://opencep.com/v1/";

	@Autowired
	private RestTemplate restTemplate;

	@Autowired
	private ClienteRepository clienteRepository;

	@Autowired
	private EnderecoRepository enderecoRepository;

	@Autowired
	private ClienteEnderecoRepository clienteEnderecoRepository;

	@GetMapping("menu")
	public String menuCliente(Model model) {
		List<Cliente> clientes = clienteRepository.findAll();
		model.addAttribute("clientes", clientes);
		return "cliente/menu";
	}

	@PostMapping("formCadastro")
	public String formCadastroCliente(@Valid ClienteEnderecoDto clienteEnderecoDto, BindingResult result, Model model, @RequestParam String action) {
		if(action.equals("buscarCep")) {
			return buscarCep(clienteEnderecoDto);
		}
		if (result.hasErrors()) {
			return "cliente/criar";
		}
		Endereco endereco = clienteEnderecoDto.toEndereco();
		if (!enderecoRepository.existsById(endereco.getCep())) {
			enderecoRepository.save(endereco);
		}
		Cliente cliente = clienteEnderecoDto.toCliente();
		if (!clienteRepository.existsById(cliente.getCpf())) {
			clienteRepository.save(cliente);
		}
		if (!clienteEnderecoRepository.existsById(clienteEnderecoDto.toClienteEnderecoId())) {
			ClienteEndereco ce = clienteEnderecoDto.toClienteEndereco();
			clienteEnderecoRepository.save(ce);
		}
		return menuCliente(model);
	}

	@GetMapping("detalhar")
	public String detalharCliente(String cpf, Model model) {
		List<ClienteEndereco> clientes = clienteEnderecoRepository.findAllByCliente_Cpf(cpf);
		model.addAttribute("clientes", clientes);
		return "cliente/detalhar";
	}

	@GetMapping("deletar")
	public String deletarCliente(String cpf, Model model) {
		if (clienteRepository.existsById(cpf)) {
			clienteEnderecoRepository.deleteByCliente_Cpf(cpf);
			clienteRepository.deleteById(cpf);
		}
		return menuCliente(model);
	}

	@GetMapping("redirectCriar")
	public String redirectCriar(ClienteEnderecoDto clienteEnderecoDto) {
		return "cliente/criar";
	}

	@GetMapping("buscarCep")
	public String buscarCep(ClienteEnderecoDto clienteEnderecoDto) {
		try {
			clienteEnderecoDto.setEndereco(restTemplate.getForObject(openCep + clienteEnderecoDto.getCep(), Endereco.class));
		} catch (HttpClientErrorException ex) {
			
		}	
		return "cliente/criar";
			
	}

}
