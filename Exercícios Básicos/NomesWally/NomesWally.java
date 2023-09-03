/**
* Laboratório de Programação 2 - Lab 1
*
* @author Ana Laura Barros de Melo - 122210847
*/

import java.util.Scanner;

public class NomesWally {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		while(true){
		String linha = sc.nextLine();
		if(linha.equals("wally")) {
			break;
			
			}

		String[] nomes = linha.split(" ");
		
		String novoNome = "";

		for(String nome : nomes) {
			if(nome.length() == 5) {
				novoNome = nome;
			}
		}

		if(novoNome != "") {
			System.out.println(novoNome);

		} else {
			System.out.println("?");

		}
		}
	}
}
