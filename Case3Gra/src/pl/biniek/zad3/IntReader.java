package pl.biniek.zad3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class IntReader {
	// zastanawiam sie czy taka metoda ma byc statyczna czy w g��wnym programie
	// tworzyc obiekt klasy i wywo�ywac metod�
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
					System.out.println("Z�a wielkosc liczby!!!");
				else
					testWhile = false;

			} catch (NumberFormatException nfe) {

				System.out.println(nfe+" b�ad formatu liczby pliku ponownie podaj liczb� ");
			} catch (IOException ioe) {

				System.out.println(ioe + " b�ad na wej�ciu odczyt danych");

			}

		}
		return readedInt;

	}
}
