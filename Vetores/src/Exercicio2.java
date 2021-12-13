import java.util.Scanner;
/*
 * Um dado é lançado 10 vezes e o valor correspondente é anotado. Faça um programa
 * que gere um vetor com os lançamentos, escreva esse vetor. A seguir determine e
 * imprima a média aritmética dos lançamentos, contabilize e apresente também
 * quantas foram as ocorrências da maior pontuação.*/
public class Exercicio2 {
	
	public static void main(String[] args) {
		
		int[] valorValores = new int[10];
		int	quantidadeMaiorValor = 0;
		int	media = 0;
		int	maior = 0;
		
		
		Scanner input = new Scanner(System.in);
		for(int i = 0; i < valorValores.length; i++) {
			System.out.print("\n" + (i + 1) + " jogada: ");
			valorValores[i] = input.nextInt();
		}
		input.close();
		
		media = mediaVetor(valorValores);
		maior = maiorValor(valorValores);
		quantidadeMaiorValor = contarValor(valorValores, maior);
		
		System.out.print("\nmedia: " + media);
		System.out.print("\nmaior valor: " + maior);
		System.out.print("\nquantidade maior valor: " + quantidadeMaiorValor);
		
	}
	
	public static int contarValor(int[] vetor, int value) {
		int contador = 0;
		
		for(int i = 0; i < vetor.length; i++) {
			if (value == vetor[i]) {
				contador++;
			}
		}
		return (contador);
	}
	
	public static int maiorValor(int[] vetor) {
		int	maior;
		
		maior = 0;
		for(int i = 0; i < vetor.length; i++) {
			if (vetor[i] > maior) {
				maior = vetor[i];
			}
		}
		return (maior);
	}
	
	public static int mediaVetor(int[] vetor) {
		int total = 0;
		int media = 0;
		
		
		for( int i = 0; i < vetor.length; i++) {
			total += vetor[i];
		}
		media = total / vetor.length;
		return (media);
	}
	
}
