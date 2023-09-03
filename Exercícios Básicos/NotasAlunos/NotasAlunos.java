/**
* Laboratório de Programação 2 - Lab 1
*
* @author Ana Laura Barros de Melo - 122210847
*/

import java.util.Scanner;
import java.util.ArrayList;

public class NotasAlunos {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<Integer> notas = new ArrayList<Integer>();

		while(true) {
		String linha = sc.nextLine();
			
			if(linha.equals("-")){
				break;
			}

			String[] dadosAlunos = linha.split(" ");
			notas.add(Integer.parseInt(dadosAlunos[1]));

		}

		int maior = 0;
		int menor = 1000;
		int acima = 0;
		int abaixo = 0;

		int soma = 0;

		for(int nota : notas) {
			if(nota > maior) {
				maior = nota;

			}
			if(nota < menor) {
				menor = nota;

			}
			soma += nota;
			
			if(nota >= 700) {
				acima += 1;
			}
			if(nota < 700) {
				abaixo += 1;
			}
		}

		int media = soma / notas.size();

		System.out.println("maior: " + maior);
		System.out.println("menor: " + menor);
		System.out.println("media: " + media);
		System.out.println("acima: " + acima);
		System.out.println("abaixo: " + abaixo);

	}
}
