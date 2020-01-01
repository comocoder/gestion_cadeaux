package cadeaux.metiers;

import java.util.List;

import javax.ejb.Remote;

import cadeaux.entities.Adresse;
import cadeaux.entities.Cadeau;
import cadeaux.entities.Client;
import cadeaux.entities.Commande;

@Remote
public interface CommandeRemote {

	Commande commanderCadeau(Adresse codeAdr, Cadeau noCadeau, Client noClient, List<Cadeau> cadeaux, boolean delivre);

}
