import java.util.Scanner;


/*
 * Crie um programa que receba valores do usuário para preencher uma matriz 3X3, e
 * em seguida, exiba a soma dos valores dela e a soma dos valores da primeira
 * diagonal, ou seja, diagonal principal.
*/
public class Exercicio4 {
	
	public static final int LINHA = 2;
	public static final int COLUNA = 2;
	
	public static int[][] lerMatriz(Scanner input, int linha, int coluna) {
		
		int[][] vetor = new int[linha][coluna];
		for(int i = 0; i < linha; i++) {
			for(int j = 0; j < coluna; j++) {
				System.out.print("\ncorrespondente linha " + i +  " coluna " + j + ": ");
				vetor[i][j] = input.nextInt();
			}
		}
		return(vetor);
	}
	
	public static int somaMatriz2D(int[][] matriz, int linha, int coluna) {
		int total = 0;
		for(int i = 0; i < linha; i++) {
			for(int j = 0; j < coluna; j++) {
				total += matriz[i][j];
			}
		}
		return (total);
	}
	
	public static int somaDiagonalMatriz2D(int[][] matriz, int linha, int coluna) {
		int total = 0;
		for(int i = 0; i < linha; i++) {
			for(int j = 0; j < coluna; j++) {
				if (i == j)
					total += matriz[i][j];
			}
		}
		return (total);
	}
	
public static void mostrarMatriz2D(int[][] vetor) {
		
		int	linha = 0;
		int	coluna = 0;
		linha = vetor.length;
		coluna = vetor[0].length;
		
		for(int i = 0; i < linha; i++) {
			for(int j = 0; j < coluna; j++) {
				System.out.printf("%d ", vetor[i][j]);
			}
			System.out.println("\n");
		}
	}
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		int[][] matriz = new int[LINHA][COLUNA];
		int total = 0;
		int totalDiagonal = 0;
		
		matriz = lerMatriz(input, LINHA, COLUNA);
		total = somaMatriz2D(matriz, LINHA, COLUNA);
		totalDiagonal = somaDiagonalMatriz2D(matriz, LINHA, COLUNA);
		
		System.out.println("\n");
		mostrarMatriz2D(matriz);
		System.out.println("soma: " + total);
		System.out.println("soma diagonal: " + totalDiagonal);
		
		input.close();
	}
}
