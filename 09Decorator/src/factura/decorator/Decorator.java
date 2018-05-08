package factura.decorator;

import factura.clase.Factura;

public abstract class Decorator implements factura.clase.IFactura {

	protected Factura factura;
	
	
	public Decorator(Factura factura){
		this.factura=factura;
	}
	@Override
	public void printeazaFactura() {
		factura.printeazaFactura();
		System.out.println("La multi ani!");
	}
	
	public abstract void aplicaDiscount(int procent);
		


}
