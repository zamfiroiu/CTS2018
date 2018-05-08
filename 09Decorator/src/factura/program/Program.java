package factura.program;

import factura.clase.Factura;
import factura.decorator.Decorator;
import factura.decorator.FacturaDecorata;

public class Program {

	public static void main(String[] args) {
		Factura factura=new Factura(123, 1000);
		
		factura.printeazaFactura();
		
		Decorator facturaDecorata=new FacturaDecorata(factura);
		
		facturaDecorata.aplicaDiscount(10);
		facturaDecorata.printeazaFactura();
	}

}
