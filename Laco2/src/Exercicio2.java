import java.util.Scanner;

/*
 * 2-	Ler 10 n�meros e imprimir quantos s�o pares e quantos s�o �mpares. (FOR)
 * */
public class Exercicio2 {
	
	public static void main(String[] args) {
		
		double number;
		int odd, even;
		
		number = 0.0;
		odd = 0;
		even = 0;
		
		Scanner input = new Scanner(System.in);
		for (int i = 0; i < 10; i++) {
			System.out.print("numero " + (i + 1) + ": ");
			number = input.nextDouble();
			if (number % 2 ==0) {
				even++;
			} else {
				odd++;
			}
		}
		
		System.out.println("pares = " + even);
		System.out.println("impar = " + odd);
		input.close();
	}

}
