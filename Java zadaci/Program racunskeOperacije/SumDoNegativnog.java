/*Napisati program koji unosi i sabira brojeve dokle god nije unesen broj koji je negativan.
Na primer ako se unese 1 2 5 3 -1 program treba da ispise 11
 */

package zadatak19022019;

import java.util.Scanner;

public class SumDoNegativnog {

	public static void main(String[] args) {
		int i = 0, n, zbir = 0;
		// i je brojac, a n uneti broj
		Scanner sc = new Scanner(System.in);
		System.out.println("Unesite broj n: ");
		n = sc.nextInt();

		while (i <= n) {
			if (n >= 0) {
				zbir = zbir + n;

			} else {
				System.out.println("Uneli ste negativan broj");
				break;
			}
			System.out.println("Unesite novi broj n: ");
			n = sc.nextInt();
		}
		System.out
				.println("Zbir unetih brojeva, do prvog negativnog broja je: "
						+ zbir);
		sc.close();
	}
}
