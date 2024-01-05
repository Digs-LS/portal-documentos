package com.mre.dpagro.portaldpagro.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "contatos_institucionais")
public class ContatoInstitucional {

	@OneToOne
	@JoinColumn(name = "entidade_id", referencedColumnName = "id")
	private Entidade entidadeId;

	@Column(name = "setor")
	private String setor;

	@Column(name = "email")
	private String email;

	@Column(name = "telefone")
	private String telefone;

	public ContatoInstitucional(Entidade entidadeId, String setor, String email, String telefone) {
		super();
		this.entidadeId = entidadeId;
		this.setor = setor;
		this.email = email;
		this.telefone = telefone;
	}

	public Entidade getEntidadeId() {
		return entidadeId;
	}

	public void setEntidadeId(Entidade entidadeId) {
		this.entidadeId = entidadeId;
	}

	public String getSetor() {
		return setor;
	}

	public void setSetor(String setor) {
		this.setor = setor;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	@Override
	public String toString() {
		return "ContatoInstitucional [entidadeId=" + entidadeId + ", setor=" + setor + ", email=" + email
				+ ", telefone=" + telefone + "]";
	}
}
