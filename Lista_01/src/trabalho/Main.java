package trabalho;

public class Main {

	public static void main(String[] args) {
		
		
	Time CarazinhoFC = new Time (15, "CarazinhoFC", "paranaense", 55000, "peixe cara");
	
	Time DoisVizinhos = new Time (22, "DoisVizinhos", "sudoestePR", 15000, "frango");
	
	

	
	
		CarazinhoFC.listaTime();
		
		System.out.println();
		
		DoisVizinhos.listaTime();
		
		System.out.println();
		
		CarazinhoFC.setcompeticao("carazinhense");

		System.out.println("Competição: " + CarazinhoFC.getcompeticao());
		
		System.out.println();
		
		CarazinhoFC.listaTime();
		
	
		
		

	}

}
