package oferte.shallow;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class ListaOferte implements IListaOferte {

	private List<String> oferte;
	public ListaOferte() {
		oferte=new ArrayList<String>();
	}
	
	public void incarcaListaOferte() {
		try {
			BufferedReader reader=new BufferedReader(new FileReader("oferte.txt"));
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
	public IListaOferte copiaza() throws CloneNotSupportedException {
		return (IListaOferte) super.clone();
	}

	@Override
	public String toString() {
		return "ListaOferte [oferte=" + oferte + "]";
	}

}
