import java.util.Scanner;

/*
 * Fa�a um programa em que permita a entrada de um n�mero qualquer e exiba se este
 * n�mero � par ou �mpar. Se for par exiba tamb�m a raiz quadrada do mesmo; se for
 * �mpar exiba o n�mero elevado ao quadrado.
*/
public class Four {
	
	public static void main(String[] args) {
		double number;
		Scanner input = new Scanner(System.in);
		System.out.print("Digite um numero: ");
		number = input.nextDouble();
		input.close();
		
		if ((number % 2 == 0)) {
			System.out.println(number + ": � par");
			System.out.println("sua raiz �: " + Math.sqrt(number));
		} else {
			System.out.println(number + ": � impar");
			System.out.println("seu quadrado �: " + Math.pow(number, 2));
		}
		
	}
}
