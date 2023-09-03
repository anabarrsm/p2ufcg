/**
* Laboratório de Programação 2 - Lab 1
*
* @author Ana Laura Barros de Melo - 122210847
*/

import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

public class AcimaMedia {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String linha = sc.nextLine();
		String[] numeros = linha.split(" ");
		List<Integer> numerosInt = new ArrayList<>();
		
		for(String n : numeros) {
			numerosInt.add(Integer.parseInt(n));
		}

		float soma = 0;
		
		for(int num : numerosInt) {
			soma += num;
		}

		float media = soma / numerosInt.size();

		for (int num : numerosInt) {
			if (num > media) {
				System.out.print(num + " ");
			}
		}
		sc.close();
	}
}
