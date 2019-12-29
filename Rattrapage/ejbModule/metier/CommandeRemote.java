package metier;

import java.util.List;
import javax.ejb.Remote;
import entities.Adresse;
import entities.Cadeau;
import entities.Client;
import entities.Commande;

@Remote
public interface CommandeRemote {
	public Commande commanderCadeau(Adresse codeAdr, Cadeau noCadeau, Client noClient, List<Cadeau> cadeaux, boolean delivre);
}
