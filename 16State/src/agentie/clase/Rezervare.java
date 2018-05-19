package agentie.clase;

public class Rezervare {

	private int id;
	private Stare state;
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	
	public Rezervare(int id){
		state=null;
		this.id=id;
	}

	public Stare getState() {
		return state;
	}

	public void setState(Stare state) {
		this.state = state;
	}
}
