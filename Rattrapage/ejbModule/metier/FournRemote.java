package metier;

import javax.ejb.Remote;

import entities.Fournisseur;

@Remote
public interface FournRemote {
	public Fournisseur ajouterFournisseur(String nom, String tel);
}
