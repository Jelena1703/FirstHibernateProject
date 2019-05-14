package Model;

import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name= "moja_tabela_marki")
public class Marka {
	
	@Id  // Primaty key
    @GeneratedValue (strategy  = GenerationType.IDENTITY) // auto_inkrement
    @Column (name = "id_marke")
	private int idMarke;
	@Column (name = "naziv_marke")
	private String nazivMarke;
	
	@Embedded
    private Adresa adresa;
	@ManyToOne
	private User user;
	
	
	public int getIdMarke() {
		return idMarke;
	}
	public void setIdMarke(int idMarke) {
		this.idMarke = idMarke;
	}
	public String getNazivMarke() {
		return nazivMarke;
	}
	public void setNazivMarke(String nazivMarke) {
		this.nazivMarke = nazivMarke;
	}
	public Adresa getAdresa() {
		return adresa;
	}
	public void setAdresa(Adresa adresa) {
		this.adresa = adresa;
	}
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	
	
}
