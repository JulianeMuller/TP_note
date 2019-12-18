import java.util.ArrayList;
import java.util.List;

public class Route {
	
	List<Porte> portes = new ArrayList<Porte>();
	
	Route()
	{
		
	}
	
	public void addPorte(Porte p)
	{
		portes.add(p);
		portes.sort(new OrdrePorteComparator());
	}
	
	public String toString()
	{
		return("La route est constituée de "+portes.size()+" portes.");
	}

}
