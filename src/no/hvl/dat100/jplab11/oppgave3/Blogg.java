package no.hvl.dat100.jplab11.oppgave3;

import no.hvl.dat100.jplab11.common.TODO;
import no.hvl.dat100.jplab11.oppgave1.*;

public class Blogg {

	private int nesteLedig;
	private Innlegg[] innleggstabell; 

	public Blogg() {
		
		innleggstabell = new Innlegg[20];
		nesteLedig = 0;
		
		//throw new UnsupportedOperationException(TODO.constructor("Blogg"));
	}

	public Blogg(int lengde) {
		
		innleggstabell = new Innlegg[lengde];
		nesteLedig = 0; 
		
		//throw new UnsupportedOperationException(TODO.constructor("Blogg"));
	}

	public int getAntall() {
		return nesteLedig;
		
		//throw new UnsupportedOperationException(TODO.method());
	}
	
	public Innlegg[] getSamling() {
		return innleggstabell;
		
		//throw new UnsupportedOperationException(TODO.method());

	}
	
	public int finnInnlegg(Innlegg innlegg) {
		
		for (int i = 0; i < nesteLedig; i++) {
			if (innleggstabell[i].erLik(innlegg)) {
				return i;
			}
		}
		return -1;
		
		//throw new UnsupportedOperationException(TODO.method());
	}

	public boolean finnes(Innlegg innlegg) {
		
		for (int i = 0; i < nesteLedig; i++) {
			if (innleggstabell[i].erLik(innlegg)) {
			return true;
			}
		}
		return false;
		
		//throw new UnsupportedOperationException(TODO.method());
	}

	public boolean ledigPlass() {
		
		if (nesteLedig < innleggstabell.length) {
			return true;
		}
		return false;
		
		//throw new UnsupportedOperationException(TODO.method());

	}
	
	public boolean leggTil(Innlegg innlegg) {
		
		if (!finnes(innlegg) && nesteLedig < innleggstabell.length) {
			innleggstabell[nesteLedig] = innlegg;
			nesteLedig++;
			return true; 
		}
		return false;

		//throw new UnsupportedOperationException(TODO.method());
	}
	
	@Override
	public String toString() {
		
		StringBuilder resultat = new StringBuilder();
		resultat.append(nesteLedig).append("\n");
		
		for (int i = 0; i < nesteLedig; i++) {
			resultat.append(innleggstabell[i].toString());
			
			}
		
		return resultat.toString();
		
		//throw new UnsupportedOperationException(TODO.method());
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