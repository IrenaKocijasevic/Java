// Napisati program u kojem korisnik unosi dva realna broja i poziva
// metodu proizvod i ispisuje u glavnom programu(main) rezultat metode.

package zadatak25022019;

import java.util.Scanner;

public class Metoda {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		double r1, r2;
		System.out.println("Unesite broj r1: ");
		r1 = sc.nextDouble();

		System.out.println("Unesite broj r2: ");
		r2 = sc.nextDouble();

		proizvod(r1, r2);

		System.out.println("Proizvod brojeva je: " + proizvod(r1, r2));
		sc.close();
	}

	public static double proizvod(double a, double b) {
		return (a * b);
	}
}
