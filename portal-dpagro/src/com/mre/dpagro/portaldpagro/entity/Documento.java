package com.mre.dpagro.portaldpagro.entity;

import java.time.LocalDateTime;

import com.mre.dpagro.portaldpagro.enums.Carater;
import com.mre.dpagro.portaldpagro.enums.Prioridade;
import com.mre.dpagro.portaldpagro.enums.TipoDocumento;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "documentos")
public class Documento {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private int id;

	@Column(name = "documento")
	private StringBuilder documento;

	@Column(name = "data_hora_entrada")
	private LocalDateTime dataHoraEntrada;

	@Column(name = "data_documento")
	private LocalDateTime dataDocumento;

	@Column(name = "tipo")
	private TipoDocumento tipo;

	@Column(name = "indice")
	private String indice;

	@Column(name = "prioridade")
	private Prioridade prioridade;

	@Column(name = "carater")
	private Carater carater;

	@Column(name = "resumo")
	private String resumo;

	@Column(name = "teor")
	private String teor;

	@Column(name = "corpo")
	private String corpo;

	@Column(name = "apenas_cumpre_instrucoes")
	private Boolean apenasCumpreInstrucoes;

	@Column(name = "observacoes")
	private String observacoes;

	@Column(name = "data_cadastro")
	private LocalDateTime dataCadastro;

	@Column(name = "data_ultima_alteracao")
	private LocalDateTime dataUltimaAlteracao;

	@OneToOne
	@JoinColumn(name = "processo_sei", referencedColumnName = "processo_sei")
	private ProcessoSei processoSei;

	@OneToOne
	@JoinColumn(name = "ultima_alteracao_por", referencedColumnName = "id")
	private Pessoa ultimaAlteracaoPor;

	@OneToOne
	@JoinColumn(name = "pessoa_cadastrante", referencedColumnName = "id")
	private Pessoa pessoaCadastrante;

	public Documento(int id, StringBuilder documento, LocalDateTime dataHoraEntrada, LocalDateTime dataDocumento,
			TipoDocumento tipo, String indice, Prioridade prioridade, Carater carater, String resumo, String teor,
			String corpo, Boolean apenasCumpreInstrucoes, String observacoes, LocalDateTime dataCadastro,
			LocalDateTime dataUltimaAlteracao, ProcessoSei processoSei, Pessoa ultimaAlteracaoPor,
			Pessoa pessoaCadastrante) {
		super();
		this.id = id;
		this.documento = documento;
		this.dataHoraEntrada = dataHoraEntrada;
		this.dataDocumento = dataDocumento;
		this.tipo = tipo;
		this.indice = indice;
		this.prioridade = prioridade;
		this.carater = carater;
		this.resumo = resumo;
		this.teor = teor;
		this.corpo = corpo;
		this.apenasCumpreInstrucoes = apenasCumpreInstrucoes;
		this.observacoes = observacoes;
		this.dataCadastro = dataCadastro;
		this.dataUltimaAlteracao = dataUltimaAlteracao;
		this.processoSei = processoSei;
		this.ultimaAlteracaoPor = ultimaAlteracaoPor;
		this.pessoaCadastrante = pessoaCadastrante;
	}

	public Documento() {
		// TODO Auto-generated constructor stub
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public StringBuilder getDocumento() {
		return documento;
	}

	public void setDocumento(StringBuilder documento) {
		this.documento = documento;
	}

	public LocalDateTime getDataHoraEntrada() {
		return dataHoraEntrada;
	}

	public void setDataHoraEntrada(LocalDateTime dataHoraEntrada) {
		this.dataHoraEntrada = dataHoraEntrada;
	}

	public LocalDateTime getDataDocumento() {
		return dataDocumento;
	}

	public void setDataDocumento(LocalDateTime dataDocumento) {
		this.dataDocumento = dataDocumento;
	}

	public TipoDocumento getTipo() {
		return tipo;
	}

	public void setTipo(TipoDocumento tipo) {
		this.tipo = tipo;
	}

	public String getIndice() {
		return indice;
	}

	public void setIndice(String indice) {
		this.indice = indice;
	}

	public Prioridade getPrioridade() {
		return prioridade;
	}

	public void setPrioridade(Prioridade prioridade) {
		this.prioridade = prioridade;
	}

	public Carater getCarater() {
		return carater;
	}

	public void setCarater(Carater carater) {
		this.carater = carater;
	}

	public String getResumo() {
		return resumo;
	}

	public void setResumo(String resumo) {
		this.resumo = resumo;
	}

	public String getTeor() {
		return teor;
	}

	public void setTeor(String teor) {
		this.teor = teor;
	}

	public String getCorpo() {
		return corpo;
	}

	public void setCorpo(String corpo) {
		this.corpo = corpo;
	}

	public Boolean getApenasCumpreInstrucoes() {
		return apenasCumpreInstrucoes;
	}

	public void setApenasCumpreInstrucoes(Boolean apenasCumpreInstrucoes) {
		this.apenasCumpreInstrucoes = apenasCumpreInstrucoes;
	}

	public String getObservacoes() {
		return observacoes;
	}

	public void setObservacoes(String observacoes) {
		this.observacoes = observacoes;
	}

	public LocalDateTime getDataCadastro() {
		return dataCadastro;
	}

	public void setDataCadastro(LocalDateTime dataCadastro) {
		this.dataCadastro = dataCadastro;
	}

	public LocalDateTime getDataUltimaAlteracao() {
		return dataUltimaAlteracao;
	}

	public void setDataUltimaAlteracao(LocalDateTime dataUltimaAlteracao) {
		this.dataUltimaAlteracao = dataUltimaAlteracao;
	}

	public ProcessoSei getProcessoSei() {
		return processoSei;
	}

	public void setProcessoSei(ProcessoSei processoSei) {
		this.processoSei = processoSei;
	}

	public Pessoa getUltimaAlteracaoPor() {
		return ultimaAlteracaoPor;
	}

	public void setUltimaAlteracaoPor(Pessoa ultimaAlteracaoPor) {
		this.ultimaAlteracaoPor = ultimaAlteracaoPor;
	}

	public Pessoa getPessoaCadastrante() {
		return pessoaCadastrante;
	}

	public void setPessoaCadastrante(Pessoa pessoaCadastrante) {
		this.pessoaCadastrante = pessoaCadastrante;
	}

	@Override
	public String toString() {
		return "Documento [id=" + id + ", documento=" + documento + ", dataHoraEntrada=" + dataHoraEntrada
				+ ", dataDocumento=" + dataDocumento + "tipo=" + tipo + ", ano=" + ", indice=" + indice
				+ ", prioridade=" + prioridade + ", carater=" + carater + ", resumo=" + resumo + ", teor=" + teor
				+ ", corpo=" + corpo + ", apenasCumpreInstrucoes=" + apenasCumpreInstrucoes + ", observacoes="
				+ observacoes + ", dataCadastro=" + dataCadastro + ", dataUltimaAlteracao=" + dataUltimaAlteracao
				+ ", processoSei=" + processoSei + ", ultimaAlteracaoPor=" + ultimaAlteracaoPor + ", pessoaCadastrante="
				+ pessoaCadastrante + "]";
	}

}
