package cadeaux.entities;

import java.io.Serializable;
import java.lang.Long;
import java.lang.String;
import javax.persistence.*;


@Entity
@Table(name="Clients")
public class Client implements Serializable {

	   
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="CLI_ID")
	private Long noClient;
	private String nom;
	private String prenom;
	private String tel;
	
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name="ADR_ID_FK", nullable = false)
	private Adresse adresse;
	private static final long serialVersionUID = 1L;

	public Client() {
		super();
	}  
	
	
	public Client(String nom, String prenom, String tel, Adresse adresse) {
		super();
		this.nom = nom;
		this.prenom = prenom;
		this.tel = tel;
		this.adresse = adresse;
	}


	public Long getNoClient() {
		return this.noClient;
	}

	public void setNoClient(Long noClient) {
		this.noClient = noClient;
	}   
	public String getNom() {
		return this.nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}   
	public String getPrenom() {
		return this.prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}   
	public String getTel() {
		return this.tel;
	}

	public void setTel(String tel) {
		this.tel = tel;
	}


	public Adresse getAdresse() {
		return adresse;
	}


	public void setAdresse(Adresse adresse) {
		this.adresse = adresse;
	}


	@Override
	public String toString() {
		return "Client [noClient=" + noClient + ", nom=" + nom + ", prenom=" + prenom + ", tel=" + tel + ", adresse="
				+ adresse + "]";
	}   
}