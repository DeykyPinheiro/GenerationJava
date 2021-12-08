import java.util.Scanner;

/*
 * 4. Escreva um sistema que leia três números inteiros e positivos (A, B, C) e
 * calcule a seguinte expressão:*/
public class four {
	
	public static void main(String[] args) {
		
		int a;
		int b;
		int c;
		
		double d;
		double r;
		double s;
		
		Scanner input = new Scanner(System.in);
		System.out.print(" digite A: ");
		a = input.nextInt();
		System.out.print(" digite B: ");
		b = input.nextInt();
		System.out.print(" digite C: ");
		c = input.nextInt();
		input.close();
		
		
		r = (a + b) * (a + b);
		s = (b + c) * (b + c);
		d = ((r + s) / 2);
		
		System.out.println("valor de S: " + s);
		System.out.println("valor de D: " + d);
		System.out.println("valor de R: " + r);
		
		
		
		
		
	}
	

}
