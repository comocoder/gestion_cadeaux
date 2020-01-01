package cadeaux.metiers;

import java.util.List;

import javax.ejb.Remote;

import cadeaux.entities.Adresse;
import cadeaux.entities.Client;

@Remote
public interface ClientRemote {

	Client ajouterClient(String nom, String prenom, String tel, Adresse adr);
	List<Client> listClients();

}
