import java.util.Scanner;

/*
 * Faça um programa que entre com três números e coloque em ordem crescente.
 */
public class Two {
	
	public static void main(String[] args) {
		
		double sequence[] = new double[3];
		Scanner input = new Scanner(System.in);
		
		for (int i = 0; i < sequence.length; i++) {
			System.out.print("digite o numero " + i + ": ");
			sequence[i] = input.nextDouble();
		}
		input.close();
		
		int j = 0;
		double aux;
		while ((j < sequence.length) && (j + 1 < sequence.length)) {
//			System.out.println("entrei com valor j = " + j);
			if (sequence[j] > sequence[j + 1]) {
				aux = sequence[j];
				sequence[j] = sequence[j + 1];
				sequence[j + 1] = aux;
				j = 0;
			} else {
				j++;
			}
//			System.out.println("j = " + j);
		}
//		System.out.println("terminei");
//		System.out.println(sequence.length);
		
		for (int i = 0; i < sequence.length; i++) {
			System.out.println("posicao " + i + ": " + sequence[i]);
		}
	}

}


