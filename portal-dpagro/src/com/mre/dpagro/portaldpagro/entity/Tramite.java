package com.mre.dpagro.portaldpagro.entity;

import java.time.LocalDateTime;

import com.mre.dpagro.portaldpagro.enums.EtapaTramite;
import com.mre.dpagro.portaldpagro.enums.Instrucao;
import com.mre.dpagro.portaldpagro.enums.Prioridade;
import com.mre.dpagro.portaldpagro.enums.Progresso;
import com.mre.dpagro.portaldpagro.enums.TipoTramite;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "tramites")
public class Tramite {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private int id;

	@Column(name = "data_hora_abertura")
	private LocalDateTime dataHoraAbertura;

	@Column(name = "data_hora_conclusao")
	private LocalDateTime dataHoraConclusao;

	@Column(name = "progresso")
	private Progresso progresso;

	@Column(name = "numero_expediente_edocs")
	private String numeroExpedienteEdocs;

	@Column(name = "link_expediente_edocs")
	private String linkExpedienteEdocs;

	@Column(name = "observacoes")
	private String observacoes;

	@Column(name = "etapa")
	private EtapaTramite etapa;

	@Column(name = "prioridade")
	private Prioridade prioridade;

	@Column(name = "instrucao")
	private Instrucao instrucao;

	@Column(name = "indice")
	private String indice;

	@Column(name = "minuta_de_corpo")
	private String minutaCorpo;

	@Column(name = "tipo")
	private TipoTramite tipo;

	@OneToOne
	@JoinColumn(name = "documento_id", referencedColumnName = "id")
	private Documento documentoId;

	@OneToOne
	@JoinColumn(name = "criado_por", referencedColumnName = "id")
	private Pessoa criadoPor;

	@OneToOne
	@JoinColumn(name = "tramitado_por", referencedColumnName = "id")
	private Pessoa tramitadoPor;

	@OneToOne
	@JoinColumn(name = "concluido_por", referencedColumnName = "id")
	private Pessoa concluidoPor;

	@OneToOne
	@JoinColumn(name = "atribuicao_desk", referencedColumnName = "id")
	private Pessoa atribuicaoDesk;

	@Column(name = "emails_destinatarios")
	private String emailsDestinatarios;

	@Column(name = "emails_cc_destinatarios")
	private String emailsCcDestinatarios;

