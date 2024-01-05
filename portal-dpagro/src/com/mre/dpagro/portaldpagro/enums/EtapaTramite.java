package com.mre.dpagro.portaldpagro.enums;

public enum EtapaTramite {

	CONCLUÍDO("Concluído"), REVISAR_MINUTA("Revisar minuta e expedir ofício no e-docs"),
	FAZER_MINUTA("Fazer minuta de ofício no e-docs");

	private String etapaTramite;

	EtapaTramite(String etapaTramite) {
		this.etapaTramite = etapaTramite;
	}

	public String getEtapaTramite() {
		return etapaTramite;
	}

}
