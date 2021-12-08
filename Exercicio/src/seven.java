import java.util.Scanner;

/*
 * Um sistema de equações lineares do tipo:
 */
public class seven {
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		double a, b, c, d, e, f;
		double x, y;
		
		System.out.print("digite a: ");
		a = input.nextDouble();
		System.out.print("digite b: ");
		b = input.nextDouble();
		System.out.print("digite c: ");
		c = input.nextDouble();
		System.out.print("digite d: ");
		d = input.nextDouble();
		System.out.print("digite e: ");
		e = input.nextDouble();
		System.out.print("digite f: ");
		f = input.nextDouble();
		input.close();
		
		x = ((c * e) - (b * f)) / ((a * e) - (b * d));
		y = ((a * f) - (c * d)) / ((a * e) - (b * d));
		
		System.out.println("x = " + x);;
		System.out.println("y = " + y);;
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
