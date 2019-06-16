// Korisnik ucitava niz od N elemenata niza.
// Napisati 2 metode
// Prva metoda ispisuje elemente niza koji su deljivi sa 3
// Druga metoda ispisuje elemente niza koji su deljivi sa 5

package zadatak28022019;

import java.util.Scanner;

public class DveMetode {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Unesite broj koji definise duzinu niza: ");
		int n = sc.nextInt();
		int[] niz = null;
		niz = new int[n];

		clanovi(niz, n);
		deljivoSaTri(niz);
		deljivoSaPet(niz);

		sc.close();

	}

	public static void clanovi(int[] niz, int n) {
		Scanner sc = new Scanner(System.in);

		for (int i = 0; i < n; i++) {
			System.out.println("Unesite clana niza na poziciji " + (i+1) );
			niz[i] = sc.nextInt();
		}
		System.out.println(" ");
		sc.close();
	}

	private static void deljivoSaTri(int[] niz) {
		System.out.print("Clanovi niza koji su deljivi sa tri: ");
		for (int i = 1; i < niz.length; i++) {
			if (niz[i] % 3 == 0)
				System.out.print(niz[i] + " ");
		}
		System.out.println(" ");
	}

	private static void deljivoSaPet(int[] niz) {
		System.out.print("Clanovi niza koji su deljivi sa pet: ");
		for (int i = 1; i < niz.length; i++) {
			if (niz[i] % 5 == 0)
				System.out.print(niz[i] + " ");
		}
		System.out.println(" ");
	}
}
