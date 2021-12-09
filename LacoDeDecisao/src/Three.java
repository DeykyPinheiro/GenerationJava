import java.util.Scanner;

/*
 * Faça um programa que receba a idade de uma pessoa e mostre na saída em qual
 * categoria ela se encontra:
 * 10-14 infantil
 * 15-17 juvenil
 * 18-25 adulto/
 */

public class Three {
	
	public static void main(String[] args) {
		
		int age;
		Scanner input = new Scanner(System.in);
		System.out.print("Digite sua idade: ");
		age = input.nextInt();
		input.close();
		
		if ((age >= 0) && (age < 15)) {
			System.out.print("infantil");
		} else if (age < 18) {
			System.out.print("juvenil");
		} else  if (age > 17) {
			System.out.print("adulto");
		} else {
			System.out.print("erro tente novamente");
		}
		
	}

}
