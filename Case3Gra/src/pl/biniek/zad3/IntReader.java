package pl.biniek.zad3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class IntReader {
	// zastanawiam sie czy taka metoda ma byc statyczna czy w g³ównym programie
	// tworzyc obiekt klasy i wywo³ywac metodê
	public static int readIn() {
		String readedTekst = null;
		int readedInt = -1;
		boolean testWhile = true;
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

		while (testWhile) {
			try {

				System.out.print("podaj liczbe od 0 do 100:");
				readedTekst = in.readLine();
				readedInt = Integer.parseInt(readedTekst);
				if (readedInt < 0 || readedInt > 100)
					System.out.println("Z³a wielkosc liczby!!!");
				else
					testWhile = false;

			} catch (NumberFormatException nfe) {

				System.out.println(nfe+" b³ad formatu liczby pliku ponownie podaj liczbê ");
			} catch (IOException ioe) {

				System.out.println(ioe + " b³ad na wejœciu odczyt danych");

			}

		}
		return readedInt;

	}
}
