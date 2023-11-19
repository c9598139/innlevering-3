package no.hvl.dat100.jplab11.oppgave4;

import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.io.IOException;

import no.hvl.dat100.jplab11.common.TODO;
import no.hvl.dat100.jplab11.oppgave3.*;

public class SkrivBlogg {

	public static boolean skriv(Blogg samling, String mappe, String filnavn) {
		String filsti = mappe + "/" + filnavn;
		
		try (FileWriter writer = new FileWriter(filsti)) {
			writer.write(samling.toString());
			return true;
		}
		catch (FileNotFoundException e) {
			System.err.println("Filen ikke funnet: " + e.getMessage());
			return false;
		}
		catch (IOException e) {
			System.err.println("En IO-feil oppstod: " + e.getMessage());
			return false;
		}
		
		

		//throw new UnsupportedOperationException(TODO.method());
	}
}
