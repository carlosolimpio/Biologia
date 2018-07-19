package lista_2va;

public class Main {

	public static void main(String[] args) {
		
		String s = "AGCCATGTAGCTAACTCAGGTTACATGGGGATGACCCCGCGACTTGGATTAGAGTCTCTTTTGGAATAAGCCTGAATGATCCGAGTAGCATCTCAG";
		//String t = "CATCGTAATGACGGCCT";
		
		Resolucao r = new Resolucao();
		
		System.out.println(r.orf(s));
		
		//System.out.println("DNA: " + s + "\nRNA: " + r.rna(s) + "\nRNA': " + r.rna(r.revc(s)));
		
	}

}
