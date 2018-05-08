package hotel.program;

import hotel.clase.ProxyRezervare;
import hotel.clase.Rezervare;

public class Program {

	public static void main(String[] args) {
		Rezervare rezervare=new Rezervare(2, 111);		
		rezervare.anulareRezervare();

		ProxyRezervare proxy=new ProxyRezervare(rezervare) ;
		proxy.anulareRezervare();
	}

}
