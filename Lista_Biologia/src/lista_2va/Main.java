package lista_2va;

public class Main {

	public static void main(String[] args) {
		
		String input = "AGCTTTTCATTCTGACTGCAACGGGCAATATGTCTCTGTGTGGATTAAAAAAAGAGTGTCTGATAGCAGC";
		
		Resolucao r = new Resolucao(input);
		
		System.out.println(r.DNA());

	}

}
