package hotel.clase;

import java.util.ArrayList;
import java.util.List;

public class Menajera {

	private List<Boolean> listaCamereCurate;
	
	public Menajera(){
		listaCamereCurate=new ArrayList<Boolean>();
		for(int i=0;i<6;i++)
			listaCamereCurate.add(true);
		for(int i=6;i<15;i++)
			listaCamereCurate.add(false);
	}
	
	public boolean esteCameraCurata(int cod){
		return listaCamereCurate.get(cod);
	}
	
	public boolean areProsoapeNoi(int codCamera){
		return listaCamereCurate.get(codCamera);
	}
	
}
