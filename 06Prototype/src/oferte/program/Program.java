package oferte.program;

import oferte.deep.*;

public class Program {
	
	public static void main(String[]args) {
		IListaOferte listaOferte=new ListaOferte();
		listaOferte.incarcaListaOferte();
		
		IListaOferte copieListaOferte = null;
		copieListaOferte = listaOferte.copiaza();		
		
		System.out.println(copieListaOferte.toString());
		
	}

}
