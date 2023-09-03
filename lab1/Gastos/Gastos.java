/**
* Laboratório de Programação 2 - Lab 1
*
* @author Ana Laura Barros de Melo - 122210847
*/
 
import java.util.Scanner;
import java.util.HashMap;

public class Gastos {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String mesesString = sc.nextLine();
		String[] meses = mesesString.split(" ");

		String gastosString = sc.nextLine();
		String[] gastosEnt = gastosString.split(" ");

		int[] gastos = new int[gastosEnt.length];

		// Transforma os valores em inteiro
		for(int i = 0; i < gastosEnt.length; i++) {
			gastos[i] = Integer.parseInt(gastosEnt[i]);
		}

		HashMap<String, Integer> mapaGastos = new HashMap<>();

		for(int i = 0; i < meses.length; i++) {
			mapaGastos.put(meses[i], gastos[i]);
		}

		String mes = sc.nextLine();

		int gasto = mapaGastos.get(mes);
		System.out.println(gasto);

		sc.close();
	}
}
