package zad3;

public class Osobowy extends Pojazd {
	public int osoby;

	public Osobowy() {

	}

	public Osobowy(int kola) {
		super(kola);

	}

	public int dodajOsoby(int osoby) {

		this.osoby = osoby;

		return osoby;

	}


}
