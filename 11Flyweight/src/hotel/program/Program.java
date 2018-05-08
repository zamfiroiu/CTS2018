package hotel.program;

import hotel.clase.FabricaDeCamere;
import hotel.clase.ICamera;
import hotel.clase.Rezervare;

public class Program {

	public static void main(String[] args) {
		Rezervare rezevarePopescu=new Rezervare("Popescu", 3);
		Rezervare rezervareIonescu=new Rezervare("Ionescu", 6);
		Rezervare rezervareVasilescu=new  Rezervare("Vasilescu", 2);
		
		
		FabricaDeCamere fabrica=new FabricaDeCamere();
		
		ICamera camera2=fabrica.getCamera(1);
		camera2.tiparire(rezervareVasilescu);
		fabrica.getCamera(1).tiparire(rezervareIonescu);
		fabrica.getCamera(2).tiparire(rezevarePopescu);
	}
}
