package cadeaux.entities;

import java.io.Serializable;
import java.lang.Long;
import java.lang.String;
import java.util.List;

import javax.persistence.*;


@Entity
@Table(name="Commandes")
public class Commande implements Serializable {

	   
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="COM_ID")
	private Long noCommande;
	
	@ManyToOne
	@JoinColumn(name="ADR_ID_FK")
	private Adresse codeAdr;
	
	@ManyToOne
	@JoinColumn(name="CAD_ID_FK")
	private Cadeau noCadeau;
	
	@ManyToOne
	@JoinColumn(name="CLI_ID_FK", nullable= false)
	private Client noCLient;
	
	@OneToMany
	private List<Cadeau> cadeaux;
	
	@Column(name="STATUT_DELIVRE")
	private boolean delivre;
	private static final long serialVersionUID = 1L;

	public Commande() {
		super();
	}  
	
	public Commande(Adresse codeAdr, Cadeau noCadeau, Client noCLient, List<Cadeau> cadeaux, boolean delivre) {
		super();
		this.codeAdr = codeAdr;
		this.noCadeau = noCadeau;
		this.noCLient = noCLient;
		this.cadeaux = cadeaux;
		this.delivre = delivre;
	}

	public Long getNoCommande() {
		return this.noCommande;
	}

	public void setNoCommande(Long noCommande) {
		this.noCommande = noCommande;
	}
	public Adresse getCodeAdr() {
		return codeAdr;
	}
	public void setCodeAdr(Adresse codeAdr) {
		this.codeAdr = codeAdr;
	}
	public Cadeau getNoCadeau() {
		return noCadeau;
	}
	public void setNoCadeau(Cadeau noCadeau) {
		this.noCadeau = noCadeau;
	}
	public Client getNoCLient() {
		return noCLient;
	}
	public void setNoCLient(Client noCLient) {
		this.noCLient = noCLient;
	}

	public List<Cadeau> getCadeaux() {
		return cadeaux;
	}

	public void setCadeaux(List<Cadeau> cadeaux) {
		this.cadeaux = cadeaux;
	}

	public boolean isDelivre() {
		return delivre;
	}

	public void setDelivre(boolean delivre) {
		this.delivre = delivre;
	}

	@Override
	public String toString() {
		return "Commande [noCommande=" + noCommande + ", codeAdr=" + codeAdr + ", noCadeau=" + noCadeau + ", noCLient="
				+ noCLient + ", cadeaux=" + cadeaux + ", delivre=" + delivre + "]";
	}   
   
}