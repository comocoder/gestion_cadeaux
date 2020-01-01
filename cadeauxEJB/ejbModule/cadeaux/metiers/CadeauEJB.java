package cadeaux.metiers;

import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import cadeaux.entities.Cadeau;
import cadeaux.entities.Fournisseur;

@Stateless(name="cadeau")
public class CadeauEJB implements CadeauRemote {

	@PersistenceContext
	EntityManager em;
	
	@Override
	public Cadeau ajouterCadeau(String nom, Fournisseur f) {
		Cadeau c = new Cadeau(nom, f);
		em.persist(c);
		return c;
	}

	@Override
	public List<Cadeau> listCadeaux() {
		List<Cadeau> cadeaux = em.createQuery("SELCET c FROM Cadeau c").getResultList();
		return cadeaux;
	}
	
}