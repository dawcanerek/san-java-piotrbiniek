package pl.biniek.case2;

import java.io.*;

public class StrungCutter {
	String[] readedData;

	public String cutString(String[] readedData) {
		this.readedData = readedData;
		String subString = null;
		int number1 = 0, number2 = 0;

		try {
			number1 = Integer.parseInt(readedData[0]);
		} catch (NumberFormatException nfe) {

			System.out.println(nfe + " b³ad typu to nie int zmienna 1");
			System.exit(-1);
		}
	

		try {
			number2 = Integer.parseInt(readedData[1]);
		} catch (NumberFormatException nfe) {

			System.out.println(nfe + " b³ad typu to nie intzmienna 2");
			System.exit(-1);
		}
	
		
		try {
			subString = readedData[2].substring(number1, number2);
		} catch (IndexOutOfBoundsException iobe) {

			System.out.println(iobe + " z³y zakres tablicy");
			System.exit(-1);
		}
	

		return subString;

	}

}
