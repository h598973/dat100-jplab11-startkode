package no.hvl.dat100.jplab11.oppgave3;

import no.hvl.dat100.jplab11.common.TODO;
import no.hvl.dat100.jplab11.oppgave1.*;

public class Blogg {

	Innlegg[] innleggTabell;
	int nesteLedige;

	public Blogg() {

		innleggTabell = new Innlegg[20];
	}

	public Blogg(int lengde) {
		innleggTabell = new Innlegg[lengde];
	}

	public int getAntall() {
		return nesteLedige;
	}

	public Innlegg[] getSamling() {
		return innleggTabell;

	}

	public int finnInnlegg(Innlegg innlegg) {

		for (int i = 0; i < this.nesteLedige; i++) {
			if (this.innleggTabell[i].erLik(innlegg) == true) {
				return i;
			}
		}
		return -1;
	}

	public boolean finnes(Innlegg innlegg) {
		for (int i = 0; i < this.nesteLedige; i++) {
			if (this.innleggTabell[i].erLik(innlegg) == true) {
				return true;
			}
		}
		return false;
	}

	public boolean ledigPlass() {
		boolean ledigPlass = false;
		if (nesteLedige > innleggTabell.length) {
			ledigPlass = true;
		}

		return ledigPlass;

	}

	public boolean leggTil(Innlegg innlegg) {
		boolean ny = finnInnlegg(innlegg.getId()) == -1;
		if (ny && nesteLedige < innleggTabell.length) {
			innleggTabell[nesteLedige] = innlegg;
			nesteLedige++;
			return true;
		} else {
			return false;
		}

	}

	public String toString() {
		return getAntall() + "\n" + innleggTabell;

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