package entities;

import java.io.Serializable;
import java.lang.Long;
import java.lang.String;
import java.util.List;

import javax.persistence.*;


@Entity
@Table(name="T_FOURNISSEUR")
public class Fournisseur implements Serializable {

	   
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="FOUR_ID")
	private Long noFournisseur;
	private String nom;
	private String noTel;
	
	
 	private static final long serialVersionUID = 1L;

	public Fournisseur() {
		super();
	}   
	
	public Fournisseur(String nom, String noTel) {
		super();
		this.nom = nom;
		this.noTel = noTel;
	}

	public Long getNoFournisseur() {
		return this.noFournisseur;
	}

	public void setNoFournisseur(Long noFournisseur) {
		this.noFournisseur = noFournisseur;
	}   
	public String getNom() {
		return this.nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}   
	public String getNoTel() {
		return this.noTel;
	}

	public void setNoTel(String noTel) {
		this.noTel = noTel;
	}
   
}
