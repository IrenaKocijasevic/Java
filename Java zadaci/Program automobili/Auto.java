/*Napisati klasu Auto koja sadrzi sledeca polja:
Kubikaza, Konjaza, Broj vrata, Proizvodjac, Model, Cena
Napisat gettere i settere za sva polja klase Auto.Takodje napisati 5 razicitih konstruktora i 
ukoliko nema dovoljno parametara upisati podrazumevane vrednosti.

U glavnom programu kreirati tri razlicita auta. Ispisati na izlazu informacije o svakom autu 
i nakon toga izmeniti neke od vrednosti  automobila i ispisati na izlaz nove podatke. */

package zadatak04032019;
public class Auto {
	private int kubikaza;
	private int konjaza;
	private int brVrata;
	private String proizvodjac;
	private String model;
	private double cena;

	public Auto(int kubikaza, int konjaza, int brVrata, String proizvodjac,
			String model, double cena) {
		this.kubikaza = kubikaza;
		this.konjaza = konjaza;
		this.brVrata = brVrata;
		this.proizvodjac = proizvodjac;
		this.model = model;
		this.cena = cena;
	}
	
	public Auto(int kubikaza, int konjaza, int brVrata, String proizvodjac, String model){
		this.kubikaza=kubikaza;
		this.konjaza=konjaza;
		this.brVrata=brVrata;
		this.proizvodjac=proizvodjac;
		this.model=model;
		this.cena=0;
	}
	public Auto(int kubikaza, int konjaza, int brVrata, String proizvodjac, double cena){
		this.kubikaza=kubikaza;
		this.konjaza=konjaza;
		this.brVrata=brVrata;
		this.proizvodjac=proizvodjac;
		this.model="";
		this.cena=cena;
	}

	public Auto(int kubikaza, int konjaza, int brVrata, double cena){
		this.kubikaza=kubikaza;
		this.konjaza=konjaza;
		this.brVrata=brVrata;
		this.proizvodjac="";
		this.model="";
		this.cena=cena;
	}
	
	public Auto(int kubikaza, int konjaza, int brVrata){
		this.kubikaza=kubikaza;
		this.konjaza=konjaza;
		this.brVrata=brVrata;
		this.proizvodjac="";
		this.model="";
		this.cena=0;
	}
	public int getKubikaza() { 
		return this.kubikaza;
	}

	public void setKubikaza(int kubikaza) {
		this.kubikaza = kubikaza;
	}

	public int getKonjaza() { 
		return this.konjaza;
	}

	public void setKonjaza(int konjaza) {
		this.konjaza = konjaza;
	}

	public int getBrVrata() { 
		return this.brVrata;
	}

	public void setBrVrata(int brVrata) {
		this.brVrata = brVrata;
	}

	public String getProizvodjac() {
		return this.proizvodjac;
	}

	public void setProizvodjac(String proizvodjac) {
		this.proizvodjac = proizvodjac;
	}

	public String getModel() { 
		return this.model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public double getCena() { 
		return this.cena;
	}

	public void setCena(double cena) {
		this.cena = cena;
	}
}