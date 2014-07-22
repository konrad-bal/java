package zad3;

public class Quad extends Pojazd {
	
	@Override
	public int dodajKola(int ilosc){
		this.ilosc = 4;
		System.out.println("Quad ma zawsze 4 kola !!!!");
		
		return ilosc;
	} 

}
