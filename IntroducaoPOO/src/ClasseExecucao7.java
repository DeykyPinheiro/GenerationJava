/*
 * Crie uma classe paciente e apresente os atributos e métodos referentes
 * esta classe, em seguida crie um objeto paciente, defina as instancias deste
 * objeto e apresente as informações deste objeto no console.*/
public class ClasseExecucao7 {
	
	public static void main(String[] args) {
		
		Paciente numero1 = new Paciente();
		numero1.status();
		System.out.println();
		
		//dado alterador
		numero1.setPaciente("Anderson");
		numero1.setDoenca("Gripe");
		numero1.status();
	}

}
