package agentie.program;

import agentie.clase.Categorie;
import agentie.clase.Item;
import agentie.clase.Optiune;

public class Program {

	public static void main(String[] args) {
		Optiune cFile=new Categorie("File");
		Optiune cCamere=new Categorie("Camere");
		Optiune cOferte=new Categorie("Oferte");
		
		Optiune iOpen=new Item("Open");
		Optiune iSave=new Item("Save");
		Optiune iVizualizare=new Item("Vizualizare camere");
		Optiune iEditare=new Item("Editare camere");
		Optiune iOfertaCraciun=new Item("Oferte craciun");
		Optiune iCreazaOferta=new Item("Creaza oferta");
		
		try {
			cCamere.adaugaNod(iVizualizare);
			cCamere.adaugaNod(iEditare);
			
			cOferte.adaugaNod(iOfertaCraciun);
			cOferte.adaugaNod(iCreazaOferta);
			
			cFile.adaugaNod(iOpen);
			cFile.adaugaNod(iSave);
			cFile.adaugaNod(cCamere);
			cFile.adaugaNod(cOferte);
			
			cFile.stergeNod(iSave);
			cOferte.adaugaNod(iSave);
			
			cFile.descriere();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
