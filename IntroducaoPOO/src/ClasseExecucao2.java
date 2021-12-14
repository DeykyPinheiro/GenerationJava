/*
 * Crie uma classe avião e apresente os atributos e métodos referentes
 * esta classe, em seguida crie um objeto avião, defina as instancias deste
 * objeto e apresente as informações deste objeto no console.*/
public class ClasseExecucao2 {
	
	public static void main(String[] args) {
		
		//intanciado e monstrando os dados que eu coloquei como default
		Aviao aviao = new Aviao();
		aviao.showDatas();
		System.out.println();
		
		
		//dados personalizado e exibicao
		aviao.setIdVoo(1234);
		aviao.setNomeDoCapitao("Jorge");
		aviao.setQuantidadeTotalPassageiros(512);
		aviao.setQuantidadeOciosaPasageiros(26);
		aviao.showDatas();
		
	}

}
