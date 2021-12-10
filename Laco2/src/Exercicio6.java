import java.util.Scanner;

/*
 * 6-	Escrever um programa que receba vários números inteiros no teclado. 
 * E no final imprimir a média dos números múltiplos de 3. 
 * Para sair digitar 0(zero).(DO...WHILE)
 * */
public class Exercicio6 {
	
	public static void main(String[] args) {
		
		int number = 0;
		double multiplesCount = 0;
		double multiplesTotal = 0;
		
		
		
		Scanner input = new Scanner(System.in);
		
		do {
			if ((number % 3 == 0) && (number != 0)) {
				multiplesTotal += number;
				multiplesCount++;
			}
			System.out.print("Digite um numero: ");
			number = input.nextInt();
		} while (number != 0);
		
		System.out.println("Total: " + multiplesTotal + " quantidade: " + multiplesCount + " media: " + (multiplesTotal / multiplesCount));
		System.out.println("Terminei");
		input.close();
	}

}
