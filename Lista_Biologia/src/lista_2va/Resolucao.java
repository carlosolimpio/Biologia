package lista_2va;

import java.util.ArrayList;

public class Resolucao {
	
	//http://rosalind.info/problems/dna/
	public String dna(String input) {
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
	public String rna(String input) {
		return input.replace('T', 'U');
	}
	
	//http://rosalind.info/problems/revc/
	public String revc(String input) {
		char[] out = input.toCharArray();
		
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
		return new StringBuilder((new String(out))).reverse().toString();
	}
	
	//http://rosalind.info/problems/hamm/
	public int hamm(String s, String t) {
		int r = 0;
		
		if(s.length() == t.length()) {
			for(int i=0; i<s.length(); i++) {
				if(s.charAt(i) != t.charAt(i))
					r++;
			}
		} else
			return -1;
		
		return r;
	}
	
	//http://rosalind.info/problems/prot/
	/**
	 *  UUU F      CUU L      AUU I      GUU V
		UUC F      CUC L      AUC I      GUC V
		UUA L      CUA L      AUA I      GUA V
		UUG L      CUG L      AUG M      GUG V
		UCU S      CCU P      ACU T      GCU A
		UCC S      CCC P      ACC T      GCC A
		UCA S      CCA P      ACA T      GCA A
		UCG S      CCG P      ACG T      GCG A
		UAU Y      CAU H      AAU N      GAU D
		UAC Y      CAC H      AAC N      GAC D
		UAA Stop   CAA Q      AAA K      GAA E
		UAG Stop   CAG Q      AAG K      GAG E
		UGU C      CGU R      AGU S      GGU G
		UGC C      CGC R      AGC S      GGC G
		UGA Stop   CGA R      AGA R      GGA G
		UGG W      CGG R      AGG R      GGG G
	 * 
	 */
	public String prot(String s) {
		String out = "";
		
		for(int i=0; i<s.length(); i+=3) {
			switch(s.substring(i, i+3)) {
			case "UUU":
				out += 'F';
				break;
			case "UUC":
				out += 'F';
				break;
			case "UUA":
				out += 'L';
				break;
			case "UUG":
				out += 'L';
				break;
			case "UCU":
				out += 'S';
				break;
			case "UCC":
				out += 'S';
				break;
			case "UCA":
				out += 'S';
				break;
			case "UCG":
				out += 'S';
				break;
			case "UAU":
				out += 'Y';
				break;
			case "UAC":
				out += 'Y';
				break;
			case "UGU":
				out += 'C';
				break;
			case "UGC":
				out += 'C';
				break;
			case "UGG":
				out += 'W';
				break;
			case "CUU":
				out += 'L';
				break;
			case "CUC":
				out += 'L';
				break;
			case "CUA":
				out += 'L';
				break;
			case "CUG":
				out += 'L';
				break;
			case "CCU":
				out += 'P';
				break;
			case "CCC":
				out += 'P';
				break;
			case "CCA":
				out += 'P';
				break;
			case "CCG":
				out += 'P';
				break;
			case "CAU":
				out += 'H';
				break;
			case "CAC":
				out += 'H';
				break;
			case "CAA":
				out += 'Q';
				break;
			case "CAG":
				out += 'Q';
				break;
			case "CGU":
				out += 'R';
				break;
			case "CGC":
				out += 'R';
				break;
			case "CGA":
				out += 'R';
				break;
			case "CGG":
				out += 'R';
				break;
			case "AUU":
				out += 'I';
				break;
			case "AUC":
				out += 'I';
				break;
			case "AUA":
				out += 'I';
				break;
			case "AUG":
				out += 'M';
				break;
			case "ACU":
				out += 'T';
				break;
			case "ACC":
				out += 'T';
				break;
			case "ACA":
				out += 'T';
				break;
			case "ACG":
				out += 'T';
				break;
			case "AAU":
				out += 'N';
				break;
			case "AAC":
				out += 'N';
				break;
			case "AAA":
				out += 'K';
				break;
			case "AAG":
				out += 'K';
				break;
			case "AGU":
				out += 'S';
				break;
			case "AGC":
				out += 'S';
				break;
			case "AGA":
				out += 'R';
				break;
			case "AGG":
				out += 'R';
				break;
			case "GUU":
				out += 'V';
				break;
			case "GUC":
				out += 'V';
				break;
			case "GUA":
				out += 'V';
				break;
			case "GUG":
				out += 'V';
				break;
			case "GCU":
				out += 'A';
				break;
			case "GCC":
				out += 'A';
				break;
			case "GCA":
				out += 'A';
				break;
			case "GCG":
				out += 'A';
				break;
			case "GAU":
				out += 'D';
				break;
			case "GAC":
				out += 'D';
				break;
			case "GAA":
				out += 'E';
				break;
			case "GAG":
				out += 'E';
				break;
			case "GGU":
				out += 'G';
				break;
			case "GGC":
				out += 'G';
				break;
			case "GGA":
				out += 'G';
				break;
			case "GGG":
				out += 'G';
				break;
			default:
				i = s.length();
				break;
			}
		}
		return out;
	}
	
	//http://rosalind.info/problems/cons/
	
	
	
	//http://rosalind.info/problems/orf/
	public ArrayList<String> orf(String s) {
		ArrayList<String> out = new ArrayList<String>();
		String rna = this.rna(s);
		
		//rna
		for(int i=0; i<rna.length()-2; i++) {
			if(rna.substring(i, i+3).equals("AUG")) {
				String sub = rna.substring(i, rna.length());
				String aux = rna.substring(i, i+3);
				i += 3;
				for(int j=3; j<sub.length()-2; j+=3) {
					if(!sub.substring(j, j+3).equals("UAG")
							&& !sub.substring(j, j+3).equals("UGA")
							&& !sub.substring(j, j+3).equals("UAA")) {
						aux += sub.substring(j, j+3);
					} else {
						if(!out.contains(aux))
							out.add(aux);
						break;
					}
				}
			}
		}
		
		//complemento rna
		String rRna = this.rna(this.revc(s));
		
		for(int i=0; i<rRna.length()-2; i++) {
			if(rRna.substring(i, i+3).equals("AUG")) {
				String sub = rRna.substring(i, rna.length());
				String aux = rRna.substring(i, i+3);
				i += 3;
				for(int j=3; j<sub.length()-2; j+=3) {
					if(!sub.substring(j, j+3).equals("UAG")
							&& !sub.substring(j, j+3).equals("UGA")
							&& !sub.substring(j, j+3).equals("UAA")) {
						aux += sub.substring(j, j+3);
					} else {
						if(!out.contains(aux))
							out.add(aux);
						break;
					}
				}
			}
		}
		return out;
	}
	
	//http://rosalind.info/problems/ksim
	
	/**
	public void setInput(String input) {
		this.input = input;
	}
	
	public String getInput() {
		return this.input;
	}
	**/
}
