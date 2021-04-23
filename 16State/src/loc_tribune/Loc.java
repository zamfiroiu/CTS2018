package loc_tribune;

public class Loc {
	
	private int nrLoc;
	private Stare stare;

	public Loc(int nrLoc) {
		super();
		this.nrLoc = nrLoc;
		stare = new Liber();
	}
	
	public void rezervaLoc() {
		if(this.stare instanceof Liber) {
			System.out.println("Locul cu numarul "+nrLoc+" este rezervat");
			stare=new Rezervat();
		}
		else {
			System.out.println("Locul cu numarul: "+nrLoc+" nu poate fi rezervat");
		}
	}
	
	public void ocupaLoc() {
		if(!(stare instanceof Ocupat)) {
			System.out.println("Locul "+nrLoc+" a fost ocupat");
			stare=new Ocupat();
		}
		else {
			System.out.println("Locul "+nrLoc+" nu poate fi ocupat");
		}
	}
	
	public void eliberareLoc() {
		if(!(stare instanceof Liber)) {
			System.out.println("Locul "+nrLoc+" a fost eliberat");
			stare=new Liber();
		}else {
			System.out.println("Locul "+nrLoc+" este deja liber");
		}
	}
	
	

}
