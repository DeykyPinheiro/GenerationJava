import java.util.Scanner;
/*
 * Um dado � lan�ado 10 vezes e o valor correspondente � anotado. Fa�a um programa
 * que gere um vetor com os lan�amentos, escreva esse vetor. A seguir determine e
 * imprima a m�dia aritm�tica dos lan�amentos, contabilize e apresente tamb�m
 * quantas foram as ocorr�ncias da maior pontua��o.*/
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
