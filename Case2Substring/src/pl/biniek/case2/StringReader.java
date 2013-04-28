package pl.biniek.case2;
import java.io.*;

public class StringReader implements ConsoleReadable {

	
	
	@Override
	public String[] readInTekst() {
		String[] readedElements = new String[3];
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

		try {
			System.out.print("podaj liczbe 1:");
			readedElements[0] = in.readLine();
			System.out.print("Podaj Liczbê 2:");
			readedElements[1] = in.readLine();
			System.out.print("Podaj string:");
			 readedElements[2] = in.readLine();

		} catch (IOException e) {

			System.out.println(e + " b³ad na wejœciu klasa StringCutter");
		}
		return  readedElements;

	}

}
