package utilsfortests;

import clase.IPersoana;

public class PersoanaStubSpy implements IPersoana {

	private int numberGetSex;
	private int numberGetVarsta;
	private int numberCheckCNP;

	public PersoanaStubSpy(String nume, String CNP) {
		numberGetSex = 0;
		numberGetVarsta = 0;
		numberCheckCNP = 0;
	}

	public String getSex() {
		numberGetSex++;
		return "M";
	}

	public int getVarsta() {
		numberGetVarsta++;
		return 33;
	}

	public boolean checkCNP() {
		numberCheckCNP++;
		return true;
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

	public String getRaport() {
		return "GetVarsta:" + numberGetVarsta + ", GetSex:" + numberGetSex + ", CheckCNP:" + numberCheckCNP;
	}
}
