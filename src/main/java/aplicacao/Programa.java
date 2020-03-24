package aplicacao;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.EntityManager;

import dominio.Pessoa;

public class Programa {

	public static void main(String[] args) {

		Pessoa p1 = new Pessoa(null, "Andreson", "andresonjazz@gmail.com");
		Pessoa p2 = new Pessoa(null, "Loide", "loideangelim@gmail.com");
		Pessoa p3 = new Pessoa(null, "Vagdon", "vagdon@gmail.com");
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("exemplo-jpa");
		EntityManager em = emf.createEntityManager();
		em.getTransaction().begin();
		em.persist(p1);
		em.persist(p2);
		em.persist(p3);
		em.getTransaction().commit();
		System.out.println("Pronto!");
	}

}
