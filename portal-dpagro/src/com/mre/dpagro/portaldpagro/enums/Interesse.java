package com.mre.dpagro.portaldpagro.enums;

public enum Interesse {
	CERTIFICADO("Certificado/requisitos em negociação (CSIs/CVIs/CZIs/ARPs)"), HABILITACAO("Habilitações de SIFs"),
	NOTIFICACAO("Notificações (Não-conformidades)"), MISSAO("Missões de Inspeção"), OUTRO("Outro");

	private String interesse;

	Interesse(String interesse) {
		this.interesse = interesse;
	}

	public String getInteresse() {
		return interesse;
	}
}
