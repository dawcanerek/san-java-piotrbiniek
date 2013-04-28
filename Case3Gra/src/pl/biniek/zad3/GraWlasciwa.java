package pl.biniek.zad3;


public class GraWlasciwa {

	int lottoNumber;
	int readedNumber;
	boolean gameTest=true;
	int licznik;

	public GraWlasciwa(){		
		
					
	}
	public void start(){
		while(gameTest){
			graj();
			gameTest=KeepPlayingTest.doYouPlay();

		}
	}
	
	
	public void graj(){
		licznik=0;
		readedNumber=-1;
			
		lottoNumber = Lottomat.losuj();
		lottoNumber=23;
		while(lottoNumber!=readedNumber){
			readedNumber = IntReader.readIn();
			if (lottoNumber>readedNumber) System.out.println("Wiêksza ");
			else if (lottoNumber<readedNumber) System.out.println("Mniejsza ");
			licznik++;
		}
		System.out.println("trafi³es, liczba losowañ to :"+licznik);
		
	}
	
}
