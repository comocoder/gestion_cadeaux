package entities;

import java.io.Serializable;
import java.lang.Long;
import java.lang.String;
import javax.persistence.*;


@Entity
@Table(name="T_CADEAU")
public class Cadeau implements Serializable {

	   
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="CAD_ID")
	private Long noCadeau;
	@Column(name="CAD_NOM")
	private String nomCadeau;
	
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name="FOUR_ID_FK", nullable = false)
	private Fournisseur fourn;
	private static final long serialVersionUID = 1L;

	public Cadeau() {
		super();
	}   
	
	public Cadeau(String nomCadeau, Fournisseur fourn) {
		super();
		this.nomCadeau = nomCadeau;
		this.fourn = fourn;
	}

	public Long getNoCadeau() {
		return this.noCadeau;
	}

	public void setNoCadeau(Long noCadeau) {
		this.noCadeau = noCadeau;
	}   
	public String getNomCadeau() {
		return this.nomCadeau;
	}

	public void setNomCadeau(String nomCadeau) {
		this.nomCadeau = nomCadeau;
	}
   
}
