package com.mre.dpagro.portaldpagro.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "sifs")
public class Sif {

	@Id
	@Column(name = "sif")
	private String sif;

	@Column(name = "numero_sif")
	private int numero;

	@Column(name = "razao_social")
	private String razaoSocial;

	@Column(name = "cidade")
	private String cidade;

	@Column(name = "uf")
	private String uf;

	@Column(name = "status_atual")
	private String statusAtual;

	@Column(name = "categoria")
	private String categoria;

	@Column(name = "atividade")
	private String atividade;

	@Column(name = "capacidade_abate")
	private String capacidadeAbate;

	@OneToOne
	@JoinColumn(name = "entidade_id", referencedColumnName = "id")
	private Entidade entidadeId;

}
