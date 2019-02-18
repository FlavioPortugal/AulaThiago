package br.com.fiap.teste;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import br.com.fiap.entity.Pastel;

public class RefreshTeste {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		EntityManagerFactory fabrica = 
				Persistence.createEntityManagerFactory("CLIENTE_ORACLE");
				
		EntityManager em = fabrica.createEntityManager();
		
		
		Pastel pastel = em.find(Pastel.class,1);
		System.out.println(pastel.getSabor());		
		pastel.setSabor("Pizza");		
		System.out.println(pastel.getCodigo());
		em.refresh(pastel);	
		
		fabrica.close();
		em.close();

	}

}
