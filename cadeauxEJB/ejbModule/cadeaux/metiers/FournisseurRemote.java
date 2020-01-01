package cadeaux.metiers;

import java.util.List;

import javax.ejb.Remote;

import cadeaux.entities.Fournisseur;

@Remote
public interface FournisseurRemote {

	Fournisseur ajouterFournisseur(String nom, String tel);
	List<Fournisseur> listFournisseur();

}
