package no.hvl.dat100.jplab11.oppgave3;

import no.hvl.dat100.jplab11.common.TODO;
import no.hvl.dat100.jplab11.oppgave1.*;

public class Blogg {

	// TODO: objektvariable
	Innlegg[] samling;
	int nesteLedige;

	public Blogg() {

		samling = new Innlegg[20];
	}

	public Blogg(int lengde) {
		samling = new Innlegg[lengde];
	}

	public int getAntall() {
		return nesteLedige;
	}

	public Innlegg[] getSamling() {
		return samling;

	}

	public int finnInnlegg(Innlegg innlegg) {

		boolean funnet = false;
		int pos = 0;
		while (pos < nesteLedige && !funnet) {
			if (samling[pos].getId() == innlegg.getId()) {
				funnet = true;
			} else {
				pos++;
			}
		}
		if (funnet) {
			return pos;
		} else {
			return -1;
		}
	}

	public boolean finnes(Innlegg innlegg) {

		boolean funnet = false;
		int pos = 0;
		while (pos < nesteLedige && !funnet) {
			if (innlegg.erLik(samling[pos]))
				funnet = true;
			else
				pos++;
		}
		return funnet;

	}

	public boolean ledigPlass() {
		boolean ledigPlass = false;
		if (nesteLedige > samling.length) {
			ledigPlass = true;
		}

		return ledigPlass;

	}

	public boolean leggTil(Innlegg innlegg) {
		boolean ny = finnInnlegg(innlegg.getId()) == -1;
		if (ny && nesteLedige < samling.length) {
			samling[nesteLedige] = innlegg;
			nesteLedige++;
			return true;
		} else {
			return false;
		}

	}

	public String toString() {
		return getAntall() + "\n" + samling;

	}

	// valgfrie oppgaver nedenfor

	public void utvid() {
		throw new UnsupportedOperationException(TODO.method());
	}

	public boolean leggTilUtvid(Innlegg innlegg) {

		throw new UnsupportedOperationException(TODO.method());

	}

	public boolean slett(Innlegg innlegg) {

		throw new UnsupportedOperationException(TODO.method());
	}

	public int[] search(String keyword) {

		throw new UnsupportedOperationException(TODO.method());

	}
}