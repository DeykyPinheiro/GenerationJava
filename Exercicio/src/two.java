import java.util.Scanner;

/*
2. Faça um sistema que leia a idade de uma pessoa expressa em dias e mostre-a
expressa em anos, meses e dias. 
*/
public class two {
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("digite o numero de dias que voce ja viveu: ");
		int totalDays = input.nextInt();
		int	year;
		int month;
		int day;
		
		year = totalDays / 365;
		totalDays = totalDays % 365;
		month = totalDays / 30;
		day = totalDays % 30;
		
		System.out.println("voce viveu " + year + " anos " + month + " meses " + day + " dias.");
		
		input.close();
	
		
		
	}

}
