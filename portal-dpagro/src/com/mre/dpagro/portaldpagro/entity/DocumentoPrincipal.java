package com.mre.dpagro.portaldpagro.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "documentos_principais")
public class DocumentoPrincipal {

	@OneToOne
	@JoinColumn(name = "id_documento", referencedColumnName = "id")
	private Documento documento;

	@Column(name = "descricao_documento")
	private String descricaoDocumento;

	@Column(name = "pasta")
	private String pasta;

	public DocumentoPrincipal(Documento documento, String descricaoDocumento, String pasta) {
		super();
		this.documento = documento;
		this.descricaoDocumento = descricaoDocumento;
		this.pasta = pasta;
	}

	public Documento getDocumento() {
		return documento;
	}

	public void setDocumento(Documento documento) {
		this.documento = documento;
	}

	public String getDescricaoDocumento() {
		return descricaoDocumento;
	}

	public void setDescricaoDocumento(String descricaoDocumento) {
		this.descricaoDocumento = descricaoDocumento;
	}

	public String getPasta() {
		return pasta;
	}

	public void setPasta(String pasta) {
		this.pasta = pasta;
	}

	@Override
	public String toString() {
		return "DocumentoPrincipal [documento=" + documento + ", descricaoDocumento=" + descricaoDocumento + ", pasta="
				+ pasta + "]";
	}

}
