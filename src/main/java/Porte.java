
public class Porte {
	
	private Integer numeroDePorte;
	
	Porte (Integer n) //n pour le num�ro de porte
	{
		numeroDePorte = n;
	}

	
	public Integer getNumeroDePorte() {
		return numeroDePorte;
	}

	public void setNumeroDePorte(Integer numeroDePorte) {
		this.numeroDePorte = numeroDePorte;
	}


	/*public boolean equals(Object o)
	{
		
	}
	
	public int hashCode()
	{
		
	}*/
	
	public String toString()
	{
		return("La porte a pour num�ro "+getNumeroDePorte());
	}
}
