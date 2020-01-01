package cadeaux.metiers;

import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import cadeaux.entities.Fournisseur;

@Stateless(name="fournisseur")
public class FournisseurEJB implements FournisseurRemote {

	@PersistenceContext
	EntityManager em;
	
	@Override
	public Fournisseur ajouterFournisseur(String nom, String tel) {
		Fournisseur four = new Fournisseur(nom, tel);
		em.persist(four);
		return four;
	}

	@Override
	public List<Fournisseur> listFournisseur() {
		List<Fournisseur> fournisseurs = em.createQuery("SELECT f FROM Fournisseur f").getResultList();
		return fournisseurs;
	}

}