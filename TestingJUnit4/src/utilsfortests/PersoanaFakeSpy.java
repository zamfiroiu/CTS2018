package utilsfortests;

import clase.IPersoana;

public class PersoanaFakeSpy implements IPersoana {
	private String valoareGetSex;
	private int valoareGetVarsta;
	private boolean valoareCheckCNP;
	
	private int numberGetSex;
	private int numberGetVarsta;
	private int numberCheckCNP;
	
	public PersoanaFakeSpy(String nume, String CNP){
	}
	
	public void setValoareGetSex(String valoareGetSex) {
		this.valoareGetSex = valoareGetSex;
	}

	public void setValoareGetVarsta(int valoareGetVarsta) {
		this.valoareGetVarsta = valoareGetVarsta;
	}

	public void setValoareCheckCNP(boolean valoareCheckCNP) {
		this.valoareCheckCNP = valoareCheckCNP;
	}
	
	@Override
	public String getSex() {
		numberGetSex++;
		return valoareGetSex;
	}

	@Override
	public int getVarsta() {
		numberGetVarsta++;
		return valoareGetVarsta;
	}

	@Override
	public boolean checkCNP() {
		numberCheckCNP++;
		return valoareCheckCNP;
	}
	
	
	public int getNumberGetSex() {
		return numberGetSex;
	}

	public int getNumberGetVarsta() {
		return numberGetVarsta;
	}

	public int getNumberCheckCNP() {
		return numberCheckCNP;
	}

	public String getRaport(){
		return "GetVarsta:"+numberGetVarsta+", GetSex:"+numberGetSex+", CheckCNP:"+numberCheckCNP;
	}
}
