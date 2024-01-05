package com.mre.dpagro.portaldpagro.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "processos_sei")
public class ProcessoSei {

	@Id
	@Column(name = "processo_sei")
	private String processoSei;

	@Column(name = "indice_processo")
	private String indiceProcesso;

	public ProcessoSei(String processoSei, String indiceProcesso) {
		super();
		this.processoSei = processoSei;
		this.indiceProcesso = indiceProcesso;
	}

	public String getProcessoSei() {
		return processoSei;
	}

	public void setProcessoSei(String processoSei) {
		this.processoSei = processoSei;
	}

	public String getIndiceProcesso() {
		return indiceProcesso;
	}

	public void setIndiceProcesso(String indiceProcesso) {
		this.indiceProcesso = indiceProcesso;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString();
	}

}
