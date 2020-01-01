package cadeaux.metiers;

import java.util.ArrayList;
import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import cadeaux.entities.Adresse;
import cadeaux.entities.Client;

@Stateless(name="client")
public class ClientEJB implements ClientRemote{

	@PersistenceContext
	EntityManager em;
	
	@Override
	public Client ajouterClient(String nom, String prenom, String tel, Adresse adr) {
		Client client = new Client(nom, prenom, tel, adr);
		em.persist(client);
		return client;
	}

	@Override
	public List<Client> listClients() {
		List<Client> clients = em.createQuery("Select c from Client", Client.class).getResultList();
		clients.forEach(System.out::println);
		return clients;
	}

	

}