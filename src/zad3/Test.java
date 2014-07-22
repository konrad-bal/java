package zad3;

public class Test {

	public static void main(String[] args) {
		
		Osobowy osb = new Osobowy();
		osb.dodajKola(4);
		osb.dodajOsoby(5);
		
		System.out.println("Samochod osobowy ma: " +osb.ilosc + " kola "+ "oraz liczbe osob " +osb.osoby);
		
		Quad q = new Quad();
		q.dodajKola(10);
		
		System.out.println("Quad ma: " +q.ilosc + " kola ");

	}

}
