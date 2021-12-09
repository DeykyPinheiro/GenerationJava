import java.util.Scanner;

/*
 * Faça um programa em que permita a entrada de um número qualquer e exiba se este
 * número é par ou ímpar. Se for par exiba também a raiz quadrada do mesmo; se for
 * ímpar exiba o número elevado ao quadrado.
*/
public class Four {
	
	public static void main(String[] args) {
		double number;
		Scanner input = new Scanner(System.in);
		System.out.print("Digite um numero: ");
		number = input.nextDouble();
		input.close();
		
		if ((number % 2 == 0)) {
			System.out.println(number + ": é par");
			System.out.println("sua raiz é: " + Math.sqrt(number));
		} else {
			System.out.println(number + ": é impar");
			System.out.println("seu quadrado é: " + Math.pow(number, 2));
		}
		
	}
}
