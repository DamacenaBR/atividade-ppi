package br.edu.fafic.persistence;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class JpaPersistence {
	private EntityManagerFactory emf = Persistence.createEntityManagerFactory("Exemplo_PU");
	private EntityManager em = emf.createEntityManager();
	
	public void getEm() {
		if(em == null || !em.isOpen()) {
			em = emf.createEntityManager();
		}
	}
	
}
