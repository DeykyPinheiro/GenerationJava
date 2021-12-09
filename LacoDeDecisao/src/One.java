/*
 * Faça um programa que receba três inteiros e diga qual deles é o maior.
 */
import java.util.Scanner;

public class One {
	
	public static void main(String[] args) {
		
		int	numbers[] = new int[3];
		int	max =0;
		Scanner input = new Scanner(System.in);
		
		for (int i = 0; i < numbers.length; i++) {
			System.out.print("digite o numero " + i + ": ");
			numbers[i] = input.nextInt();
			if (numbers[i] > max) {
				max = numbers[i];
			}
		}
		input.close();
		
		System.out.println("maior numero digitado foi: " + max);
		
	}

}
