package metier;

import javax.ejb.Remote;

import entities.Adresse;
import entities.Client;


@Remote
public interface ClientRemote {
	public Client ajouterClient(String nom, String prenom, String tel, Adresse adr);
}
