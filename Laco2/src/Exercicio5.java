import java.util.Scanner;
/*
 * 5 -Crie um programa que leia um n�mero do teclado at� que encontre um n�mero igual a zero.
 * No final, mostre a soma dos n�meros digitados.(DO...WHILE)
 * 
 * */
public class Exercicio5 {
	
	public static void main(String[] args) {
		
		
		double number = 0;
		int total = 0;
		Scanner input = new Scanner(System.in);
		System.out.print("digite um numero: ");
		number = input.nextDouble();
		
		while(number != 0) {
			total += number;
			System.out.print("digite um numero: ");
			number = input.nextDouble();	
		}
		
		System.out.println("Soma total: " + total);
		System.out.print("Terminei!");
		input.close();
	}

}
