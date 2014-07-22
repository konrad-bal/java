package zad4;

public class Auto extends Pojazd {

	public int rok_produkcji;
	
	Auto(int rok_produkcji){
		this.rok_produkcji = rok_produkcji;
	}
	
	public int getRok(){

		return rok_produkcji;
	}
}