	public Tramite(int id, LocalDateTime dataHoraAbertura, LocalDateTime dataHoraConclusao, Progresso progresso,
			String numeroExpedienteEdocs, String linkExpedienteEdocs, String observacoes, EtapaTramite etapa,
			Prioridade prioridade, Instrucao instrucao, String indice, String minutaCorpo, TipoTramite tipo,
			Documento documentoId, Pessoa criadoPor, Pessoa tramitadoPor, Pessoa concluidoPor, Pessoa atribuicaoDesk,
			String emailsDestinatarios, String emailsCcDestinatarios) {
		super();
		this.id = id;
		this.dataHoraAbertura = dataHoraAbertura;
		this.dataHoraConclusao = dataHoraConclusao;
		this.progresso = progresso;
		this.numeroExpedienteEdocs = numeroExpedienteEdocs;
		this.linkExpedienteEdocs = linkExpedienteEdocs;
		this.observacoes = observacoes;
		this.etapa = etapa;
		this.prioridade = prioridade;
		this.instrucao = instrucao;
		this.indice = indice;
		this.minutaCorpo = minutaCorpo;
		this.tipo = tipo;
		this.documentoId = documentoId;
		this.criadoPor = criadoPor;
		this.tramitadoPor = tramitadoPor;
		this.concluidoPor = concluidoPor;
		this.atribuicaoDesk = atribuicaoDesk;
		this.emailsDestinatarios = emailsDestinatarios;
		this.emailsCcDestinatarios = emailsCcDestinatarios;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public LocalDateTime getDataHoraAbertura() {
		return dataHoraAbertura;
	}

	public void setDataHoraAbertura(LocalDateTime dataHoraAbertura) {
		this.dataHoraAbertura = dataHoraAbertura;
	}

	public LocalDateTime getDataHoraConclusao() {
		return dataHoraConclusao;
	}

	public void setDataHoraConclusao(LocalDateTime dataHoraConclusao) {
		this.dataHoraConclusao = dataHoraConclusao;
	}

	public Progresso getProgresso() {
		return progresso;
	}

	public void setProgresso(Progresso progresso) {
		this.progresso = progresso;
	}

	public String getNumeroExpedienteEdocs() {
		return numeroExpedienteEdocs;
	}

	public void setNumeroExpedienteEdocs(String numeroExpedienteEdocs) {
		this.numeroExpedienteEdocs = numeroExpedienteEdocs;
	}

	public String getLinkExpedienteEdocs() {
		return linkExpedienteEdocs;
	}

	public void setLinkExpedienteEdocs(String linkExpedienteEdocs) {
		this.linkExpedienteEdocs = linkExpedienteEdocs;
	}

	public String getObservacoes() {
		return observacoes;
	}

	public void setObservacoes(String observacoes) {
		this.observacoes = observacoes;
	}

	public EtapaTramite getEtapa() {
		return etapa;
	}

	public void setEtapa(EtapaTramite etapa) {
		this.etapa = etapa;
	}

	public Prioridade getPrioridade() {
		return prioridade;
	}

	public void setPrioridade(Prioridade prioridade) {
		this.prioridade = prioridade;
	}

	public Instrucao getInstrucao() {
		return instrucao;
	}

	public void setInstrucao(Instrucao instrucao) {
		this.instrucao = instrucao;
	}

	public String getIndice() {
		return indice;
	}

	public void setIndice(String indice) {
		this.indice = indice;
	}

	public String getMinutaCorpo() {
		return minutaCorpo;
	}

	public void setMinutaCorpo(String minutaCorpo) {
		this.minutaCorpo = minutaCorpo;
	}

	public TipoTramite getTipo() {
		return tipo;
	}

	public void setTipo(TipoTramite tipo) {
		this.tipo = tipo;
	}

	public Documento getDocumentoId() {
		return documentoId;
	}

	public void setDocumentoId(Documento documentoId) {
		this.documentoId = documentoId;
	}

	public Pessoa getCriadoPor() {
		return criadoPor;
	}

	public void setCriadoPor(Pessoa criadoPor) {
		this.criadoPor = criadoPor;
	}

	public Pessoa getTramitadoPor() {
		return tramitadoPor;
	}

	public void setTramitadoPor(Pessoa tramitadoPor) {
		this.tramitadoPor = tramitadoPor;
	}

	public Pessoa getConcluidoPor() {
		return concluidoPor;
	}

	public void setConcluidoPor(Pessoa concluidoPor) {
		this.concluidoPor = concluidoPor;
	}

	public Pessoa getAtribuicaoDesk() {
		return atribuicaoDesk;
	}

	public void setAtribuicaoDesk(Pessoa atribuicaoDesk) {
		this.atribuicaoDesk = atribuicaoDesk;
	}

	public String getEmailsDestinatarios() {
		return emailsDestinatarios;
	}

	public void setEmailsDestinatarios(String emailsDestinatarios) {
		this.emailsDestinatarios = emailsDestinatarios;
	}

	public String getEmailsCcDestinatarios() {
		return emailsCcDestinatarios;
	}

	public void setEmailsCcDestinatarios(String emailsCcDestinatarios) {
		this.emailsCcDestinatarios = emailsCcDestinatarios;
	}

	@Override
	public String toString() {
		return "Tramite [id=" + id + ", dataHoraAbertura=" + dataHoraAbertura + ", dataHoraConclusao="
				+ dataHoraConclusao + ", progresso=" + progresso + ", numeroExpedienteEdocs=" + numeroExpedienteEdocs
				+ ", linkExpedienteEdocs=" + linkExpedienteEdocs + ", observacoes=" + observacoes + ", etapa=" + etapa
				+ ", prioridade=" + prioridade + ", instrucao=" + instrucao + ", indice=" + indice + ", minutaCorpo="
				+ minutaCorpo + ", tipo=" + tipo + ", documentoId=" + documentoId + ", criadoPor=" + criadoPor
				+ ", tramitadoPor=" + tramitadoPor + ", concluidoPor=" + concluidoPor + ", atribuicaoDesk="
				+ atribuicaoDesk + ", emailsDestinatarios=" + emailsDestinatarios + ", emailsCcDestinatarios="
				+ emailsCcDestinatarios + "]";
	}

}
