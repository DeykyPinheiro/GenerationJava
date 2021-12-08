import java.util.Scanner;

/*
 * 3. Faça um sistema que leia o tempo de duração de um evento em uma fábrica
 * expressa em segundos e mostre-o expresso em horas, minutos e segundos.
*/
public class three {
	
	public static void main(String[] args) {
		
		double totalSeconds;
		Scanner input = new Scanner(System.in);
		int hour;
		int minute;
		int second;
		
		System.out.println("digite a duracao do envento em segundos: ");
		totalSeconds = input.nextDouble();
		
		hour = (int) (totalSeconds / 3600);
		totalSeconds = totalSeconds % 3600;
		minute = (int) (totalSeconds / 60);
		totalSeconds = totalSeconds % 60;
		second = (int) (totalSeconds % 60);
		
		
		System.out.println("o evento durou um total de " + hour + " horas " + minute + " minutos " + second + " segundos ");
		input.close();
	}

}
