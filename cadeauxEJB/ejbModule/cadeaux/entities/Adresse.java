package cadeaux.entities;

import java.io.Serializable;
import java.lang.Integer;
import java.lang.Long;
import java.lang.String;
import javax.persistence.*;


@Entity
@Table(name="Adresses")
public class Adresse implements Serializable {

	   
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="ADR_ID")
	private Long codeAdr;
	private String rue;
	@Column(name="CODE_POSTAL")
	private Integer cp;
	private String ville;
	private static final long serialVersionUID = 1L;

	public Adresse() {
		super();
	}
	
	
	public Adresse(String rue, Integer cp, String ville) {
		super();
		this.rue = rue;
		this.cp = cp;
		this.ville = ville;
	}


	public Long getCodeAdr() {
		return this.codeAdr;
	}

	public void setCodeAdr(Long codeAdr) {
		this.codeAdr = codeAdr;
	}   
	public String getRue() {
		return this.rue;
	}

	public void setRue(String rue) {
		this.rue = rue;
	}   
	public Integer getCp() {
		return this.cp;
	}

	public void setCp(Integer cp) {
		this.cp = cp;
	}   
	public String getVille() {
		return this.ville;
	}

	public void setVille(String ville) {
		this.ville = ville;
	}


	@Override
	public String toString() {
		return "Adresse [codeAdr=" + codeAdr + ", rue=" + rue + ", cp=" + cp + ", ville=" + ville + "]";
	}
   
}