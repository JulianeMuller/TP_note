import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class CompagnieAutoroute {
	
	private List<Route> routes = new ArrayList<Route>();
	private List<Tarif> tarifs = new ArrayList<Tarif>();
	
	CompagnieAutoroute() 
	{
	
	}
	
	public BigDecimal obtenirTarif(Porte e, Porte s)
	{
		Tarif tarif = new Tarif(e,s,null);
		for (int i=0;i<tarifs.size();i++)
		{
			if((tarifs.get(i).getEntree()==e) && (tarifs.get(i).getSortie()==s))
			{
				tarif = getTarifExact(e,s);
			}
			
			else
			{
				tarif = getTarifCalcule(e,s);
			}
		}
		return tarif.getPrix();
	}
	
	private Tarif getTarifCalcule(Porte e, Porte s)
	{
		int min = e.getNumeroDePorte();
		int max = s.getNumeroDePorte();
		BigDecimal prix = new BigDecimal(0);
		for(Tarif t: tarifs)
		{
			if(t.getEntree().getNumeroDePorte()>= min && t.getSortie().getNumeroDePorte()<=max) {
				prix = prix.add(t.getPrix());
			}
			
		}
		return new Tarif(e,s,prix);
	}
	
	private Tarif getTarifExact(Porte e, Porte s)
	{
		for (int i=0;i<tarifs.size();i++)
		{
			if((tarifs.get(i).getEntree()==e) && (tarifs.get(i).getSortie()==s))
			{
				return tarifs.get(i);
			}
		}
		return null;
	}
	
	public void ajouterTarif(Tarif t)
	{
		tarifs.add(t);
	}
	
	public void ajouterRoute(Route r)
	{
		routes.add(r);
	}
	
	
	
	

}
