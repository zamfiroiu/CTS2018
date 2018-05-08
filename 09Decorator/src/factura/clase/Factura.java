package factura.clase;

public class Factura implements IFactura{
	
	private int codFactura;
	private double sumaFactura;
	
	public Factura(int codFactura, double sumaFactura) {
		super();
		this.codFactura = codFactura;
		this.sumaFactura = sumaFactura;
	}
	
	public void printeazaFactura() {
		System.out.println("Factura cu codul "+codFactura+ " are o suma de "+sumaFactura);
	}

	public int getCodFactura() {
		return codFactura;
	}

	public void setCodFactura(int codFactura) {
		this.codFactura = codFactura;
	}

	public double getSumaFactura() {
		return sumaFactura;
	}

	public void setSumaFactura(double sumaFactura) {
		this.sumaFactura = sumaFactura;
	}
	
	
}
