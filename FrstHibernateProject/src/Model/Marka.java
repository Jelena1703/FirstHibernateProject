package Model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
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
	@ManyToMany
	private List<User> listaUsera = new ArrayList<User>();
	
	
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
	public List<User> getListaUsera() {
		return listaUsera;
	}
	public void setListaUsera(List<User> listaUsera) {
		this.listaUsera = listaUsera;
	}
	
	
	
}
