package com.mre.dpagro.portaldpagro.service;

import java.util.List;

import com.mre.dpagro.portaldpagro.entity.Pessoa;

public interface PessoaService {

	List<Pessoa> getPessoas();

	Pessoa getPessoa(int pessoaId);

}
