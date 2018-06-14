package alinhamento_sequencias;

public class Alinhamento {
	
	private int[][] matriz;
	private Input input;

	
	public Alinhamento(String fileName) {
		
		try {
			this.input = new Input(fileName); //fazer set,get
			
			this.setMatriz(input.getS1().length(), input.getS2().length());
			this.inicializaMatriz(input.getS1(), input.getS2(), input.getMatch(), input.getMismatch(), input.getGap());
			this.alinhamentoGlobal();
			
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	private void inicializaMatriz(String s1, String s2, int match, int mismatch, int gap) {
		int diagonal;
		int topo;
		int esquerda;
		
		//[0][0] = 0
		this.matriz[0][0] = 0;
		
		//inicializa linhas
		for(int i=1; i<s1.length()+1; i++) {
			this.matriz[i][0] = this.matriz[i-1][0] + gap;
		}
		
		//inicializa colunas
		for(int j=1; j<s2.length()+1; j++) {
			this.matriz[0][j] = this.matriz[0][j-1] + gap;
		}
		
		//completa matriz
		for(int i=1; i<s1.length()+1; i++) {
			for(int j=1; j<s2.length()+1; j++) {
				
				//diagonal
				diagonal = this.matriz[i-1][j-1] + this.score(s1.charAt(i-1), s2.charAt(j-1), match, mismatch);
				//topo
				topo = this.matriz[i-1][j] + gap;
				//esquerda
				esquerda = this.matriz[i][j-1] + gap;
				
				//Máximo
				this.matriz[i][j] = Math.max(diagonal, Math.max(topo, esquerda));
			}
		}
	}
	
	public void alinhamentoGlobal() {
		String s1Final = "";
		String s2Final = "";
		
		for(int i=input.getS1().length(); i>0; i--) {
			for(int j=input.getS2().length(); j>0; j--) {
				
				if(i > 0 && j > 0) {
					if(matriz[i][j] == (matriz[i-1][j-1] + score(input.getS1().charAt(i-1), input.getS2().charAt(j-1), input.getMatch(), input.getMismatch()))) {
						s1Final += input.getS1().charAt(i-1);
						s2Final += input.getS2().charAt(j-1);
						i--;
					} else if(matriz[i][j] == (matriz[i-1][j] + input.getGap())) {
						s1Final += input.getS1().charAt(i-1);
						s2Final += "-";
					} else if(matriz[i][j] == (matriz[i][j-1] + input.getGap())) {
						s1Final += "-";
						s2Final += input.getS2().charAt(j-1);
					}					
				}
				
			}
		}
		//reverter
		System.out.println(s1Final + "\n" + s2Final);
	}
	
	private int score(char c1, char c2, int match, int mismatch) {
		if(c1 == c2)
			return match;
		else 
			return mismatch;
	}

	public int[][] getMatriz() {
		return matriz;
	}

	public void setMatriz(int s1, int s2) {
		this.matriz = new int[s1+1][s2+1];
	}
	
	public Input getInput() {
		return this.input;
	}
	
}
