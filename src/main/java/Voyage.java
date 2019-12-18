import java.math.BigDecimal;

public class Voyage {
	
	private Porte entree;
	private BigDecimal tarif;
	private Porte sortie;
	private CompagnieAutoroute autoroute;
	
	Voyage(Porte e, Porte s, CompagnieAutoroute c)
	{
		entree=e;
		sortie=s;
		autoroute=c;
	}
	
	public Porte getEntree() {
		return entree;
	}

	public void setEntree(Porte entree) {
		this.entree = entree;
	}

	public BigDecimal getTarif() {
		return tarif;
	}

	public void setTarif(BigDecimal tarif) {
		this.tarif = tarif;
	}

	public Porte getSortie() {
		return sortie;
	}

	public void setSortie(Porte sortie) {
		this.sortie = sortie;
	}

	public CompagnieAutoroute getAutoroute() {
		return autoroute;
	}

	public void setAutoroute(CompagnieAutoroute autoroute) {
		this.autoroute = autoroute;
	}


	


}
