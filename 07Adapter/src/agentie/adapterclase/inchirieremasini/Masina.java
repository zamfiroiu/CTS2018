package agentie.adapterclase.inchirieremasini;

public class Masina {

	private String model;
	private double capacitateCilindrica;
	
	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public double getCapacitateCilindrica() {
		return capacitateCilindrica;
	}

	public void setCapacitateCilindrica(double capacitateCilindrica) {
		this.capacitateCilindrica = capacitateCilindrica;
	}

	public Masina(String model, double capacitateCilindrica){
		this.model=model;
		this.capacitateCilindrica=capacitateCilindrica;
	}

	@Override
	public String toString() {
		return "Masina [model=" + model + ", capacitateCilindrica=" + capacitateCilindrica + "]";
	}
}
