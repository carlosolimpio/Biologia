package lista_2va;

public class Main {

	public static void main(String[] args) {
		
		String input = "AAAACCCGGT";
		
		Resolucao r = new Resolucao(input);
		
		System.out.println(r.revc() + "\nEntrada: " + r.getInput());

	}

}
