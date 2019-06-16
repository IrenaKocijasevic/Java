/*
 *ZADATAK BR. 1.
 *Napisati program koji proverava da li je uneti broj paran ili neparan.
 Ukoliko je paran, program treba da ispiše poruku: "Broj je paran"
 Ukoliko nije, program treba da ispiše poruku: "Broj je neparan"
 */

package zadatak1_14022019;

import java.util.Scanner;

public class ParNepar {

	public static void main(String[] args) {
		System.out.println("Unesite celi broj:");
		int b;
		Scanner sc = new Scanner(System.in);
		b = sc.nextInt(); 
		if (b % 2 == 0) {
			System.out.println("Broj " + b + " je paran.");
		} else {
			System.out.println("Broj " + b + " je neparan.");
		}
		sc.close();
	}

}
