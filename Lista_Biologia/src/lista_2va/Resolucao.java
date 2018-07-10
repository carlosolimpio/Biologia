package lista_2va;

public class Resolucao {
	
	private String input;
	
	public Resolucao(String input) {
		this.setInput(input);
	}
	
	//http://rosalind.info/problems/dna/
	public String dna() {
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
	public String rna() {
		
		return this.getInput().replace('T', 'U');
	}
	
	//http://rosalind.info/problems/revc/
	public String revc() {
		char[] out = this.getInput().toCharArray();
		
		for(int i=0; i<out.length; i++) {
			switch(out[i]) {
			case 'A':
				out[i] = 'T';
				break;
			case 'C':
				out[i] = 'G';
				break;
			case 'G':
				out[i] = 'C';
				break;
			case 'T':
				out[i] = 'A';
				break;
			default:
				break;
			}
		}
		//meio nojento
		return new StringBuilder((new String(out))).reverse().toString();
	}
	
	//http://rosalind.info/problems/hamm/
	
	
	//http://rosalind.info/problems/prot/
	//http://rosalind.info/problems/cons/
	//http://rosalind.info/problems/orf/
	//http://rosalind.info/problems/ksim
	
	public void setInput(String input) {
		this.input = input;
	}
	
	public String getInput() {
		return this.input;
	}
}
