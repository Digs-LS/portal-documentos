package com.mre.dpagro.portaldpagro.config;

import org.springframework.context.annotation.Configuration;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.PersistenceUnit;

@Configuration
public class ConfigAgro {

	

    @PersistenceUnit
    private EntityManagerFactory emf;
    
    public EntityManager entityManager() {
    	return emf.createEntityManager();
    }
    
}
