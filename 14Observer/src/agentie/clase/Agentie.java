package agentie.clase;

import java.util.ArrayList;
import java.util.List;

import agentie.client.Observer;

public class Agentie implements Subject {

	private List<Observer> observeri;
	private String numeAgentie;
	
	public Agentie(String numeAgentie) {
		this.numeAgentie=numeAgentie;
		observeri = new ArrayList<Observer>();
	}
	
	@Override
	public void adaugaObserver(Observer observer) {
		observeri.add(observer);
	}

	@Override
	public void stergeObserver(Observer observer) {
		observeri.remove(observer);
	}

	@Override
	public void trimiteNotificare(String mesaj) {
		for(Observer observer:observeri){
			observer.receptionareMesaj(numeAgentie+":"+ mesaj);
		}
	}
	
	public void notificareOfertaNoua(){
		trimiteNotificare("A fost adaugata o noua oferta. Consultati noul nostru catalog!");
	}
	
	public void notificareReducerePret(){
		trimiteNotificare("Preturile au fost reduse. Consultati noul nostru catalog!");
	}

}
