package metier;

import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import entities.Adresse;
import entities.Cadeau;
import entities.Client;
import entities.Commande;

@Stateless(name="commande")
public class CommandeEJBImpl implements CommandeRemote {

	@PersistenceContext
	EntityManager em;
	@Override
	public Commande commanderCadeau(Adresse codeAdr, Cadeau noCadeau, Client noClient, List<Cadeau> cadeaux,
			boolean delivre) {
		Commande c = new Commande(codeAdr, noCadeau, noClient, cadeaux, delivre);
		return null;
	}

}
