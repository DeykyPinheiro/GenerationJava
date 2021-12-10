import java.util.Scanner;

/*
 * 3 - Solicitar a idade de várias pessoas e imprimir: Total de pessoas com menos de 21 anos.
 * Total de pessoas com mais de 50 anos. O programa termina quando idade for =-99. (WHILE)
 * */
public class Exercicio3 {
	
	public static void main(String[] args) {
		
		int age = 0;
		int minorTwentyOne = 0;
		int fiftyPlus = 0;
		
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("digite sua idade: ");
		age = input.nextInt();
		while(age != -99) {
			if (age < 21) {
				minorTwentyOne++;
			} else if (age > 50) {
				fiftyPlus++;
			}
			System.out.print("digite sua idade: ");
			age = input.nextInt();
		}
		
		System.out.println("menores de 21: " + minorTwentyOne);
		System.out.println("maiores de 50: " + fiftyPlus);
		
		
		input.close();
		
		
	}

}
