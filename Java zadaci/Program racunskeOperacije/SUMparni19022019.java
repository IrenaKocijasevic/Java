/* Napisati program koji racuna sumu parnih brojeva i 
 * proizvod neparnih brojeva od 0 do n. 
 * Koristiti jednu petlju.
 */

package zadatak19022019;

import java.util.Scanner;

public class SUMparni19022019 {

	public static void main(String[] args) {

		int i = 1, n, suma = 0, proizvod = 1;
		System.out.print("Unesite promenljivu n: ");
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();

		while (i <= n) {
			if (i % 2 == 0) {
				suma = suma + i;
			} else {
				proizvod = proizvod * i;
			}
			i = i + 1;
		}
		System.out.println("Suma parnih brojeva je = " + suma);
		System.out.println("Proizvod neparnih brojeva je = " + proizvod);
		sc.close();
	}
}
