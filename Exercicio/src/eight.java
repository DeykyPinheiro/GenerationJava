import java.util.Scanner;

/*
 * O custo ao consumidor de um carro novo é a soma do custo de fábrica com a
 * percentagem do distribuidor e dos impostos (aplicados ao custo de fábrica).
 * Supondo que a percentagem do distribuidor seja de 28% e os impostos de 45%,
 * escrever um sistema que leia o custo de fábrica de um carro e escreva o custo ao
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
