package pl.biniek.zad3;


public class Lottomat {
	//zastanawiam sie czy taka metoda ma byc statyczna czy w g³ównym programie trorzyc obiekt klasy i wywo³ywac metodê
	
	public static int losuj(){
		int los = (int)Math.round(Math.random()*100);
		return los;
	}

}
