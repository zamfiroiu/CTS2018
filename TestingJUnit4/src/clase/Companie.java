package clase;

public class Companie {
	private String nume;
	private IPersoana director;
	private float cifraAfaceri;
	
	public Companie(String nume, IPersoana dir,float cifra)
	{
		this.nume=nume;
		director=dir;
		cifraAfaceri=cifra;
	}
	
	public boolean verificareLegalitate()
	{
		if(director.getVarsta()<18 || cifraAfaceri<0){
			return false;
		}		
		return true;		
	} 
}
