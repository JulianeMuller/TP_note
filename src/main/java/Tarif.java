import java.math.BigDecimal;
import java.time.LocalDateTime;

public class Tarif {
	
	private Porte entree;
	private Porte sortie;
	private LocalDateTime dateValidite;
	private BigDecimal prix;
	
	
	Tarif(Porte e, Porte s, BigDecimal p) //e l'entrée, s la sortie et p le prix
	{
		entree = e;
		sortie = s;
		prix = p;
	}
	
	
	public Porte getSortie() {
		return sortie;
	}

	public void setSortie(Porte sortie) {
		this.sortie = sortie;
	}

	public LocalDateTime getDateValidite() {
		return dateValidite;
	}

	public void setDateValidite(LocalDateTime dateValidite) {
		this.dateValidite = dateValidite;
	}

	public BigDecimal getPrix() {
		return prix;
	}

	public void setPrix(BigDecimal prix) {
		this.prix = prix;
	}
	
	
	public Porte getEntree() {
		return entree;
	}

	public void setEntree(Porte entree) {
		this.entree = entree;
	}
	
	
	
	public String toString()
	{
		return("Le tarif de la porte "+ getEntree().getNumeroDePorte()+" à la porte "+getSortie().getNumeroDePorte()+"est de "+getPrix()+" €.");
	}


	
	

}
