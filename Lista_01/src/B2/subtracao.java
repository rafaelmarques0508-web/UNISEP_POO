package B2;

public class subtracao extends Calculadora {
	
	public subtracao(double valor1, double valor2) {
		super(valor1, valor2);
	}
	public void subtracao() {
		super.subtracao();
		double resultado = valor1 - valor2;
		System.out.println("RESULTADO DA SUBTRACAO: " + resultado );
	}

}
