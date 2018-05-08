package hotel.clase;

public class Camera implements ICamera {

	private int codAranjare;
	private int numarProsoape;
	private int numarCearsafuri;
	private int numarPerne;
	private int numarUmerase;
	
	@Override
	public void tiparire(Rezervare rezervare) {
		System.out.println(this.toString()+ " " + rezervare.toString());
	}
	public Camera(int codAranjare, int numarProsoape, int numarCearsafuri, int numarPerne, int numarUmerase) {
		super();
		this.codAranjare = codAranjare;
		this.numarProsoape = numarProsoape;
		this.numarCearsafuri = numarCearsafuri;
		this.numarPerne = numarPerne;
		this.numarUmerase = numarUmerase;	}

	@Override
	public String toString() {
		return "Camera [codAranjare=" + codAranjare + ", numarProsoape=" + numarProsoape + ", numarCearsafuri="
				+ numarCearsafuri + ", numarPerne=" + numarPerne + ", numarUmerase=" + numarUmerase + "]";
	}
}
