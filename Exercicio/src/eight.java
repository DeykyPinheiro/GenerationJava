import java.util.Scanner;

/*
 * O custo ao consumidor de um carro novo � a soma do custo de f�brica com a
 * percentagem do distribuidor e dos impostos (aplicados ao custo de f�brica).
 * Supondo que a percentagem do distribuidor seja de 28% e os impostos de 45%,
 * escrever um sistema que leia o custo de f�brica de um carro e escreva o custo ao
 * consumidor.*/

public class eight {
	
	public static void main(String[] args) {
		
		double consumerCost, factoryCost, tax, distributor;
		
		Scanner input = new Scanner(System.in);
		System.out.print("Digite o valor de fabrica do automovel: ");
		factoryCost = input.nextDouble();
		input.close();
		
		tax = factoryCost * 0.45;
		distributor = factoryCost * 0.28;
		
		consumerCost = factoryCost + tax + distributor;
		System.out.print("custo total: R$" + consumerCost);
		
	}
}
