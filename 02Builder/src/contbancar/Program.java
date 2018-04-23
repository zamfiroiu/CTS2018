package contbancar;

public class Program {

	public static void main(String[] args) {
		ContBancar cont = new ContBancar();
		cont.setDetinator("Popescu Ion");
		cont.setSuma(1000);
		cont.setMoneda("RON");
		cont.setContSalariu(true);
		cont.setInternetBanking(true);
		cont.setCardAtasat(true);

		System.out.println(cont.toString());

		// utilizare builder
		ContBancar cont2 = new ContBancarBuilderV2().setDetinator("Ionescu Vasile").setSuma(2000).setCardAtasat(true)
				.setContSalariu(true).build();
		System.out.println(cont2.toString());

	}
}
