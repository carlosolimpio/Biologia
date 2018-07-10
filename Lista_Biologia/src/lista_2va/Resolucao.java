package lista_2va;

public class Resolucao {
	
	private String input;
	
	public Resolucao(String input) {
		this.setInput(input);
	}
	
	//http://rosalind.info/problems/dna/
	public String DNA() {
		int a = 0, c = 0, g = 0, t = 0;
		
		for(int i=0; i<input.length(); i++) {
			switch(input.charAt(i)) {
			case 'A':
				a++;
				break;
			case 'C':
				c++;
				break;
			case 'G':
				g++;
				break;
			case 'T':
				t++;
				break;
			}
		}
		
		return a + " " + c + " " + g + " " + t + " ";
	}
	
	//http://rosalind.info/problems/rna/
	
	
	public void setInput(String input) {
		this.input = input;
	}
	
	public String getInput() {
		return this.input;
	}
}
