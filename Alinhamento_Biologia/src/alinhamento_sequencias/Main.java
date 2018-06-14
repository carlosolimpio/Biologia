package alinhamento_sequencias;

public class Main {

	public static void main(String[] args) {
		
		try {			
			Alinhamento a = new Alinhamento("input.txt");
			
			for(int i=0; i<a.getInput().getS1().length()+1; i++) {
				for(int j=0; j<a.getInput().getS2().length()+1; j++) {
					System.out.print(a.getMatriz()[i][j] + " ");
				}
				System.out.println();
			}
			
			System.out.println();
			System.out.println(a.getAlinhamentoOtimo() + "\n");
			System.out.println(a.alinhamentoGlobal());
			
		} catch(Exception e) {
			e.printStackTrace();
		}
		
	}

}
