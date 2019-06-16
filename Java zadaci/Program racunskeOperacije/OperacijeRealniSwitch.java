/*Napisati program koji unosi 2 realna broja i operaciju kao karakter. 
 * Program napisati koristeci switch za izbor operacije. 
 * Voditi racuna oko deljenja
 * */
package zadatak18022019;

import java.util.Scanner;

public class OperacijeRealniSwitch {

	public static void main(String[] args) {
		double a, b;
		char c;

		Scanner sc = new Scanner(System.in);
		System.out.println("Unesite prvi broj:");
		a = sc.nextDouble();

		System.out.println("Unesite drugi broj:");
		b = sc.nextDouble();

		sc.nextLine();

		System.out.println("Unesite jednu od operacija + , - , *, / :");
		c = sc.nextLine().charAt(0);

		switch (c) {
		case '+':

			System.out.println("Zbir brojeva iznosi: " + (a + b));
			break;

		case '-':
			System.out.println("Razlika brojeva iznosi: " + (a - b));
			break;

		case '*':
			System.out.println("Proizvod brojeva iznosi: " + (a * b));
			break;

		case '/':
			if (b != 0) {
				System.out.println("Kolicnik brojeva iznosi: " + (a / b));
			} else {
				System.out
						.println("Morate uneti broj deljenika koji je razlicit od 0(nule)");
			}
			break;
		}
		sc.close();
	}
}
