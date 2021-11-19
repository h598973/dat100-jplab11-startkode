package no.hvl.dat100.jplab11.common;

import no.hvl.dat100.jplab11.oppgave1.Innlegg;
import no.hvl.dat100.jplab11.oppgave1.Innlegg.Tekst;

public class TODO {

	public static String method() {
		
		String methodName = Thread.currentThread().getStackTrace()[2].getMethodName();
		
		return "Metoden " + methodName + " er ikke implementert";
	}
	
	
	public static String constructor(String className) {
				
	   return "Konstruktøren for klassen " + className + " er ikke implementert";
		
	}

}

public class Tekst extends Innlegg {
	this.tekst = tekst;
}

public class Bilde extends Tekst {

}