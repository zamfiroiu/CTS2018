package agentie.clase;

public class PachetTuristic implements IPachetTuristic {
	private int codPachet;
	private String Hotel;
	private String destinatie;
	private boolean micDejun;

	public PachetTuristic(int codPachet, String hotel, String destinatie, boolean micDejun) {
		super();
		this.codPachet = codPachet;
		Hotel = hotel;
		this.destinatie = destinatie;
		this.micDejun = micDejun;
	}

	public int getCodPachet() {
		return codPachet;
	}

	public void setCodPachet(int codPachet) {
		this.codPachet = codPachet;
	}

	public String getHotel() {
		return Hotel;
	}

	public void setHotel(String hotel) {
		Hotel = hotel;
	}

	public String getDestinatie() {
		return destinatie;
	}

	public void setDestinatie(String destinatie) {
		this.destinatie = destinatie;
	}

	public boolean isMicDejun() {
		return micDejun;
	}

	public void setMicDejun(boolean micDejun) {
		this.micDejun = micDejun;
	}

	@Override
	public String toString() {
		return "PachetTuristic [codPachet=" + codPachet + ", Hotel=" + Hotel + ", destinatie=" + destinatie
				+ ", micDejun=" + micDejun + "]";
	}

	@Override
	public void descriePachet(Optionale optionale) {
		System.out.println("Pachetul Turistic cu codul " + codPachet 
				+ ", are cazare la hotelul " + Hotel
				+ ", din orasul " + destinatie 
				+ (micDejun ? " are " : " nu are ") 
				+ "micDejun, " + (optionale.isCina() ? " are " : " nu are ") 
				+ " inclusa cina si are un numar de "
				+ optionale.getNumarExcursii() + " excursii optionale");
	}
}
