// Napisati program koji ucitava ceo broj N. Taj broj N se prosledjuje
// metodi koja formira i vraæa ceo broj koji predstavlja inverzan broj.
// Glavni program nakon toga ispisuje taj inverzan broj.
// Primer: 121 - > 121
// 452 - > 254
// 326 - > 623

package zadatak26022019;

import java.util.Scanner;

public class MetodaMOD {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Unesite broj: ");
		int n = sc.nextInt();

		rikverc(n);

		System.out.print(rikverc(n) + " je inverzan unetom broju.");
		sc.close();
	}

	public static int rikverc(int n) {
		int pom, pom1 = 0;
		while (n > 0) {

			pom = n % 10;

			pom1 = (pom1 * 10) + pom;

			n /= 10;

		}

		return (pom1);
	}
}