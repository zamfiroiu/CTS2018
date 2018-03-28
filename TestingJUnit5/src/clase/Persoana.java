package clase;

import java.util.Calendar;
import java.util.concurrent.TimeUnit;

public class Persoana implements IPersoana{
	public String CNP;
	public String nume;

	public Persoana(String nume, String CNP) {
		this.nume = nume;
		this.CNP = CNP;
	}

	public String getSex() {
		switch (CNP.charAt(0)) {
		case '1':
			return "M";
		case '2':
			return "F";
		case '3':
			return "M";
		case '4':
			return "F";
		case '5':
			return "M";
		case '6':
			return "F";
		}
		return "N/A";
	}

	public int getVarsta(){
		int an=0;
		if(CNP.charAt(0)=='1'|| CNP.charAt(0)=='2')
			an=(1900 + Integer.parseInt("" + CNP.charAt(1) + CNP.charAt(2)));
		if(CNP.charAt(0)=='3'|| CNP.charAt(0)=='4')
			an=(1800 + Integer.parseInt("" + CNP.charAt(1) + CNP.charAt(2)));
		if(CNP.charAt(0)=='5'|| CNP.charAt(0)=='6')
			an=(2000 + Integer.parseInt("" + CNP.charAt(1) + CNP.charAt(2)));	
		int luna= Integer.parseInt("" + CNP.charAt(3) + CNP.charAt(4));
		int zi= Integer.parseInt("" + CNP.charAt(5) + CNP.charAt(6));
			
		Calendar dataNasterii=Calendar.getInstance();
		dataNasterii.set(an,luna,zi);
		Calendar dataCurenta=Calendar.getInstance();
		long varsta_zile=TimeUnit.MILLISECONDS.toDays(Math.abs(dataCurenta.getTimeInMillis()-dataNasterii.getTimeInMillis()));
		return (int) (varsta_zile/365);				
	}

	public boolean checkCNP() {
		int s = 0;
		String number = "279146358279";
		for (int i = 0; i < 12; i++) {
			s += Integer.parseInt("" + number.charAt(i)) * Integer.parseInt("" + CNP.charAt(i));
		}
		int cifra = s % 11;
		if (cifra == 10)
			cifra = 1;
		return cifra == Integer.parseInt("" + CNP.charAt(12));
	}
}
