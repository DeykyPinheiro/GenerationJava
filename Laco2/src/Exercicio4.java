import java.util.Scanner;
/*
 * 4-	Uma empresa desenvolveu uma pesquisa para saber as características psicológicas dos indivíduos de uma região.
 *  Para tanto, a cada uma das pessoas era perguntado: 
 *  idade, 
 *  sexo (1-feminino / 2-masculino / 3-Outros), 
 *  (1, se a pessoa era calma; 2, se a pessoa era nervosa e 3, se a pessoa era agressiva). 
 *  Pede-se para elaborar um sistema que permita ler os dados de 150 pessoas, calcule e mostre: (WHILE)
•[x]	o número de pessoas calmas; (calm)
•[x]	o número de mulheres nervosas; (mulher nervosa)
•[x]	o número de homens agressivos; (homem agressio)
•[x]	o número de outros calmos; (outros calmos)
•[x]	o número de pessoas nervosas com mais de 40 anos; (nervoso +40)
•[x]	o número de pessoas calmas com menos de 18 anos.(calmos-18)

*/

public class Exercicio4 {
	
	public static final int INDIVIDUOS = 2;
	
	public static void main(String[] args) {
		
		int	idade = 0;
		int sexo = 0;
		int	homem = 0;
		int	mulher = 0;
		int	outros = 0;
		int	temperamento = 0;
		int	calmo = 0;
		int	nervoso = 0;
		int	agressivo = 0;
		int mulherNervosa = 0;
		int	homemAgressivo = 0;
		int outrosCalmos = 0;
		int	nervosoMais40 = 0;
		int calmosMenos18 = 0;
		
		Scanner input = new Scanner(System.in);
		
		int i = 0;
		while (i < INDIVIDUOS) {
			System.out.print("Idade: ");
			idade = input.nextInt();
			System.out.print("Sexo:\n1 - feminino\n2 - masculino\n3 - Outros\nDigite o correspondende: ");
			sexo = input.nextInt();
			System.out.print("1 - calma\n2 - nervosa\n3 - agressiva\nDigite o correspondende: ");
			temperamento = input.nextInt();
			
			if (temperamento == 1) {
				calmo++;
			} else if (temperamento == 2) {
				nervoso++;
			} else if (temperamento == 3) {
				agressivo++;
			} else {
				System.out.println("Error\nDigitado um numero não suportado!");
			}
			
			if ((sexo == 1) && temperamento == 2) {
				mulherNervosa++;
			} else if ((sexo == 2) && (temperamento == 3)) {
				homemAgressivo++;
			} else if ((sexo == 3) && (temperamento == 1)) {
				outrosCalmos++;
			}
			
			if ((idade > 40) && (temperamento == 2)) {
				nervosoMais40++;
			} else if ((idade < 18) && (temperamento == 1)) {
				calmosMenos18++;
			}
			System.out.print("\n==============================================================\n");
			i++;
		}
		input.close();
		
		
		
		System.out.println("Pessoas calma: " + calmo);
		System.out.println("Mulheres nervosas: " + mulherNervosa);
		System.out.println("Homem agressivo: " + homemAgressivo);
		System.out.println("Outros calmos: " + outrosCalmos);
		System.out.println("Nervosos 40+: " + nervosoMais40);
		System.out.println("calmos 18-: " + calmosMenos18);
		System.out.println("Terminei");
	}

}
