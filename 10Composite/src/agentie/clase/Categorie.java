package agentie.clase;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Categorie implements Optiune {

	List<Optiune> lista;
	String nume;
	
	public Categorie(String nume){
		lista=new ArrayList<Optiune>();
		this.nume=nume;
	}
	
	@Override
	public void stergeNod(Optiune optiune) {
		lista.remove(optiune);
	}

	@Override
	public void adaugaNod(Optiune optiune) {
		lista.add(optiune);
	}

	@Override
	public Optiune getNod(int index) {
		return lista.get(index);
	}

	@Override
	public void descriere() {
		System.out.println("Categoria "+nume);
		for(Optiune optiune:lista){
			optiune.descriere();
		}
	}
}
