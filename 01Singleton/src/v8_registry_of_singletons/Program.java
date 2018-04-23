package v8_registry_of_singletons;

public class Program {

	public static void main(String[] args) {
		PachetCazare cazare=new PachetCazare();
		PachetCazare cazare2=new PachetCazare();
		PachetTransport transport=new PachetTransport();
		
		try {
			RegistryPachete.register("Cazare", cazare);
			RegistryPachete.register("Transport", transport);

			//RegistryPachete.register("Cazare", cazare2);
			
			RegistryPachete.getPachet("Cazare").descriere();
			RegistryPachete.getPachet("Transport").descriere();
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}

}
