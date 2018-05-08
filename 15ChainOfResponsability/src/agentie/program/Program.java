package agentie.program;

import agentie.clase.Client;
import agentie.clase.Notificator;
import agentie.clase.NotificatorEmail;
import agentie.clase.NotificatorManager;
import agentie.clase.NotificatorSMS;

public class Program {

	public static void main(String[] args) {
		Notificator notificatorSMS=new NotificatorSMS();
		Notificator notificatorEmail=new NotificatorEmail();
		Notificator notificatorManager=new NotificatorManager();
		
		notificatorSMS.setUrmatorulNotificator(notificatorEmail);
		notificatorEmail.setUrmatorulNotificator(notificatorManager);
		
		Client client=new Client("Popescu", null, null);
		
		notificatorSMS.notifica(client, "Notificare TEST");
	}

}
