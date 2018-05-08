package oferte.deep;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ListaOferte implements IListaOferte {

	private List<String> oferte;
	
	public void setOferte(List<String> oferte) {
		this.oferte = oferte;
	}

	public ListaOferte() {
		oferte=new ArrayList<String>();
	}

	@Override
	public void incarcaListaOferte() {
		try {
			BufferedReader reader=new BufferedReader(new FileReader("oferte"));
			String oferta=null;
			while((oferta=reader.readLine())!=null) {
				oferte.add(oferta);
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	@Override
	public IListaOferte copiaza() {
		ListaOferte listaOferte=new ListaOferte();
		List<String> listaTemporara=new ArrayList<String>();
		for(String oferta:this.oferte){
			listaTemporara.add(oferta);
		}
		listaOferte.setOferte(listaTemporara);
			
		return listaOferte;
	}

	@Override
	public String toString() {
		return "ListaOferte [oferte=" + oferte + "]";
	}

}
