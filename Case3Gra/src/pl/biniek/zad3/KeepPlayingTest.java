package pl.biniek.zad3;

import java.io.*;
import java.io.InputStreamReader;

public class KeepPlayingTest {
	// podobnie jak w poprzednich metodê zrobi³em statycznie

	public static boolean doYouPlay() {
		String readedTekst = null;
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		Character doYouPaly = 'n';// nie wiem czy takie zmienne ustawiac jako
									// globalne statyczne czy tak jak tu

		try {

			System.out
					.print("Czy nie chcesz dalej chcesz grac to pierwszy znak wprowadzonego stringu  to n :");
			readedTekst = in.readLine();

		} catch (IOException ioe) {
			System.out.println("b³ad wprowadzania danych " + ioe);
			System.exit(-1);
		}

		if (doYouPaly.equals(readedTekst.charAt(0))) {
			return false;
		}

		else
			return true;

	}
}
