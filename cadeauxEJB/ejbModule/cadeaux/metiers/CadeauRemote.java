package cadeaux.metiers;

import java.util.List;

import cadeaux.entities.Cadeau;
import cadeaux.entities.Fournisseur;

public interface CadeauRemote {

	Cadeau ajouterCadeau(String nom, Fournisseur f);
	List<Cadeau> listCadeaux();

}
