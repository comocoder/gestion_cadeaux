package metier;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import entities.*;

@Stateless(name="client")
public class ClientEJBImpl implements ClientRemote{

	@PersistenceContext
	EntityManager em;
	
	@Override
	public Client ajouterClient(String nom, String prenom, String tel, Adresse adr) {
		Client client = new Client(nom, prenom, tel, adr);
		em.persist(client);
		return client;
	}

	

}
