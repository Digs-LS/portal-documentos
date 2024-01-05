package com.mre.dpagro.portaldpagro.service;

import java.util.List;

import com.mre.dpagro.portaldpagro.entity.Documento;

public interface DocumentoService {

	public List<Documento> getDocumentos(int theSortField);

	public void saveDocumento(Documento theDocumento);

	public Documento getDocumento(int theId);

	public void deleteDocumento(int theId);

	public List<Documento> searchDocumentos(String theSearchName);

}
