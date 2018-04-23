package contbancar;

public class ContBancarBuilder implements IBuilder {

	private ContBancar contBancar;

	public ContBancarBuilder() {
		contBancar = new ContBancar();
	}

	public ContBancarBuilder setDetinator(String detinator) {
		contBancar.setDetinator(detinator);
		return this;
	}

	public ContBancarBuilder setSumaBlocata(double sumaBlocata) {
		contBancar.setSumaBlocata(sumaBlocata);
		return this;
	}

	public ContBancarBuilder setSuma(double suma) {
		contBancar.setSuma(suma);
		return this;
	}

	public ContBancarBuilder setMoneda(String moneda) {
		contBancar.setMoneda(moneda);
		return this;
	}

	public ContBancarBuilder setCardAtasat(boolean cardAtasat) {
		contBancar.setCardAtasat(cardAtasat);
		return this;
	}

	public ContBancarBuilder setInternetBanking(boolean internetBanking) {
		contBancar.setInternetBanking(internetBanking);
		return this;
	}

	public ContBancarBuilder setContSalariu(boolean contSalariu) {
		contBancar.setContSalariu(contSalariu);
		return this;
	}

	@Override
	public ContBancar build() {
		
		return contBancar;
	}

}
