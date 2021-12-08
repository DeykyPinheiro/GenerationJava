import java.util.Scanner;

/*
 * Construa um programa em c que, tendo como dados de entrada dois pontos
 * quaisquer no plano, P(x1, y1) e P(x2, y2), escreva a distância entre eles. A fórmula
*/

public class six {
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		double	x1,x2;
		double	y1,y2;
		double	distance;
		
		System.out.print("digite x1: ");
		x1 = input.nextDouble();
		System.out.print("digite x2: ");
		x2 = input.nextDouble();
		System.out.print("digite y1: ");
		y1 = input.nextDouble();
		System.out.print("digite y2: ");
		y2 = input.nextDouble();
		
		distance = Math.sqrt(Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2));
		
		System.out.print("ditancia: "+ distance);
		
		input.close();
	}
}
