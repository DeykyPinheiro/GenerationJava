import java.util.Scanner;

/*
 * Escreve um programa que lê duas matrizes N1 (4,6) e N2(4,6) e cria:
 * 
 * a) Uma matriz M1 cujos elementos serão as somas dos elementos de mesma posição
 * das matrizes N1 e N2;
 * 
 * b) Uma matriz M2 cujos elementos serão as diferenças dos elementos de mesma
 * posição das matrizes N1 e N2.
*/
public class Exercicio3 {
	
	
	
	public static int[][] somaMatrizes2D(int[][] matrizA, int[][] matrizB) {
		
		int	linha = 0;
		int	coluna = 0;
		linha = matrizA.length;
		coluna = matrizA[0].length;
		
		int[][] matrizSoma = new int[linha][coluna];
		for(int i = 0; i < linha; i++) {
			for(int j = 0; j < coluna; j++) {
				matrizSoma[i][j] += matrizA[i][j] + matrizB[i][j];
			}
		}
		return (matrizSoma);
	}
	
	public static int[][] diferencaMatrizes2D(int[][] matrizA, int[][] matrizB) {
		
		int	linha = 0;
		int	coluna = 0;
		linha = matrizA.length;
		coluna = matrizA[0].length;
		
		int[][] matrizDiferenca = new int[linha][coluna];
		for(int i = 0; i < linha; i++) {
			for(int j = 0; j < coluna; j++) {
				matrizDiferenca[i][j] += matrizA[i][j] - matrizB[i][j];
			}
		}
		return (matrizDiferenca);
	}
	
	
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
		int[][] matriz1 = new int[4][6];
		int linha = matriz1.length;
		int coluna = matriz1[0].length;
		
		int[][] matriz2 = new int[linha][coluna];
		int[][] matrizSoma = new int[linha][coluna];
		int[][] matrizDiferenca = new int[linha][coluna];
		
		matriz2 = lerMatriz(input, linha, coluna);
		matriz1 = lerMatriz(input, linha, coluna);
		matrizSoma = somaMatrizes2D(matriz1, matriz2);
		matrizDiferenca = diferencaMatrizes2D(matriz1, matriz2);

		
		System.out.println("matriz1\n");
		mostrarMatriz2D(matriz1);

		System.out.println("matriz2\n");
		mostrarMatriz2D(matriz2);
		
		System.out.println("soma\n");
		mostrarMatriz2D(matrizSoma);
		
		System.out.println("diferenca1\n");
		mostrarMatriz2D(matrizDiferenca);
		
		input.close();
		
	}
}
