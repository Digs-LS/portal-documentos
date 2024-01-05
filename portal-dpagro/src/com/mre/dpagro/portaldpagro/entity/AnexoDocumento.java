package com.mre.dpagro.portaldpagro.entity;

import java.time.LocalDateTime;

import com.mre.dpagro.portaldpagro.enums.TipoDocumento;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "anexos_documentos")
public class AnexoDocumento {

	@Id
	@Column(name = "id")
	private int id;

	@OneToOne
	@JoinColumn(name = "id_documento", referencedColumnName = "id")
	private Documento idDocumento;

	@Column(name = "descricao_documento")
	private String descricaoDocumento;

	@Column(name = "nome_arquivo_anexo")
	private String nomeArquivoAnexo;

	@Column(name = "tipo_documento")
	private TipoDocumento tipoDocumento;

	@Column(name = "pasta")
	private String pasta;

	@Column(name = "numero_doc")
	private int numeroDoc;

	@Column(name = "deposito_anexo")
	private String depositoAnexo;

	@Column(name = "indice")
	private String indice;

	@Column(name = "data_cadastro")
	private LocalDateTime dataCadastro;

	public AnexoDocumento(int id, Documento idDocumento, String descricaoDocumento, String nomeArquivoAnexo,
			TipoDocumento tipoDocumento, String pasta, int numeroDoc, String depositoAnexo, String indice,
			LocalDateTime dataCadastro) {
		super();
		this.id = id;
		this.idDocumento = idDocumento;
		this.descricaoDocumento = descricaoDocumento;
		this.nomeArquivoAnexo = nomeArquivoAnexo;
		this.tipoDocumento = tipoDocumento;
		this.pasta = pasta;
		this.numeroDoc = numeroDoc;
		this.depositoAnexo = depositoAnexo;
		this.indice = indice;
		this.dataCadastro = dataCadastro;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Documento getIdDocumento() {
		return idDocumento;
	}

	public void setIdDocumento(Documento idDocumento) {
		this.idDocumento = idDocumento;
	}

	public String getDescricaoDocumento() {
		return descricaoDocumento;
	}

	public void setDescricaoDocumento(String descricaoDocumento) {
		this.descricaoDocumento = descricaoDocumento;
	}

	public String getNomeArquivoAnexo() {
		return nomeArquivoAnexo;
	}

	public void setNomeArquivoAnexo(String nomeArquivoAnexo) {
		this.nomeArquivoAnexo = nomeArquivoAnexo;
	}

	public TipoDocumento getTipoDocumento() {
		return tipoDocumento;
	}

	public void setTipoDocumento(TipoDocumento tipoDocumento) {
		this.tipoDocumento = tipoDocumento;
	}

	public String getPasta() {
		return pasta;
	}

	public void setPasta(String pasta) {
		this.pasta = pasta;
	}

	public int getNumeroDoc() {
		return numeroDoc;
	}

	public void setNumeroDoc(int numeroDoc) {
		this.numeroDoc = numeroDoc;
	}

	public String getDepositoAnexo() {
		return depositoAnexo;
	}

	public void setDepositoAnexo(String depositoAnexo) {
		this.depositoAnexo = depositoAnexo;
	}

	public String getIndice() {
		return indice;
	}

	public void setIndice(String indice) {
		this.indice = indice;
	}

	public LocalDateTime getDataCadastro() {
		return dataCadastro;
	}

	public void setDataCadastro(LocalDateTime dataCadastro) {
		this.dataCadastro = dataCadastro;
	}

	@Override
	public String toString() {
		return "AnexoDocumento [id=" + id + ", idDocumento=" + idDocumento + ", descricaoDocumento="
				+ descricaoDocumento + ", nomeArquivoAnexo=" + nomeArquivoAnexo + ", tipoDocumento=" + tipoDocumento
				+ ", pasta=" + pasta + ", numeroDoc=" + numeroDoc + ", depositoAnexo=" + depositoAnexo + ", indice="
				+ indice + ", dataCadastro=" + dataCadastro + "]";
	}

}
