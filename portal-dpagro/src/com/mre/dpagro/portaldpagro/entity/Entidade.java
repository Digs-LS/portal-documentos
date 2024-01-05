package com.mre.dpagro.portaldpagro.entity;

import java.util.ArrayList;
import java.util.List;

import com.mre.dpagro.portaldpagro.enums.TipoEntidade;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;



@Entity
@Table(name = "entidades")
public class Entidade {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private int id;

	@Column(name = "nome_curto")
	private String nomeCurto;

	@Column(name = "nome_completo")
	private String nomeCompleto;

	@Column(name = "tipo_entidade")
	private TipoEntidade tipoEntidade;

	@Column(name = "tipo_de_posto")
	private String tipoDePosto;

	@Column(name = "cidade_do_posto")
	private String cidadeDoPosto;

	@Column(name = "posto_com_adido_agricola")
	private Boolean postoComAdidoAgricola;

	@Column(name = "email_institucional")
	private String emailInstitucional;

	@Column(name = "fone_geral")
	private String foneGeral;

	@Column(name = "sitio_web")
	private String sitioWeb;

	@Column(name = "nome_intradocs")
	private String nomeIntradocs;

	@Column(name = "observacoes")
	private String observacoes;

	@Column(name = "breve_descricao")
	private String breveDescricao;

	@Column(name = "orgao")
	private String orgao;

	@OneToOne
	@JoinColumn(name = "parte_de", referencedColumnName = "id")
	private int parteDe;

	@OneToMany(fetch = FetchType.EAGER, mappedBy = "entidade", cascade = { CascadeType.PERSIST, CascadeType.MERGE,
			CascadeType.DETACH, CascadeType.REFRESH })
	private List<Entidade> entidadesAssociadas = new ArrayList<>();

	public Entidade(int id, String nomeCurto, String nomeCompleto, TipoEntidade tipoEntidade, String tipoDePosto,
			String cidadeDoPosto, Boolean postoComAdidoAgricola, String emailInstitucional, String foneGeral,
			String sitioWeb, String nomeIntradocs, String observacoes, String breveDescricao, String orgao,
			int parteDe) {
		super();
		this.id = id;
		this.nomeCurto = nomeCurto;
		this.nomeCompleto = nomeCompleto;
		this.tipoEntidade = tipoEntidade;
		this.tipoDePosto = tipoDePosto;
		this.cidadeDoPosto = cidadeDoPosto;
		this.postoComAdidoAgricola = postoComAdidoAgricola;
		this.emailInstitucional = emailInstitucional;
		this.foneGeral = foneGeral;
		this.sitioWeb = sitioWeb;
		this.nomeIntradocs = nomeIntradocs;
		this.observacoes = observacoes;
		this.breveDescricao = breveDescricao;
		this.orgao = orgao;
		this.parteDe = parteDe;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNomeCurto() {
		return nomeCurto;
	}

	public void setNomeCurto(String nomeCurto) {
		this.nomeCurto = nomeCurto;
	}

	public String getNomeCompleto() {
		return nomeCompleto;
	}

	public void setNomeCompleto(String nomeCompleto) {
		this.nomeCompleto = nomeCompleto;
	}

	public TipoEntidade getTipoEntidade() {
		return tipoEntidade;
	}

	public void setTipoEntidade(TipoEntidade tipoEntidade) {
		this.tipoEntidade = tipoEntidade;
	}

	public String getTipoDePosto() {
		return tipoDePosto;
	}

	public void setTipoDePosto(String tipoDePosto) {
		this.tipoDePosto = tipoDePosto;
	}

	public String getCidadeDoPosto() {
		return cidadeDoPosto;
	}

	public void setCidadeDoPosto(String cidadeDoPosto) {
		this.cidadeDoPosto = cidadeDoPosto;
	}

	public Boolean getPostoComAdidoAgricola() {
		return postoComAdidoAgricola;
	}

	public void setPostoComAdidoAgricola(Boolean postoComAdidoAgricola) {
		this.postoComAdidoAgricola = postoComAdidoAgricola;
	}

	public String getEmailInstitucional() {
		return emailInstitucional;
	}

	public void setEmailInstitucional(String emailInstitucional) {
		this.emailInstitucional = emailInstitucional;
	}

	public String getFoneGeral() {
		return foneGeral;
	}

	public void setFoneGeral(String foneGeral) {
		this.foneGeral = foneGeral;
	}

	public String getSitioWeb() {
		return sitioWeb;
	}

	public void setSitioWeb(String sitioWeb) {
		this.sitioWeb = sitioWeb;
	}

	public String getNomeIntradocs() {
		return nomeIntradocs;
	}

	public void setNomeIntradocs(String nomeIntradocs) {
		this.nomeIntradocs = nomeIntradocs;
	}

	public String getObservacoes() {
		return observacoes;
	}

	public void setObservacoes(String observacoes) {
		this.observacoes = observacoes;
	}

	public String getBreveDescricao() {
		return breveDescricao;
	}

	public void setBreveDescricao(String breveDescricao) {
		this.breveDescricao = breveDescricao;
	}

	public String getOrgao() {
		return orgao;
	}

	public void setOrgao(String orgao) {
		this.orgao = orgao;
	}

	public int getParteDe() {
		return parteDe;
	}

	public void setParteDe(int parteDe) {
		this.parteDe = parteDe;
	}

	@Override
	public String toString() {
		return "Entidade [id=" + id + ", nomeCurto=" + nomeCurto + ", nomeCompleto=" + nomeCompleto + ", tipoEntidade="
				+ tipoEntidade + ", tipoDePosto=" + tipoDePosto + ", cidadeDoPosto=" + cidadeDoPosto
				+ ", postoComAdidoAgricola=" + postoComAdidoAgricola + ", emailInstitucional=" + emailInstitucional
				+ ", foneGeral=" + foneGeral + ", sitioWeb=" + sitioWeb + ", nomeIntradocs=" + nomeIntradocs
				+ ", observacoes=" + observacoes + ", breveDescricao=" + breveDescricao + ", orgao=" + orgao
				+ ", parteDe=" + parteDe + "]";
	}

}
