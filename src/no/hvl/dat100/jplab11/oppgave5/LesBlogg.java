package no.hvl.dat100.jplab11.oppgave5;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

import no.hvl.dat100.jplab11.common.TODO;
import no.hvl.dat100.jplab11.oppgave1.*;
import no.hvl.dat100.jplab11.oppgave2.*;
import no.hvl.dat100.jplab11.oppgave3.*;

import javax.swing.JOptionPane;

public class LesBlogg {

	private static String TEKST = "TEKST";
	private static String BILDE = "BILDE";

	public static Blogg les(String mappe, String filnavn) {

		try (BufferedReader reader = new BufferedReader(new FileReader(mappe + "/" + filnavn))) {
			int antallInnlegg = Integer.parseInt(reader.readLine());
			Blogg blogg = new Blogg(antallInnlegg);
			
			for (int i = 0; i < antallInnlegg; i++) {
				String innleggType = reader.readLine();
				int id = Integer.parseInt(reader.readLine());
				String bruker = reader.readLine();
				String dato = reader.readLine();
				int likes = Integer.parseInt(reader.readLine());
				String tekst = reader.readLine();
				
				if (innleggType.equals(TEKST)) {
					Tekst tekstInnlegg = new Tekst(id, bruker, dato, likes, tekst);
					blogg.leggTil(tekstInnlegg);
				}
				else if (innleggType.equals(BILDE)) {
					String url = reader.readLine();
					Bilde bildeInnlegg = new Bilde(id, bruker, dato, likes, tekst, url);
					blogg.leggTil(bildeInnlegg);
				}
			}
			return blogg;
		} 
		catch (IOException e) {
			e.printStackTrace();
			return null;
		}
		
		//throw new UnsupportedOperationException(TODO.method());

	}
}
