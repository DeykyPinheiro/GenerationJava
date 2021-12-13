import java.util.Scanner;

/*
 * Faça um programa que crie um vetor por leitura com 5 valores de pontuação de uma
 * atividade e o escreva em seguida. Encontre após a maior pontuação e a apresente.
 */

public class Exercicio1 {
	
	public static void main(String[] args) {
		
		int[] valores = new int[5];
		valores = receber_valores();
		imprime_valor(valores);
	}
	
	public static int[] receber_valores() {
		Scanner input = new Scanner(System.in);
		int[] line = new int[5];
		
		for(int i = 0; i < line.length; i++) {
			System.out.print("Digite o valor da posicao "+ (i + 1) + ": ");
			line[i] = input.nextInt();
		}
		input.close();
		return  line;
	}
	
	public static void imprime_valor(int[] valores) {
		
		for(int i = 0; i < valores.length; i++) {
			System.out.print("posicao " + (i + 1) + " valor: " + valores[i] + "\n");
		}
	}
}


