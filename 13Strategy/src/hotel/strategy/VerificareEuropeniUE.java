package hotel.strategy;

public class VerificareEuropeniUE implements ModVerificare {

	@Override
	public void verificaActe(String nume) {
		System.out.println("Am verificat buletinul lui " + nume);		
	}

}
