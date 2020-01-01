package cadeaux.metiers;

import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import cadeaux.entities.Adresse;
import cadeaux.entities.Cadeau;
import cadeaux.entities.Client;
import cadeaux.entities.Commande;

@Stateless(name="commande")
public class CommandeEJB  implements CommandeRemote {

	@PersistenceContext
	EntityManager em;
	@Override
	public Commande commanderCadeau(Adresse codeAdr, Cadeau noCadeau, Client noClient, List<Cadeau> cadeaux,
			boolean delivre) {
		Commande c = new Commande(codeAdr, noCadeau, noClient, cadeaux, delivre);
		return null;
	}

}