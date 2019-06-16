/* Napisati kod koji predstavlja kalkulator povrsina kvadrata, pravougaonika i kruga.
 Povrsina se bira tako sto se unese kao tekst odgovarajuca figura.
 Ukoliko se unese 'izadji', program treba da se zavrsi.
 Program treba da se ponavlja dokle god se ne unese izadji. */


package zadatak01032019;

import java.util.Scanner;

public class Povrsine {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String figura;
		System.out
				.println("Ovo je program za izracunavanje povrsine geometrijskih tela. Ukoliko zelite da izadjete iz programa, napisite: izadji. ");

		while (true) {
			System.out.println(" ");
			System.out
					.println("Povrsinu kog geometrijskog tela zelite da dobijete(krug, kvadrat ili pravougaonik): ");

			figura = sc.nextLine();

			switch (figura) {

			case "kvadrat":
				racunajKvadrat();
				break;
			case "pravougaonik":
				racunajPravougaonik();
				break;
			case "krug":
				racunajKrug();
				break;
			case "izadji":
				System.out.println(" ");
				System.out.println("Kraj!");
				return;
			default:
				System.out.println("Los unos.");
			}
		}

	}

	private static void racunajKrug() {
		Scanner sc = new Scanner(System.in);
		double r;
		System.out.println("Unesite poluprecnik kruga: ");
		r = sc.nextDouble();
		if (r <= 0) {
			System.out.println("Los unos!");
			return;
		}
		System.out.println("Povrsina kruga je: " + pKruga(r));
	}

	private static void racunajPravougaonik() {
		Scanner sc = new Scanner(System.in);
		double a, b;
		System.out.println("Unesite stranicu a pravougaonika: ");
		a = sc.nextDouble();
		System.out.println("Unesite stranicu b pravougaonika: ");
		b = sc.nextDouble();
		if (a <= 0 || b <= 0) {
			System.out.println("Los unos!");
			return;
		}
		System.out
				.println("Povrsina pravougaonika je: " + pPravougaonika(a, b));

	}

	private static void racunajKvadrat() {
		Scanner sc = new Scanner(System.in);
		double a;
		System.out.println("Unesite stranicu kvadrata: ");
		a = sc.nextDouble();
		if (a <= 0) {
			System.out.println("Los unos!");
			return;
		}
		System.out.println("Povrsina kvadrata je: " + pKvadrata(a));

	}

	private static double pKruga(double r) {
		return r * r * 3.14;
	}

	private static double pKvadrata(double a) {
		return a * a;
	}

	private static double pPravougaonika(double a, double b) {
		return a * b;
	}
}
