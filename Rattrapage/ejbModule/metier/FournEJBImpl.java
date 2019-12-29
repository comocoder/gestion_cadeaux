package metier;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import entities.Fournisseur;

@Stateless(name="fournisseur")
public class FournEJBImpl implements FournRemote {

	@PersistenceContext
	EntityManager em;
	
	@Override
	public Fournisseur ajouterFournisseur(String nom, String tel) {
		Fournisseur four = new Fournisseur(nom, tel);
		em.persist(four);
		return four;
	}

}
