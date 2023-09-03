/**
* Laboratório de Programação 2 - Lab 1
*
* @author Ana Laura Barros de Melo - 122210847
*/

import java.util.Scanner;

public class DobroTriplo {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int numero = sc.nextInt();
		
		int dobro = numero * 2;
		int triplo = numero * 3;

		System.out.print("dobro: " + dobro + ", triplo: " + triplo);
	}
}
