package com.mre.dpagro.portaldpagro.entity;

import java.net.URL;
import java.time.LocalDateTime;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "pessoas")
public class Pessoa {

	@Id
	@Column(name = "id")
	private int id;

	@Column(name = "primeiro_nome")
	private String primeiroNome;

	@Column(name = "sobrenome")
	private String sobrenome;

	@Column(name = "cargo")
	private String cargo;

	@Column(name = "titular_da_entidade")
	private Boolean titularDaEntidade;

	@Column(name = "email")
	private String email;

	@Column(name = "telefone_fixo")
	private String telefoneFixo;

	@Column(name = "celular")
	private String celular;

	@Column(name = "observacoes")
	private String observacoes;

	@Column(name = "funcao_no_posto")
	private String funcaoNoPosto;

	@Column(name = "classe_diplomatica")
	private String classeDiplomatica;

	@Column(name = "foi_desativado")
	private Boolean foiDesativado;

	@Column(name = "bio_curta")
	private String bioCurta;

	@Column(name = "ultima_atualizacao")
	private LocalDateTime ultimaAtualizacao;

	@Column(name = "foto_url")
	private URL fotoUrl;

	@Column(name = "link_perfil_intratec")
	private String linkPerfilIntratec;

	@OneToOne
	@JoinColumn(name = "entidade_id", referencedColumnName = "id")
	private Entidade entidade;

	public Pessoa(int id, String primeiroNome, String sobrenome, String cargo, Boolean titularDaEntidade, String email,
			String telefoneFixo, String celular, String observacoes, String funcaoNoPosto, String classeDiplomatica,
			Boolean foiDesativado, String bioCurta, LocalDateTime ultimaAtualizacao, URL fotoUrl,
			String linkPerfilIntratec, Entidade entidade) {
		super();
		this.id = id;
		this.primeiroNome = primeiroNome;
		this.sobrenome = sobrenome;
		this.cargo = cargo;
		this.titularDaEntidade = titularDaEntidade;
		this.email = email;
		this.telefoneFixo = telefoneFixo;
		this.celular = celular;
		this.observacoes = observacoes;
		this.funcaoNoPosto = funcaoNoPosto;
		this.classeDiplomatica = classeDiplomatica;
		this.foiDesativado = foiDesativado;
		this.bioCurta = bioCurta;
		this.ultimaAtualizacao = ultimaAtualizacao;
		this.fotoUrl = fotoUrl;
		this.linkPerfilIntratec = linkPerfilIntratec;
		this.entidade = entidade;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getPrimeiroNome() {
		return primeiroNome;
	}

	public void setPrimeiroNome(String primeiroNome) {
		this.primeiroNome = primeiroNome;
	}

	public String getSobrenome() {
		return sobrenome;
	}

	public void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
	}

	public String getCargo() {
		return cargo;
	}

	public void setCargo(String cargo) {
		this.cargo = cargo;
	}

	public Boolean getTitularDaEntidade() {
		return titularDaEntidade;
	}

	public void setTitularDaEntidade(Boolean titularDaEntidade) {
		this.titularDaEntidade = titularDaEntidade;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getTelefoneFixo() {
		return telefoneFixo;
	}

	public void setTelefoneFixo(String telefoneFixo) {
		this.telefoneFixo = telefoneFixo;
	}

	public String getCelular() {
		return celular;
	}

	public void setCelular(String celular) {
		this.celular = celular;
	}

	public String getObservacoes() {
		return observacoes;
	}

	public void setObservacoes(String observacoes) {
		this.observacoes = observacoes;
	}

	public String getFuncaoNoPosto() {
		return funcaoNoPosto;
	}

	public void setFuncaoNoPosto(String funcaoNoPosto) {
		this.funcaoNoPosto = funcaoNoPosto;
	}

	public String getClasseDiplomatica() {
		return classeDiplomatica;
	}

	public void setClasseDiplomatica(String classeDiplomatica) {
		this.classeDiplomatica = classeDiplomatica;
	}

	public Boolean getFoiDesativado() {
		return foiDesativado;
	}

	public void setFoiDesativado(Boolean foiDesativado) {
		this.foiDesativado = foiDesativado;
	}

	public String getBioCurta() {
		return bioCurta;
	}

	public void setBioCurta(String bioCurta) {
		this.bioCurta = bioCurta;
	}

	public LocalDateTime getUltimaAtualizacao() {
		return ultimaAtualizacao;
	}

	public void setUltimaAtualizacao(LocalDateTime ultimaAtualizacao) {
		this.ultimaAtualizacao = ultimaAtualizacao;
	}

	public URL getFotoUrl() {
		return fotoUrl;
	}

	public void setFotoUrl(URL fotoUrl) {
		this.fotoUrl = fotoUrl;
	}

	public String getLinkPerfilIntratec() {
		return linkPerfilIntratec;
	}

	public void setLinkPerfilIntratec(String linkPerfilIntratec) {
		this.linkPerfilIntratec = linkPerfilIntratec;
	}

	public Entidade getEntidade() {
		return entidade;
	}

	public void setEntidade(Entidade entidade) {
		this.entidade = entidade;
	}

	@Override
	public String toString() {
		return "Pessoa [id=" + id + ", primeiroNome=" + primeiroNome + ", sobrenome=" + sobrenome + ", cargo=" + cargo
				+ ", titularDaEntidade=" + titularDaEntidade + ", email=" + email + ", telefoneFixo=" + telefoneFixo
				+ ", celular=" + celular + ", observacoes=" + observacoes + ", funcaoNoPosto=" + funcaoNoPosto
				+ ", classeDiplomatica=" + classeDiplomatica + ", foiDesativado=" + foiDesativado + ", bioCurta="
				+ bioCurta + ", ultimaAtualizacao=" + ultimaAtualizacao + ", fotoUrl=" + fotoUrl
				+ ", linkPerfilIntratec=" + linkPerfilIntratec + ", entidade=" + entidade + "]";
	}

}
