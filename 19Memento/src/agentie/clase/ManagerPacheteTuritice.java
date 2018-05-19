package agentie.clase;

import java.util.ArrayList;
import java.util.List;

public class ManagerPacheteTuritice {
	private List<MementoPachetTuristic> listaPachete=new ArrayList<>();
	
	public void adaugaMemento(MementoPachetTuristic memento){
		listaPachete.add(memento);
	}
	
	public MementoPachetTuristic getMemento(int index){
		return listaPachete.get(index);
	}
	public MementoPachetTuristic getLastMemento() throws Exception{
		if(listaPachete.size()!=0){
			MementoPachetTuristic memento = listaPachete.get(listaPachete.size()-1);
			listaPachete.remove(listaPachete.size()-1);
			return memento;			
		} else {
			throw new Exception("Nu exista stari salvate");
		}
	}
	
}
