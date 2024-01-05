package com.mre.dpagro.portaldpagro.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.mre.dpagro.portaldpagro.entity.Documento;

import jakarta.persistence.EntityManager;

@Repository
public class DocumentoDaoImpl implements DocumentoDao {

	@Autowired
	private EntityManager entityManager;

	@Override
	public List<Documento> getDocumentos(int theSortField) {

		Session currentSession = entityManager.unwrap(Session.class);

		Query<Documento> theQuery = currentSession.createQuery("from Documento", Documento.class);

		List<Documento> documentos = theQuery.getResultList();

		return documentos;
	}

	@Override
	public void saveDocumento(Documento theDocumento) {

		Session currentSession = entityManager.unwrap(Session.class);

		currentSession.saveOrUpdate(theDocumento);

	}

	@Override
	public Documento getDocumento(int theId) {

		Session currentSession = entityManager.unwrap(Session.class);

		Documento theDocumento = currentSession.get(Documento.class, theId);

		return theDocumento;
	}

	@Override
	public void deleteDocumento(int theId) {
		Session currentSession = entityManager.unwrap(Session.class);

		Query theQuery = currentSession.createQuery("delete from Documento where id=:documentoId");
		theQuery.setParameter("documentoId", theId);

		theQuery.executeUpdate();
	}

	@Override
	public List<Documento> searchDocumentos(String theSearchName) {
		// TODO Auto-generated method stub
		return null;
	}

}
