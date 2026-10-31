package funcionariosalario;

public class funcionario {
	String nome;
	double salariobase=1621.00;

	public funcionario (String nome , double salariobase) {
		this.nome = nome;
		this.salariobase = salariobase;
	}
	
	public double calcularsalario() {
		return salariobase;
	}
	
	
	
	public void exibirsalario() {
		System.out.println("nome: " + this.nome);
		System.out.println("salario base: " + this.salariobase);
	}
	


}
