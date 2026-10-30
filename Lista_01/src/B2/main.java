package B2;

public class main {

	public static void main(String[] args) {
		soma somar = new soma(10,20);
		somar.soma();
		
		System.out.println();
		
		subtracao subtrair = new subtracao (10 , 2);
		subtrair.subtracao();
		
		System.out.println();
		
		multiplicacao multriplicar = new multiplicacao (5,5);
		multriplicar.multiplicacao();
		
		System.out.println();
		
		divisao dividir = new divisao (100,5);
		dividir.divisao();
	}

}
