package metier;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import entities.Cadeau;
import entities.Fournisseur;

@Stateless(name="cadeau")
public class CadeauEJBImpl implements CadeauRemote {

	@PersistenceContext
	EntityManager em;
	
	@Override
	public Cadeau ajouterCadeau(String nom, Fournisseur f) {
		Cadeau c = new Cadeau(nom, f);
		em.persist(c);
		return c;
	}
	
}
