package utilsfortests;

import clase.IPersoana;

public class PersoanaStub implements IPersoana{
	public PersoanaStub(String nume, String CNP){
	}
	
	public String getSex(){
		return "M";
	}
	
	public int getVarsta(){
		return 33;			
	}
	
	public boolean checkCNP(){
		return true;
	}
}
