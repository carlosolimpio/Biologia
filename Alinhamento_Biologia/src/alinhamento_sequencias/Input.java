package alinhamento_sequencias;

import java.io.FileReader;
import java.util.Scanner;

public class Input {
	
	private int match;		//A
	private int mismatch;	//M
	private int gap;		//G
	private String s1;
	private String s2;
	
	public Input(String file) throws Exception {
		this.trataArquivo(file);
	}
	
	private void trataArquivo(String fileName) throws Exception {
		
		Scanner scan = new Scanner(new FileReader(fileName));
		int i = 0;
		while(scan.hasNext()) {
			String linha = scan.nextLine();
			if(i == 0) {
				String[] linha1 = linha.split(" ");
				this.setMatch(Integer.parseInt(linha1[0]));
				this.setMismatch(Integer.parseInt(linha1[1]));
				this.setGap(Integer.parseInt(linha1[2]));
			} else if(i == 1)
				this.setS1(linha);
			  else
				this.setS2(linha);
			
			i++;
		}
		
		scan.close();		
	}
	
	public int getMatch() {
		return match;
	}

	public void setMatch(int match) throws Exception {
		if(match >= 1 && match <= 100)
			this.match = match;
		else
			throw new Exception("Erro na leitura do arquivo!");
	}

	public int getMismatch() {
		return mismatch;
	}

	public void setMismatch(int mismatch) throws Exception {
		if(mismatch >= -100)
			this.mismatch = mismatch;
		else
			throw new Exception("Erro na leitura do arquivo!");
	}

	public int getGap() {
		return gap;
	}

	public void setGap(int gap) throws Exception {
		if(gap <= -1)
			this.gap = gap;
		else
			throw new Exception("Erro na leitura do arquivo!");
	}

	public String getS1() {
		return s1;
	}

	public void setS1(String s1) throws Exception {
		if(validaSequencia(s1))
			this.s1 = s1;
	}

	public String getS2() {
		return s2;
	}

	public void setS2(String s2) throws Exception {
		if(validaSequencia(s2))
			this.s2 = s2;
	}
	
	private boolean validaSequencia(String s) throws Exception {
		boolean r = false;
		
		s = s.toUpperCase();
		
		if(s.length() >= 2 && s.length() <= 50) {
			for(int i=0; i<s.length(); i++) {
				if(s.charAt(i) == 'A' || s.charAt(i) == 'C' || s.charAt(i) == 'G' || s.charAt(i) == 'T')
					r = true;
				else
					throw new Exception("Alfabeto inválido!");
			}
		}
		
		return r;
	}
}
