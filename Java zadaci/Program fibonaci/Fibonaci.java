/*
 * Napisati program u kojem korisnik unosi broj n i ispisuje sve brojeve
 * fibonacijevog niza, a potom racuna da li je deljiv sa k(takodje unosi
 * korisnik. 
 */
package zadatak22022019;

import java.util.Scanner;

public class Fibonaci {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n, k, br0 = 0, br1 = 1;
		System.out
				.println("Unesite koliko zelite brojeva da vam se ispise u fibonacijevom nizu: ");
		n = sc.nextInt();

		System.out.println("Fibonacijev niz je sledeci:");

		for (int i = 1, suma; i <= n; i++) {
			System.out.print(br0 + "  ");

			suma = br0 + br1;
			br0 = br1;
			br1 = suma;

		}
		System.out.println(" ");
		System.out
				.println("Sa kojim brojem zelite da proverite deljivost brojeva u dobijenom nizu: ");
		k = sc.nextInt();
		System.out.println("Sledeci brojevi su deljivi sa " + k + " :");

		int suma2, bd0 = 0, bd1 = 1;

		for (int i = 0; i <= n; i++) {

			suma2 = bd0 + bd1;
			bd0 = bd1;
			bd1 = suma2;

			if (bd0 % k == 0 && bd0 <= (br1 - br0))
				System.out.print(bd0 + "  ");
		}
		sc.close();
	}
} 