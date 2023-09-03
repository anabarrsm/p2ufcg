/**
* Laboratório de Programação 2 - Lab 1
*
* @author Ana Laura Barros de Melo - 122210847
*/

import java.util.Scanner;

public class CalculadoraJava {
        public static void main(String[] args) {
                Scanner sc = new Scanner (System.in);
                String operador = sc.nextLine();

                if(!operador.equalsIgnoreCase("+") && !operador.equalsIgnoreCase("-") && !operador.equalsIgnoreCase("*") && !operador.equalsIgnoreCase("/")) {
			System.out.println("ENTRADA INVALIDA");
		} else {
                        float n1 = sc.nextFloat();
                        float n2 = sc.nextFloat();

                        float soma = n1 + n2;
                        float sub = n1 - n2;
                        float mult = n1 * n2;
                        float div = n1 / n2;

                        if(operador.equals("+")) {
                                System.out.println("RESULTADO: " + soma);

                        } else if(operador.equals("-")) {
                                System.out.println("RESULTADO: " + sub);

                        } else if(operador.equals("*")) {
                                System.out.println("RESULTADO: " + mult);

                        } else if(operador.equals("/")) {
                                if(n2 == 0) {
                                        System.out.println("ERRO");
                                } else {
                                        System.out.println("RESULTADO: " + div);
                                }
                        }

                
                }
        }
}
