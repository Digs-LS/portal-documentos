package com.mre.dpagro.portaldpagro.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mre.dpagro.portaldpagro.entity.Pessoa;
import com.mre.dpagro.portaldpagro.exception.PessoaNotFoundException;
import com.mre.dpagro.portaldpagro.service.PessoaService;

@RestController
@RequestMapping("/api")
public class PessoaController {

	@Autowired
	private PessoaService pessoaService;

	@GetMapping("/pessoas")
	public List<Pessoa> getPessoas() {

		return pessoaService.getPessoas();
	}

	@GetMapping("/pessoas/{pessoaId}")
	public Pessoa getPessoa(@PathVariable int pessoaId) {
		Pessoa thePessoa = pessoaService.getPessoa(pessoaId);

		if (thePessoa == null) {
			throw new PessoaNotFoundException("Pessoa não encontrada - " + pessoaId);
		}
		
		return thePessoa;
	}
}
