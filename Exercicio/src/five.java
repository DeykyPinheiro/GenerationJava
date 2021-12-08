import java.util.Scanner;

/*
 * Faça um sistema que leia as 3 notas de um aluno e calcule a média final deste
 * aluno. Considerar que a média é ponderada e que o peso das notas é: 2,3 e 5,
 * respectivamente.*/
public class five {
	
	public static void main(String[] args) {
		
		double a;
		double b;
		double c;
		double average;
		
		Scanner input = new Scanner(System.in);
		System.out.print("Digite a nota 1: ");
		a = input.nextDouble();
		System.out.print("Digite a nota 2: ");
		b = input.nextDouble();
		System.out.print("Digite a nota 3: ");
		c = input.nextDouble();
		input.close();
		
		
		average = ((a * 2.0) + (b * 3.0) + (c * 5.0)) / 10.0;
		
		System.out.println("media: " + average);
		
		
		
		
	}

}
