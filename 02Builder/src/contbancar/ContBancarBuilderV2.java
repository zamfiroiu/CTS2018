/**
 * 
 */
package contbancar;

/**
 * @author alinZ
 *
 */
public class ContBancarBuilderV2 implements IBuilder {

	private String detinator;
	private double sumaBlocata;
	private double suma;
	private String moneda;
	private boolean cardAtasat;
	private boolean internetBanking;
	private boolean contSalariu;
	
	public ContBancarBuilderV2(){
		moneda="RON";
	}
	
	public ContBancarBuilderV2 setDetinator(String detinator) {
		this.detinator = detinator;
		return this;
	}


	public ContBancarBuilderV2 setSumaBlocata(double sumaBlocata) {
		this.sumaBlocata = sumaBlocata;
		return this;
	}


	public ContBancarBuilderV2 setSuma(double suma) {
		this.suma = suma;
		return this;
	}


	public ContBancarBuilderV2 setMoneda(String moneda) {
		this.moneda = moneda;
		return this;
	}


	public ContBancarBuilderV2 setCardAtasat(boolean cardAtasat) {
		this.cardAtasat = cardAtasat;
		return this;
	}


	public ContBancarBuilderV2 setInternetBanking(boolean internetBanking) {
		this.internetBanking = internetBanking;
		return this;
	}


	public ContBancarBuilderV2 setContSalariu(boolean contSalariu) {
		this.contSalariu = contSalariu;
		return this;
	}


	@Override
	public ContBancar build() {
		ContBancar cont=new ContBancar(detinator, sumaBlocata, suma, moneda, cardAtasat, internetBanking, contSalariu);
		return cont;
	}

}
