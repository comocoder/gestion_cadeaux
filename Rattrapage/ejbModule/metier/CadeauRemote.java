package metier;

import javax.ejb.Remote;

import entities.Cadeau;
import entities.Fournisseur;

@Remote
public interface CadeauRemote {
	public Cadeau ajouterCadeau(String nom, Fournisseur four);
}
