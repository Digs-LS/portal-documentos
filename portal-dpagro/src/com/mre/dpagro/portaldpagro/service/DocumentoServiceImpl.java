package com.mre.dpagro.portaldpagro.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.mre.dpagro.portaldpagro.dao.DocumentoDao;
import com.mre.dpagro.portaldpagro.entity.Documento;

@Service
public class DocumentoServiceImpl implements DocumentoService {

	@Autowired
	private DocumentoDao documentoDao;

	@Override
	@Transactional
	public List<Documento> getDocumentos(int theSortField) {
		return documentoDao.getDocumentos(theSortField);
	}

	@Override
	@Transactional
	public void saveDocumento(Documento theDocumento) {
		documentoDao.saveDocumento(theDocumento);
	}

	@Override
	@Transactional
	public Documento getDocumento(int theId) {
		return documentoDao.getDocumento(theId);
	}

	@Override
	@Transactional
	public void deleteDocumento(int theId) {
		documentoDao.deleteDocumento(theId);
	}

	@Override
	@Transactional
	public List<Documento> searchDocumentos(String theSearchName) {
		return documentoDao.searchDocumentos(theSearchName);
	}
}
